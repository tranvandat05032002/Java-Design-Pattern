package com.tvdat.Infrastructure.UI;

public class Client {
	public static void testDrinkCafe() {
		DrinkComponent cafe_phin = new DrinkConcreteComponent("Cafe Phin");
		cafe_phin.cost(); // --> Giá gốc của ly cafe
		
		DrinkComponent cafe_rangxay = new DrinkConcreteComponent("Cafe rang xay");
		cafe_rangxay.cost();
		
		DrinkComponent layer_Sua = new LayerSua(cafe_phin);
		layer_Sua.cost(); // --> Giá của layer (sua)
		
		DrinkComponent layer_Kem = new LayerKem(cafe_phin);
		layer_Sua.cost(); // --> Giá củalayer (kem)
		
		DrinkComponent cafe_phin_kem = new LayerKemSua(cafe_rangxay);
	}
	public static void main(String[] args) {
		testDrinkCafe();
	}

}
