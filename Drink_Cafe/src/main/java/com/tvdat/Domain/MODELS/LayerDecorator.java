package com.tvdat.Domain.MODELS;
public abstract class LayerDecorator implements DrinkComponent {
	protected DrinkComponent layerDrink;
	public LayerDecorator(DrinkComponent layerDrink) {
		this.layerDrink = layerDrink;
	}
	@Override
	public String getName() {
		return this.layerDrink.getName();
	}

	@Override
	public int costDrink() {
		return 0;
	}

}
