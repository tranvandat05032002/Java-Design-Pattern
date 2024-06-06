package com.tvdat.AbstractFactory;

public class DongVatStyle2 extends AbstractFactory {

	@Override
	public DongVatAnThit taoDongVatAnThit() {
		return new Soi();
	}

	@Override
	public DongVatAnCo taoDongVatAnCo() {
		// TODO Auto-generated method stub
		return new Soc();
	}

}
