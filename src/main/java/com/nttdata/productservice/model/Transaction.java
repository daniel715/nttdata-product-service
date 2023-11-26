package com.nttdata.productservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "transaction")
public class Transaction {

    @Id
    private String id;
    private Date transactionDate; //fecha transaction
    private String transactionDescription; //descripcion de la transaction
    private String productId;
    private String clienteId;

}
