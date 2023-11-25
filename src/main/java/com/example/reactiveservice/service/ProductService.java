package com.example.reactiveservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductService{

    @Autowired
    private ProductRepository productRepository;

    public Flux<Product> getAll(){
       return this.productRepository.findAll();
    }

    public Mono<Product> findById(String id){
        return this.productRepository.findById(id);
    }

}
