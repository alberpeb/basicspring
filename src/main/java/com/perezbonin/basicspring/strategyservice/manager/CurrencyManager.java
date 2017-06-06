package com.perezbonin.basicspring.strategyservice.manager;

import com.perezbonin.basicspring.model.Currency;
import com.perezbonin.basicspring.strategyservice.CurrencyStrategyService;

public class CurrencyManager implements CurrencyStrategyService {

	CurrencyStrategyService currencyStrategyService;
	
	CurrencyManager(CurrencyStrategyService currencyStrategyService){
		this.currencyStrategyService = currencyStrategyService;
	}
	
	public void setCurrencyStragegyService(CurrencyStrategyService currencyStrategyService){
		this.currencyStrategyService = currencyStrategyService;
	}

	@Override
	public Currency getCurrencyValues() {
		return this.currencyStrategyService.getCurrencyValues();
	}
}
