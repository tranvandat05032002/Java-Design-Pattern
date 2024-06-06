package com.tvdat.AbstractFactory;
public class NguaVan implements DongVatAnCo {
	private String name;
	@Override
	public void boChay() {
		System.out.println("Ngua Van bo chay");
	}
}