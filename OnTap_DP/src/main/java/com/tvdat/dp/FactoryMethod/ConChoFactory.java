package com.tvdat.dp.FactoryMethod;

public class ConChoFactory extends ConVatFactory {
	@Override
	public ConVatMethod getConVat() {
		return new ConCho();
	}	
}
