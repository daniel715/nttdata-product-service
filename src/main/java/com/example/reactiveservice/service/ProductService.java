package com.example.reactiveservice.service;

import com.example.reactiveservice.repository.ProductMongoRepository;
import com.example.reactiveservice.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductService implements IProductService{

    @Autowired
    private ProductMongoRepository productRepository;

    @Override
    public Flux<Product> list() {
        return this.productRepository.findAll();

    }

    @Override
    public Mono<Product> findById(String id) {
        return this.productRepository.findById(id);
    }

    @Override
    public Mono<Product> saveProduct(Mono<Product> product) {
        return product.flatMap(productRepository::insert);
    }

    @Override
    public Mono<Product> updateProduct(Mono<Product> product, String productId) {
        return productRepository.findById(productId)
                .flatMap(p -> product)
                .doOnNext(e -> e.setId(productId))
                .flatMap(productRepository::save);
    }

    @Override
    public Mono<Void> deleteProduct(String productId) {
        return productRepository.deleteById(productId);
    }

}
