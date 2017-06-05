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
		
		//currency = currency.substring(0, 1).toUpperCase() + currency.substring(1) + "Strategy";

		/*try {
			currencyManager = new CurrencyManager();
			currencyManager.setCurrencyStragegyService((CurrencyStrategyService) Class.forName(currency).newInstance());
			return currencyManager.getCurrencyValues();
		} catch (Exception e) {
			
		}*/
		
		currencyManager = new CurrencyManager();
		
		if(currency.equals("dolar")) {
			currencyManager.setCurrencyStragegyService(new DolarStrategy());
			return currencyManager.getCurrencyValues();
		} else if(currency.equals("peso")) {
			currencyManager.setCurrencyStragegyService(new PesoStrategy());
			return currencyManager.getCurrencyValues();
		} else if(currency.equals("real")) {
			currencyManager.setCurrencyStragegyService(new RealStrategy());
			return currencyManager.getCurrencyValues();
		} else {
			return null;
		}
		
	}
	
}
