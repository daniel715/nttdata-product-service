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
	String _id;

	private String name; // cuenta ahorro

	private Boolean isPasivo; // si es un productos pasivo o activo

	private Integer numMaxTransactions; // numero llimite de transacciones del producto

	private BigDecimal minAmountToOpen; // monto minimo para abrir cuenta

	private BigDecimal creditLimitAmount; // limite de credito


}
