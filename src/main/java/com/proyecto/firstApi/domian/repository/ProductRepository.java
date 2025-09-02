package com.proyecto.firstApi.domian.repository;

import java.util.Optional;
import java.util.List;

import com.proyecto.firstApi.domian.Product;

public interface ProductRepository {
    List<Product> getAll();
    Optional<List<Product>> getByCategory(int categoryId);
    Optional<List<Product>> getScarseProducts(int quantity);
    Optional<Product> getProduct(int productId);
    Product save(Product product);
    void delete(int productId);
}
