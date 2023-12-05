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
@Document(collection = "product")
public class Product {

	@Id
	private String _id;

    private String name; // cuenta ahorro

//	private String type; // cuentas bancarias o credito

	private BigDecimal balance;

	private String currency;

	private BigDecimal creditLimitAmount;

	private Boolean isPasivo; // si es un productos pasivo o activo

	private String accountNumber; // en caso se trate de un producto pasivo

	private String clientId;

}
