package com.nttdata.productservice.bussiness.service;

import reactor.core.publisher.Mono;

import java.math.BigDecimal;

public interface IBusinessService {

    Mono<BigDecimal> getBalances();
}
