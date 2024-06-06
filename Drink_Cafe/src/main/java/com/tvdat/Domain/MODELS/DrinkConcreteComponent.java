package com.tvdat.Domain.MODELS;

public class DrinkConcreteComponent implements DrinkComponent {
	private Cafe cafe;
	@Override
	public String getName() {
		return this.cafe.getName();
	}

	@Override
	public int costDrink() {
		return this.cafe.getCost();
	}

	@Override
	public int getCost() {
		return cafe.getCost();
	}

	
}
