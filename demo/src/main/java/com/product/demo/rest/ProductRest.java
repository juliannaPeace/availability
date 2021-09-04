package com.product.demo.rest;

import com.product.demo.dto.ProductDto;
import com.product.demo.entities.Product;
import com.product.demo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductRest {

    @Autowired
    private ProductService productService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody ProductDto productDto) {
        var productSave = productService.save(productDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/list")
    public ResponseEntity<List<Product>> listAll() {
        return ResponseEntity.ok(productService.listAll());
    }
}
