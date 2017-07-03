package com.perezbonin.basicspring.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.perezbonin.basicspring.model.Currency;
import com.perezbonin.basicspring.strategyservice.CurrencyStrategyService;
import com.perezbonin.basicspring.strategyservice.manager.CurrencyManager;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/myrestfullapp/cotizacion/{currency}")
public class PriceController {

	
	@RequestMapping(method = RequestMethod.GET)
	public Currency price(@PathVariable("currency") String currency) {
		
		currency = "com.perezbonin.basicspring.strategyservice." 
				+ currency.substring(0, 1).toUpperCase() + currency.substring(1) + "Strategy";
		if(!this.isPathAClass(currency))
			return null;
		
		CurrencyManager currencyManager = new CurrencyManager(); 
		try {
			currencyManager.setCurrencyStragegyService((CurrencyStrategyService) Class.forName(currency).newInstance());
		} catch (Exception e) {
			
		}
		return currencyManager.getCurrencyValues();
	}

	private boolean isPathAClass(String currency) {
		try {
			 Class.forName(currency);
			 return true;
			} catch( ClassNotFoundException e ) {
			 return false;
			}
	}
	
}
