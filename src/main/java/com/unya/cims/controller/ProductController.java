package com.unya.cims.controller;

import com.unya.cims.entity.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductController {


    @GetMapping("/product")
    public ResponseEntity<String> fetchAllProducts() {
        return new ResponseEntity<String>(HttpStatus.OK);
    }

    @GetMapping("/products/{id}/")
    public ResponseEntity<String> getProductById(@PathVariable String id) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping(value = "/product", consumes = "application/json", produces = "application/json")
    public Product createProduct(@RequestBody Product product) {
        return product;
    }
    @DeleteMapping("/product/{id}")
    public ResponseEntity<String> deleteProductById(@PathVariable String id) {
        return new ResponseEntity<>(HttpStatus.OK);
    }


/*    @PostConstruct
    public void persistData() {
        productService.saveAll(Stream.of("sugar 120 50 25", "milk 60 40 15", "salt 20 20 5", "Coffee 340 10 5", "Honey 420 10 5")
                .map(item -> {String[] items = item.split(" ");
                    Product product = new Product();
                    product.setDescription(items[0]);
                    product.setPrice(Double.parseDouble(items[1]));
                    product.setQuantityOnHand(Integer.parseInt(items[2]));
                    product.setReorderLevel(Integer.parseInt(items[3]));

                    return product;
                }).collect(Collectors.toList())
        );
    }*/
}
