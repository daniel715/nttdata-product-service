package com.nttdata.productservice.service;

import com.nttdata.productservice.model.Product;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IProductService {

    Mono<Product> saveProduct(Mono<Product> product);

    // read operation
    Flux<Product> list();

    Mono<Product> findById(String id);

    // update operation
    Mono<Product> updateProduct(Mono<Product> product, String productId);

    // delete operation
    Mono<Void> deleteProduct(String productId);

}
