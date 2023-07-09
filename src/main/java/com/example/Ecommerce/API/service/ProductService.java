package com.example.Ecommerce.API.service;

import com.example.Ecommerce.API.model.Product;
import com.example.Ecommerce.API.repository.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    IProductRepo iProductRepo;

    public List<Product> getAllProducts() {
        return iProductRepo.findAll();
    }


    public Optional<Product> getProductById(Integer id) {
        return iProductRepo.findById(id);
    }

    public Product createProduct(Product product) {
        return iProductRepo.save(product);
    }

    public void deleteProductById(Integer id) {
        iProductRepo.deleteById(id);
    }

    public List<Product> getProductByCategory(String category) {
        return iProductRepo.findByCategory(category);
    }
}
