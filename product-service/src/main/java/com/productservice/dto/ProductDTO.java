package com.productservice.dto;

import java.util.Set;

public class ProductDTO {
	
	private Long id;
    private String productKey;
    private String productName;
    private String productDescription;
    private Set<ProductVariantDTO> variants;
    
    
	public ProductDTO(Long id, String productKey, String productName, String productDescription,
			Set<ProductVariantDTO> variants) {
		super();
		this.id = id;
		this.productKey = productKey;
		this.productName = productName;
		this.productDescription = productDescription;
		this.variants = variants;
	}
	public ProductDTO() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProductKey() {
		return productKey;
	}
	public void setProductKey(String productKey) {
		this.productKey = productKey;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public Set<ProductVariantDTO> getVariants() {
		return variants;
	}
	public void setVariants(Set<ProductVariantDTO> variants) {
		this.variants = variants;
	}
	
	
    
    

}
