package com.tvdat.Domain.MODELS;

public interface DrinkComponent {
	String getName();
	int getCost();
	int costDrink();
	
	default void showBasicInformation() {
        System.out.println("-------");
        System.out.println("Drink: " + getName());
    }
}
