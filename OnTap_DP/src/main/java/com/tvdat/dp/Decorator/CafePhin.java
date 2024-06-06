package com.tvdat.dp.Decorator;

public class CafePhin extends Cafe {

	@Override
	public double getGia() {
		return 8000;
	}
	public CafePhin() {
		this.moTa = "Cafe Phin";
	}
}
