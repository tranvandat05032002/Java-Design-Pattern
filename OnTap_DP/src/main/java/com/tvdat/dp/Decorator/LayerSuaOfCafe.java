package com.tvdat.dp.Decorator;

public class LayerSuaOfCafe extends LayerOfCafe {

	@Override
	public String getMota() {
		// TODO Auto-generated method stub
		return this.getCafe().getMota() + " Them Sua";
	}

	@Override
	public double getGia() {
		// TODO Auto-generated method stub
		return this.getCafe().getGia() + 5000;
	}
	public LayerSuaOfCafe(Cafe cafe) {
		this.cafe = cafe;
	}

}
