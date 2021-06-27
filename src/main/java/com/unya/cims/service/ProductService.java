package com.unya.cims.service;

import com.unya.cims.entity.Product;
import com.unya.cims.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public void save(Product product) {
        productRepository.save(product);
    }

    public void delete(Product product) {
        productRepository.delete(product);
    }

    public Optional<Product> getProductById(long id) {
        return productRepository.findById(id);
    }

    public void addNewProduct(Product product) {
        productRepository.save(product);
    }


    public void saveAll(List<Product> products) {
        productRepository.saveAll(products);
    }
}

