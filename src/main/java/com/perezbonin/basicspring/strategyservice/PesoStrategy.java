package com.perezbonin.basicspring.strategyservice;

import com.perezbonin.basicspring.model.Currency;

public class PesoStrategy implements CurrencyStrategyService{

	@Override
	public Currency getCurrencyValues() {
		return new Currency(1.11, 2.11);
	}

}
