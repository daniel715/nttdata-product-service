package com.example.reactiveservice.repository;

import com.example.reactiveservice.model.Product;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface ProductMongoRepository extends ReactiveMongoRepository<Product, String> {}
