package com.nttdata.productservice.controller;

import com.nttdata.productservice.model.Product;
import com.nttdata.productservice.service.IProductService;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Single;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/products")
public class ProductRestController {

	@Autowired
    private IProductService productService;

    @RequestMapping(value ="/list" , produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flowable<Product> findProducts() {
    	return productService.list();
    }

    @RequestMapping(value ="/find/{id}" , produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Single<Product> findProducts(@PathVariable String id) {
        return productService.findById(id);
    }

    @PostMapping(value = "/save")
    public Single<Product> saveProduct(@RequestBody Single<Product> productMono ){
        return productService.saveProduct(productMono);
    }

    @PutMapping(value = "/update/{id}")
    public Single<Product> updateProduct(@RequestBody Maybe<Product> productMono, @PathVariable String id){
        return productService.updateProduct(productMono, id);
    }

    @DeleteMapping("/delete/{id}")
    public Completable deleteProduct(@PathVariable String id){
        return productService.deleteProduct(id);
    }
}
