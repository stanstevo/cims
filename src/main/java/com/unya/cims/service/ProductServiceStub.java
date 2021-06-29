package com.unya.cims.service;

import com.unya.cims.entity.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceStub implements IProductService{

    @Override
    public Product fetchByID(int id) {
        Product product = new Product();
        product.setId(3L);
        product.setDescription("Sugar");
        return product;
    }
}
