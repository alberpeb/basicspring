package com.perezbonin.basicspring.strategyservice.json;

import java.math.BigDecimal;

import org.springframework.expression.ParseException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.perezbonin.basicspring.model.Currency;

public class JsonToCurrency {
	
	public static Currency getJson(String url){
		Currency currency = new Currency();
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String[]> responseEntity = restTemplate.getForEntity(url, String[].class);
		try {
			currency.setPurchasePrice(new BigDecimal(responseEntity.getBody()[0]));
			currency.setSalesPrice(new BigDecimal(responseEntity.getBody()[1]));
		} catch (ParseException e) {
		}
		 
		return currency;
	}

}
