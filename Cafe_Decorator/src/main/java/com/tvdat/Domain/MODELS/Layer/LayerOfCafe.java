package com.tvdat.Domain.MODELS.Layer;

import com.tvdat.Domain.MODELS.Cafe.Cafe;

public abstract class LayerOfCafe extends Cafe {
	protected Cafe cafe; // HAS-A
	
	public Cafe getCafe() {
		return this.cafe;
	}
	@Override
	public abstract String getMôTả();
}
