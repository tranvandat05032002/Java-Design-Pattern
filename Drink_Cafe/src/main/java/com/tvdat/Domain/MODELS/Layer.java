package com.tvdat.Domain.MODELS;

public class Layer extends LayerDecorator {
	
	public Layer(DrinkComponent layer) {
		super(layer);
	}
	String name;
	int cost;
	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return 0;
	}
}
