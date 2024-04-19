package com.tvdat.Domain.MODELS.Layer;

import com.tvdat.Domain.MODELS.Cafe.Cafe;

public class LayerDuongOfCafe extends LayerOfCafe {

	@Override
	public String getMôTả() {
		// TODO Auto-generated method stub
		return this.getCafe().getMôTả() + " Đường";
	}

	@Override
	public double getGiá() {
		// TODO Auto-generated method stub
		return this.getCafe().getGiá() + 500;
	}
	public LayerDuongOfCafe(Cafe cafe) {
		this.cafe = cafe;
	}
}
