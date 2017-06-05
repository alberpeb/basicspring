package com.perezbonin.basicspring.strategyservice;

import com.perezbonin.basicspring.model.Currency;
import com.perezbonin.basicspring.strategyservice.json.JsonToCurrency;

public class DolarStrategy  implements CurrencyStrategyService{

	@Override
	public Currency getCurrencyValues() {
		return JsonToCurrency.getJson("https://www.bancoprovincia.com.ar/principal/dolar");
	}

}
