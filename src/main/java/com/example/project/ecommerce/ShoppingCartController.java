package com.example.project.ecommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@RestController
@RequestMapping("/cart")
@CrossOrigin
public class ShoppingCartController {
    private final List<Product> cartItems = new CopyOnWriteArrayList<>();
    private final ProductService productService;

    @Autowired
    public ShoppingCartController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/add")
    public String addToCart(@RequestBody Product product) {
        Product fullProduct = productService.getProductById(product.getId());
        if (fullProduct != null) {
            cartItems.add(fullProduct);
            return fullProduct.getName() + " added to cart.";
        }
        return "Product not found.";
    }

    @DeleteMapping("/remove")
    public String removeFromCart(@RequestBody Product product) {
        cartItems.removeIf(item -> item.getId() == product.getId());
        return "Item removed from cart.";
    }

    @GetMapping
    public List<Product> viewCart() {
        // Remove any products from cart that no longer exist in the product list
        cartItems.removeIf(item -> productService.getProductById(item.getId()) == null);
        return cartItems;
    }
}

