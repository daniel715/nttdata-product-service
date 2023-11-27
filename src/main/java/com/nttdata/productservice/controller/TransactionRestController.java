package com.nttdata.productservice.controller;

import com.nttdata.productservice.model.Product;
import com.nttdata.productservice.model.Transaction;
import com.nttdata.productservice.service.ITransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/transaction")
public class TransactionRestController {

     @Autowired
     ITransactionService transactionService;

    @RequestMapping(value ="/list" , produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Transaction> list(){
        return transactionService.list();
    }

    @RequestMapping(value ="/find/{id}" , produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Mono<Transaction> findTransaction(@PathVariable String id) {
        return transactionService.findById(id);
    }

    @PostMapping(value = "/save")
    public Mono<Transaction> saveTransaction(@RequestBody Mono<Transaction> transactionMono ){
        return transactionService.saveTransaction(transactionMono);
    }
    @PutMapping(value = "/update/{id}")
    public Mono<Transaction> updateTransaction(@RequestBody Mono<Transaction> transaction, @PathVariable String id){
        return transactionService.updateTransaction(transaction, id);
    }

    @DeleteMapping("/delete/{id}")
    public Mono<Void> deleteTransaction(@PathVariable String id){
        return transactionService.deleteTransaction(id);
    }


}
