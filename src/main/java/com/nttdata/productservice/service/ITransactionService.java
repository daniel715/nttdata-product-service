package com.nttdata.productservice.service;

import com.nttdata.productservice.model.Product;
import com.nttdata.productservice.model.Transaction;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Single;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ITransactionService {

    //save
    Single<Transaction> saveTransaction(Single<Transaction> transaction);

    // read operation
    Flowable<Transaction> list();

    Single<Transaction> findById(String id);

    // update operation
    Single<Transaction> updateTransaction(Maybe<Transaction> transaction, String transactionId);

    // delete operation
    Completable deleteTransaction(String productId);
}
