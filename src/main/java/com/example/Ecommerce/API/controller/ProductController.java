package com.example.Ecommerce.API.controller;

import com.example.Ecommerce.API.model.Product;
import com.example.Ecommerce.API.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("products")
    public List<Product> gelAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping(params = "category")
    public List<Product> getProductsByCategory(@RequestParam String category){
        return productService.getProductByCategory(category);
    }

    @GetMapping("product/{id}")
    public Optional<Product> getProductsById(@PathVariable Integer id){
        return productService.getProductById(id);
    }

    @PostMapping("productC")
    public Product createProduct(Product product){
        return productService.createProduct(product);
    }

    @DeleteMapping("productD")
    public void deleteProductById(Integer id){
        productService.deleteProductById(id);
    }


}
