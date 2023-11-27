package com.nttdata.productservice.repository;

import com.nttdata.productservice.model.Transaction;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionMongoRepository extends ReactiveMongoRepository<Transaction,String> {
}
