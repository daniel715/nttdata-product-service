package com.nttdata.productservice.repository;

import com.nttdata.productservice.model.Product;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface ProductMongoRepository extends ReactiveMongoRepository<Product, String> {}
