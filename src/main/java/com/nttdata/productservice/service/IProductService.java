package com.nttdata.productservice.service;

import com.nttdata.productservice.model.Product;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Single;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IProductService {

    Single<Product> saveProduct(Single<Product> product);

    // read operation
    Flowable<Product> list();

    Single<Product> findById(String id);

    // update operation
    Single<Product> updateProduct(Maybe<Product> product, String productId);

    // delete operation
    Completable deleteProduct(String productId);

}
