package com.tvdat.AbstractFactory;

public class DongVatStyle1 extends AbstractFactory {

	@Override
	public DongVatAnThit taoDongVatAnThit() {
		// TODO Auto-generated method stub
		return new SuTu();
	}

	@Override
	public DongVatAnCo taoDongVatAnCo() {
		// TODO Auto-generated method stub
		return new NguaVan();
	}
	
}
