package com.nttdata.productservice.bussiness.service;

import io.reactivex.rxjava3.core.Single;

import java.math.BigDecimal;

public interface IBusinessService {

    Single<BigDecimal> getBalances();
}
