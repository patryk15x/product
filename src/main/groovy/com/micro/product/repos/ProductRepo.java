package com.micro.product.repos;

import com.micro.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Long> {
    Product findByName(String name);
}
