package com.productservice.service.impl;

import com.productservice.dto.ProductDTO;
import com.productservice.entities.Product;
import com.productservice.repository.ProductRepository;
import com.productservice.service.ProductService;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public ProductDTO saveProduct(ProductDTO productDTO) {
        // Convert DTO to Entity
        Product product = modelMapper.map(productDTO, Product.class);

        // Save Product entity
        Product savedProduct = productRepository.save(product);

        // Convert Entity back to DTO and return
        return modelMapper.map(savedProduct, ProductDTO.class);
    }

    @Override
    public ProductDTO getProductById(Long id) {
        // Retrieve product from repository
        return productRepository.findById(id)
                .map(product -> modelMapper.map(product, ProductDTO.class))
                .orElse(null);
    }

  
    @Override
    public List<ProductDTO> getAllProducts() {
        // Retrieve all products from repository
        List<Product> productList = productRepository.findAll();

        // Convert each product entity to DTO and collect into a list
        return productList.stream()
                .map(product -> modelMapper.map(product, ProductDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public ProductDTO deleteProduct(Long id) {
        // Retrieve product from repository
        return productRepository.findById(id)
                .map(product -> {
                    // Delete product from repository
                    productRepository.delete(product);
                    // Convert deleted product to DTO and return
                    return modelMapper.map(product, ProductDTO.class);
                })
                .orElse(null);
    }
}
