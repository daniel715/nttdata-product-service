package com.nttdata.productservice.bussiness.controller;


import com.nttdata.productservice.bussiness.service.IBusinessService;
import com.nttdata.productservice.model.Product;
import com.nttdata.productservice.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.math.BigDecimal;

@RestController
@RequestMapping("/bussiness")
public class BusinessController {


    @Autowired
    private IBusinessService iBusinessService;

    @RequestMapping(value ="/list" , produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Mono<BigDecimal> getBalances() {
        return iBusinessService.getBalances();
    }



}
