package com.nttdata.productservice.repository;

import com.nttdata.productservice.model.Product;

import org.springframework.data.repository.reactive.RxJava3CrudRepository;

public interface ProductMongoRepository extends RxJava3CrudRepository<Product, String> {}
