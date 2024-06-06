package com.tvdat.AbstractFactory;

public class Soi implements DongVatAnThit {

	@Override
	public void duoi(DongVatAnCo x) {
		System.out.println("Soi tan cong Soc ");
		x.boChay();
	}
	
}
