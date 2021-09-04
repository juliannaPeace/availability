package com.product.demo.services;

import com.product.demo.dto.ProductDto;
import com.product.demo.entities.Product;
import com.product.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product save(ProductDto productDto) {

        var product = new Product(UUID.randomUUID(), productDto.getName(), productDto.getPrice(),
                productDto.getDescription());

        return productRepository.save(product);
    }

    public List<Product> listAll() {
        return productRepository.findAll();
    }
}
