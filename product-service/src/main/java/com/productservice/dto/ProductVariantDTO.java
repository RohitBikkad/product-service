package com.productservice.dto;

import java.util.Set;

public class ProductVariantDTO {

    private Long id;
    private String sku;
    private Long productId;
    private Set<PriceDTO> price;
    
    
    
    
	public Set<PriceDTO> getPrice() {
		return price;
	}
	public void setPrice(Set<PriceDTO> price) {
		this.price = price;
	}
	public ProductVariantDTO() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	

    
}
