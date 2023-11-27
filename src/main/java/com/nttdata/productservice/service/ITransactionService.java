package com.nttdata.productservice.service;

import com.nttdata.productservice.model.Product;
import com.nttdata.productservice.model.Transaction;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ITransactionService {

    //save
    Mono<Transaction> saveTransaction(Mono<Transaction> transaction);

    // read operation
    Flux<Transaction> list();

    Mono<Transaction> findById(String id);

    // update operation
    Mono<Transaction> updateTransaction(Mono<Transaction> transaction, String transactionId);

    // delete operation
    Mono<Void> deleteTransaction(String productId);
}
