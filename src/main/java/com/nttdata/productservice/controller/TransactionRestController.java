package com.nttdata.productservice.controller;

import com.nttdata.productservice.model.Transaction;
import com.nttdata.productservice.service.ITransactionService;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Single;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/transaction")
public class TransactionRestController {

     @Autowired
     ITransactionService transactionService;

    @RequestMapping(value ="/list" , produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flowable<Transaction> list(){
        return transactionService.list();
    }

    @RequestMapping(value ="/find/{id}" , produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Single<Transaction> findTransaction(@PathVariable String id) {
        return transactionService.findById(id);
    }

    @PostMapping(value = "/save")
    public Single<Transaction> saveTransaction(@RequestBody Single<Transaction> transactionMono ){
        return transactionService.saveTransaction(transactionMono);
    }
    @PutMapping(value = "/update/{id}")
    public Single<Transaction> updateTransaction(@RequestBody Maybe<Transaction> transaction, @PathVariable String id){
        return transactionService.updateTransaction(transaction, id);
    }

    @DeleteMapping("/delete/{id}")
    public Completable deleteTransaction(@PathVariable String id){
        return transactionService.deleteTransaction(id);
    }


}
