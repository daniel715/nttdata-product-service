package com.nttdata.productservice.repository;

import com.nttdata.productservice.model.Transaction;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.repository.reactive.RxJava3CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionMongoRepository extends RxJava3CrudRepository<Transaction,String> {
}
