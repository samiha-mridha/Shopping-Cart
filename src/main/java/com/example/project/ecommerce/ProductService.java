package com.example.project.ecommerce;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

@Service
public class ProductService {
    private final List<Product> productList = new CopyOnWriteArrayList<>();
    private final AtomicInteger idCounter = new AtomicInteger(1);

    public List<Product> getAllProducts(String search) {
        if (search != null && !search.trim().isEmpty()) {
            return productList.stream()
                .filter(p -> p.getName().toLowerCase().contains(search.toLowerCase()))
                .collect(Collectors.toList());
        }
        return productList;
    }

    public Product addProduct(Product product) {
        Product newProduct = new Product(idCounter.getAndIncrement(), product.getName(), product.getPrice());
        productList.add(newProduct);
        return newProduct;
    }

    public boolean deleteProduct(int id) {
        return productList.removeIf(product -> product.getId() == id);
    }

    public Product getProductById(int id) {
        return productList.stream()
            .filter(p -> p.getId() == id)
            .findFirst()
            .orElse(null);
    }
}