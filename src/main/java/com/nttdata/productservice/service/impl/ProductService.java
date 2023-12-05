package com.nttdata.productservice.service.impl;

import com.nttdata.productservice.repository.ProductMongoRepository;
import com.nttdata.productservice.model.Product;
import com.nttdata.productservice.service.IProductService;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Single;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public class ProductService implements IProductService {

    @Autowired
    private ProductMongoRepository productRepository;

    @Override
    public Flowable<Product> list() {
        return this.productRepository.findAll();
    }

    @Override
    public Single<Product> findById(String id) {
        return this.productRepository.findById(id).toSingle();
    }

    @Override
    public Single<Product> saveProduct(Single<Product> product) {
        return product.flatMap(productRepository::save);
    }

    @Override
    public Single<Product> updateProduct(Maybe<Product> product, String productId) {
        return productRepository.findById(productId)
                .flatMap(p -> product)
                .doOnSuccess(e -> e.set_id(productId)).toSingle()
                .flatMap(productRepository::save);
    }

    @Override
    public Completable deleteProduct(String productId) {
        return productRepository.deleteById(productId);
    }

}
