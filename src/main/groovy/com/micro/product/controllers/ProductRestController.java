package com.micro.product.controllers;

import com.micro.product.model.Product;
import com.micro.product.repos.ProductRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product-api")
@RequiredArgsConstructor
public class ProductRestController {

    private final ProductRepo repo;

    @PostMapping("/products")
    public Product create(@RequestBody Product product) {
        return repo.save(product);
    }

    @GetMapping("/products/{name}")
    public Product getProductByName(@PathVariable("name") String name){
        return repo.findByName(name);
    }
}
