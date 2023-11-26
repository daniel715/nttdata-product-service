package com.nttdata.productservice.controller;

import com.nttdata.productservice.model.Product;
import com.nttdata.productservice.service.IProductService;
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
    public Flux<Product> findProducts() {
    	return productService.list();
    }

    @RequestMapping(value ="/find/{id}" , produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Mono<Product> findProducts(@PathVariable String id) {
        return productService.findById(id);
    }

    @PostMapping(value = "/save")
    public Mono<Product> saveProduct(@RequestBody Mono<Product> productMono ){
        return productService.saveProduct(productMono);
    }

    @PutMapping(value = "/update/{id}")
    public Mono<Product> updateProduct(@RequestBody Mono<Product> productMono, @PathVariable String id){
        return productService.updateProduct(productMono, id);
    }

    @DeleteMapping("/delete/{id}")
    public Mono<Void> deleteProduct(@PathVariable String id){
        return productService.deleteProduct(id);
    }
}
