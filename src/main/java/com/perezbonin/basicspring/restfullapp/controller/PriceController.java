package com.perezbonin.basicspring.restfullapp.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.perezbonin.basicspring.model.Currency;
import com.perezbonin.basicspring.strategyservice.DolarStrategy;
import com.perezbonin.basicspring.strategyservice.PesoStrategy;
import com.perezbonin.basicspring.strategyservice.RealStrategy;
import com.perezbonin.basicspring.strategyservice.manager.CurrencyManager;

@RestController
public class PriceController {

	@RequestMapping(value = "/myrestfullapp/cotizacion/{currency}", method = RequestMethod.GET)
	public Currency price(@PathVariable("currency") String currency) {
		
		CurrencyManager currencyManager = null; 
		
		currency = currency.substring(0, 1).toUpperCase() + currency.substring(1) + "Strategy";

		try {
			currencyManager = (CurrencyManager) Class.forName(currency).newInstance();
		} catch (Exception e) {
			
		}
		return currencyManager.getCurrencyValues();
	}
	
}
