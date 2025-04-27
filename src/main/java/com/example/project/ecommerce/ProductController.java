package com.example.project.ecommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/products")
@CrossOrigin
public class ProductController {
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getAllProducts(@RequestParam(required = false) String search) {
        return productService.getAllProducts(search);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public String addProduct(@RequestBody Product product) {
        productService.addProduct(product);
        return "Product added successfully";
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable int id) {
        if (productService.deleteProduct(id)) {
            return "Product deleted successfully";
        }
        return "Product not found";
    }
}


