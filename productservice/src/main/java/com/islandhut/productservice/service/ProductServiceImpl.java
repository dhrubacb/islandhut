package com.islandhut.productservice.service;

import com.islandhut.productservice.entity.ProductEntity.ProductEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    List<ProductEntity> products = List.of(new ProductEntity(1, "1"), new ProductEntity(2, "2"), new ProductEntity(3, "3"));

    @Override
    public List<ProductEntity> findAll() {
        return products;
    }
}
