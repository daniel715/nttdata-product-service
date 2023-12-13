package com.nttdata.productservice.bussiness.repository;

import io.reactivex.rxjava3.core.Single;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

public interface IBusinessRepository {


    Single<BigDecimal> getBalances();
}
