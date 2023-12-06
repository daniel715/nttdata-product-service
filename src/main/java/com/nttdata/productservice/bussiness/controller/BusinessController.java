package com.nttdata.productservice.bussiness.controller;


import com.nttdata.productservice.bussiness.service.IBusinessService;
import io.reactivex.rxjava3.core.Single;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/bussiness")
public class BusinessController {


    @Autowired
    private IBusinessService iBusinessService;

    @RequestMapping(value ="/getbalances" , produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Single<BigDecimal> getBalances() {
        return iBusinessService.getBalances();
    }



}
