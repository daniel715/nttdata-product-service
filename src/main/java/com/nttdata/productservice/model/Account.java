package com.nttdata.productservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "account")
public class Account {

    @Id
    private String _id;

    private String clientId; // id del cliente dueño del producto

    private String productId; // producto

    private BigDecimal balance;  // saldo

    private String currency; //moneda


    private String accountNumber; // en caso se trate de un producto pasivo


}
