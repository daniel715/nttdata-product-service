package com.nttdata.productservice.service.impl;

import com.nttdata.productservice.model.Transaction;
import com.nttdata.productservice.repository.TransactionMongoRepository;
import com.nttdata.productservice.service.ITransactionService;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Single;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class TransactionService implements ITransactionService {

    @Autowired
    TransactionMongoRepository transactionMongoRepository;

    @Override
    public Flowable<Transaction> list() {
        return transactionMongoRepository.findAll();
    }
    @Override
    public Single<Transaction> findById(String id) {
        return transactionMongoRepository.findById(id).toSingle();
    }
    @Override
    public Single<Transaction> saveTransaction(Single<Transaction> transaction) {
        return transaction.flatMap(transactionMongoRepository::save);
    }
    @Override
    public Single<Transaction> updateTransaction(Maybe<Transaction> transaction, String transactionId) {
        return transactionMongoRepository.findById(transactionId)
                .flatMap(p -> transaction)
                .doOnSuccess(e -> e.set_id(transactionId)).toSingle()
                .flatMap(transactionMongoRepository::save);
    }

    @Override
    public Completable deleteTransaction(String transactionId) {
        return transactionMongoRepository.deleteById(transactionId);
    }
}
