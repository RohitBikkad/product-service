package com.productservice.controller;

import org.modelmapper.ModelMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.productservice.dto.ProductCategoryDTO;
import com.productservice.service.ProductCategoryService;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class ProductCategoryController {
    
    @Autowired
    private ProductCategoryService productCategoryService;

    @Autowired
    private ModelMapper modelMapper;
    

    public ProductCategoryController(ProductCategoryService productCategoryService, ModelMapper modelMapper) {
		super();
		this.productCategoryService = productCategoryService;
		this.modelMapper = modelMapper;
	}

	@PostMapping
    public ResponseEntity<ProductCategoryDTO> createCategory(@RequestBody ProductCategoryDTO categoryDTO) {
        ProductCategoryDTO savedCategory = productCategoryService.saveCategory(categoryDTO);
        return new ResponseEntity<>(savedCategory, HttpStatus.CREATED);
    }


    @GetMapping
    public ResponseEntity<List<ProductCategoryDTO>> getAllCategories() {
        List<ProductCategoryDTO> categoryDTOList = productCategoryService.getAllCategories();
        return new ResponseEntity<>(categoryDTOList, HttpStatus.OK);
    }

    
}
