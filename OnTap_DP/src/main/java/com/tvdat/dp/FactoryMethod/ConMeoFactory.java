package com.tvdat.dp.FactoryMethod;

public class ConMeoFactory extends ConVatFactory {

	@Override
	public ConVatMethod getConVat() {
		return new ConMeo();
	}
}
