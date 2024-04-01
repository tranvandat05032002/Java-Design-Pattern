package com.dat.dp.factory.models;

public class AnimalFactory {
	public AnimalMethod getAnimal(String typeAnimal) {
		if("Dog".equals(typeAnimal)) {
			return new Dog();
		}
		else {
			return new Cat();
		}
	}
}
