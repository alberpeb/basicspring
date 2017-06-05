package com.perezbonin.basicspring.strategyservice;

import com.perezbonin.basicspring.model.Currency;
import com.perezbonin.basicspring.strategyservice.json.JsonToCurrency;

public class RealStrategy implements CurrencyStrategyService{

	@Override
	public Currency getCurrencyValues() {
		return JsonToCurrency.getJson("{\"currency\":[\"1.1\",\"2.1\"]}");
	}

}
