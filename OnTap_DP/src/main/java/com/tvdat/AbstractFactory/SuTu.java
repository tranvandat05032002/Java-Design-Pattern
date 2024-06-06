package com.tvdat.AbstractFactory;

public class SuTu implements DongVatAnThit {
	@Override
	public void duoi(DongVatAnCo x) {
		System.out.println("Su tu tan cong Ngua Van ");
		x.boChay();
	}
	
}
