package com.tvdat.dp.Decorator;

public abstract class LayerOfCafe extends Cafe {
	protected Cafe cafe;
	public Cafe getCafe() {
		return this.cafe;
	}
	@Override
	public abstract String getMota();
}
