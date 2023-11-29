package com.nttdata.productservice.bussiness.service.impl;

import com.nttdata.productservice.bussiness.service.IBusinessService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.math.BigDecimal;

@Service
public class BusinessService implements IBusinessService {
    @Override
    public Mono<BigDecimal> getBalances() {
       return null;// return BigDecimal.valueOf(23.1);
    }
}
