package com.nttdata.productservice.bussiness.service.impl;

import com.nttdata.productservice.bussiness.repository.IBusinessRepository;
import com.nttdata.productservice.bussiness.service.IBusinessService;
import io.reactivex.rxjava3.core.Single;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.math.BigDecimal;

@Service
public class BusinessService implements IBusinessService {

    @Autowired
    private IBusinessRepository iBusinessRepository;

    @Override
    public Single<BigDecimal> getBalances() {
       return iBusinessRepository.getBalances();
    }
}
