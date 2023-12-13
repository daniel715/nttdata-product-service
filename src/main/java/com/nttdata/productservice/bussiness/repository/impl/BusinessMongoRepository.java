package com.nttdata.productservice.bussiness.repository.impl;

import com.nttdata.productservice.bussiness.repository.IBusinessRepository;
import io.reactivex.rxjava3.core.Single;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public class BusinessMongoRepository implements IBusinessRepository {
    @Override
    public Single<BigDecimal> getBalances() {
        return null;
    }
}
