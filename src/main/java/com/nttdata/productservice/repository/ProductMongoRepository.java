package com.nttdata.productservice.repository;

import com.nttdata.productservice.model.Product;

import io.reactivex.rxjava3.core.Flowable;
import org.springframework.data.repository.reactive.RxJava3CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductMongoRepository extends RxJava3CrudRepository<Product, String> {
}
