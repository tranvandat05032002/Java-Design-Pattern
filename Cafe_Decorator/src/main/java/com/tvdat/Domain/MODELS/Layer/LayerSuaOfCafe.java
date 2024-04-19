package com.tvdat.Domain.MODELS.Layer;

import com.tvdat.Domain.MODELS.Cafe.Cafe;

public class LayerSuaOfCafe extends LayerOfCafe {

	@Override
	public String getMôTả() {
		// TODO Auto-generated method stub
		return this.getCafe().getMôTả() + " Sữa";
	}

	@Override
	public double getGiá() {
		// TODO Auto-generated method stub
		return this.getCafe().getGiá() + 1000;
	}
	public LayerSuaOfCafe(Cafe cafe) {
		this.cafe = cafe;
	}
}
