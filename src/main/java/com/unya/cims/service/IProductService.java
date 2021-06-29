package com.unya.cims.service;

import com.unya.cims.entity.Product;

public interface IProductService {
    Product fetchByID(int id);
}
