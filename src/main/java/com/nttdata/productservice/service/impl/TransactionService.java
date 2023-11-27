package com.nttdata.productservice.service.impl;

import com.nttdata.productservice.model.Transaction;
import com.nttdata.productservice.repository.TransactionMongoRepository;
import com.nttdata.productservice.service.ITransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class TransactionService implements ITransactionService {

    @Autowired
    TransactionMongoRepository transactionMongoRepository;

    @Override
    public Flux<Transaction> list() {
        return transactionMongoRepository.findAll();
    }
    @Override
    public Mono<Transaction> findById(String id) {
        return transactionMongoRepository.findById(id);
    }
    @Override
    public Mono<Transaction> saveTransaction(Mono<Transaction> transaction) {
        return transaction.flatMap(transactionMongoRepository::insert);
    }
    @Override
    public Mono<Transaction> updateTransaction(Mono<Transaction> transaction, String transactionId) {
        return transactionMongoRepository.findById(transactionId)
                .flatMap(p -> transaction)
                .doOnNext(e -> e.setId(transactionId))
                .flatMap(transactionMongoRepository::save);
    }

    @Override
    public Mono<Void> deleteTransaction(String transactionId) {
        return transactionMongoRepository.deleteById(transactionId);
    }
}
