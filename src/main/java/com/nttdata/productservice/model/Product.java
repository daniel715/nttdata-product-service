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
	private String id;

    private String name; // cuenta ahorro

	private String type; // cuentas bancarias o credito

	private String productDescription;

	private BigDecimal balance;

	private BigDecimal creditLimitAmount;

	private Long clienteId;

	private Boolean isPasivo; // si es un productos pasivo o activo

}
