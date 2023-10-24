package com.turkcell.productservice.services;

import com.turkcell.productservice.dto.requests.CreateProductRequest;
import com.turkcell.productservice.dto.responses.CreatedProductResponse;
import com.turkcell.productservice.entities.Product;
import com.turkcell.productservice.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductManager implements ProductService{
    private final ProductRepository productRepository;

    @Override
    public CreatedProductResponse add(CreateProductRequest request) {
        Product product = Product
                .builder()
                .name(request.getName())
                .price(request.getPrice())
                .description(request.getDescription())
                .stock(request.getStock())
                .inventoryCode(request.getInventoryCode())
                .build();

        product = productRepository.save(product);

        CreatedProductResponse response = CreatedProductResponse
                .builder()
                .id(product.getId())
                .name(product.getName())
                .build();
        return response;
    }

    @Override
    public Boolean getByInventoryCode(String code, int requiredStock) {
        // Direkt query çalıştırmak
        /* List<Product> allProducts = productRepository.findAll();
        Optional<Product> product = allProducts
                .stream()
                .filter((p) -> p.getInventoryCode().equals(code))
                .findFirst(); */
        Product product = productRepository.findByInventoryCodeQuery(code);
        if(product==null || product.getStock() < requiredStock)
            return false;
        return true;
    }
}
