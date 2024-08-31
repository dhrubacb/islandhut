package com.islandhut.productservice.service;

import com.islandhut.productservice.entity.ProductEntity.ProductEntity;

import java.util.List;

public interface ProductService {
    List<ProductEntity> findAll();
}
