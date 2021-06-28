package com.unya.cims.controller;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.unya.cims.entity.Product;
import com.unya.cims.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.PostConstruct;

@Controller
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public String fetchProducts(Model model) {

        model.addAttribute("product", productService.getAllProducts());
        return "home";

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
