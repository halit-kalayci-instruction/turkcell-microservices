package com.turkcell.productservice.services;

import com.turkcell.productservice.dto.requests.CreateProductRequest;
import com.turkcell.productservice.dto.responses.CreatedProductResponse;
import com.turkcell.productservice.entities.Product;

public interface ProductService {
    CreatedProductResponse add(CreateProductRequest request);
    Boolean getByInventoryCode(String code, int requiredStock);
}
