package com.tvdat.Infrastructure.UI;

import com.tvdat.Domain.MODELS.Cafe.Cafe;
import com.tvdat.Domain.MODELS.Cafe.Cafe_Chon;
import com.tvdat.Domain.MODELS.Cafe.Cafe_RangXay;
import com.tvdat.Domain.MODELS.Layer.LayerDuongOfCafe;
import com.tvdat.Domain.MODELS.Layer.LayerKemOfCafe;
import com.tvdat.Domain.MODELS.Layer.LayerSuaOfCafe;

public class Client {

	public static void main(String[] args) {
		Cafe cafe;
		cafe = new Cafe_Chon();
		System.out.printf("%s, giá: %g\n", cafe.getMôTả(), cafe.getGiá());
		
//		Cafe cafeLayer = null;
		try {
			cafe = new LayerDuongOfCafe(cafe);
			
			System.out.printf("%s, giá: %g\n", cafe.getMôTả(), cafe.getGiá());
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			cafe = new LayerKemOfCafe(cafe);
			
			System.out.printf("%s, giá: %g\n", cafe.getMôTả(), cafe.getGiá());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
