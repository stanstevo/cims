package com.unya.cims.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import com.unya.cims.entity.Product;
import com.unya.cims.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/")
    public String homePage() {
        return "index";
    }

    @RequestMapping("/product")
    public String getAllProducts(Model model) {
        model.addAttribute("products", productService.getAllProducts());
        return "product";
    }

/*     @RequestMapping("/products")
    public String home(Model model) {
        List<Product> products = productService.getAllProducts();
        model.addAttribute("products", products);
        return "home";
    } */

    @RequestMapping("/productId")
    @ResponseBody
    public Optional<Product> getProductById(Integer id) {

        return productService.getProductById(id);
        
    }

    @PostMapping(value="/addNew")
    public String addNewProduct(Product product) {
	    productService.addNewProduct(product);
    	return "redirect:/products";
    }

    @RequestMapping(value = "/update", method = { RequestMethod.PUT, RequestMethod.GET })
    public String updateProduct(Product product) {
        productService.save(product);
        return "redirect:/products";
    }
}

/*
    @RequestMapping("/saveProduct")
    public String saveProduct(Product product) {
        productService.save(product);
        return "home";
    }


    @RequestMapping("/home")
    public String showProducts(Model model) {
        model.addAttribute("products", productService.getAllProducts());
        return "home";
    }
    
    @GetMapping("/add")
    public String showSignUpForm(Product product) {
        return "add_product";
    }

    @PostMapping("/update/{id}")
    public String updateProduct(@PathVariable("id") long id, @Valid Product product, BindingResult result,
            Model model) {
        if (result.hasErrors()) {
            product.setId(id);
            return "update_product";
        }
        productService.save(product);
        return "redirect:/home";
    }

    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable("id") long id, Model model) {
        Product user = productService.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid product Id:" + id));
        productService.delete(user);
        return "redirect:/home";
    }

    @GetMapping("/edit/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        Product product = productService.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid product Id:" + id));

        model.addAttribute("product", product);
        return "update_product";
    }*/
