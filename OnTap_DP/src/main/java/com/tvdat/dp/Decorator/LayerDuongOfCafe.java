package com.tvdat.dp.Decorator;

public class LayerDuongOfCafe extends LayerOfCafe {

	@Override
	public String getMota() {
		// TODO Auto-generated method stub
		return this.getCafe().getMota() + " Them Duong";
	}

	@Override
	public double getGia() {
		// TODO Auto-generated method stub
		return this.getCafe().getGia() + 2000;
	}
	public LayerDuongOfCafe(Cafe cafe) {
		this.cafe = cafe;
	}

}
