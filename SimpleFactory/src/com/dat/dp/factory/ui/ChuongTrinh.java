package com.dat.dp.factory.ui;

import com.dat.dp.factory.models.AnimalFactory;
import com.dat.dp.factory.models.AnimalMethod;

public class ChuongTrinh {
	public static void testAnimal() {
		AnimalMethod x = null;
		AnimalFactory f = new AnimalFactory();
		x = f.getAnimal("Cat");
		
		x.keu();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testAnimal();
	}

}
