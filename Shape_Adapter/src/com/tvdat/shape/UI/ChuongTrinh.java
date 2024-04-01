package com.tvdat.shape.UI;

import com.tvdat.shape.adapter.CocTron;
import com.tvdat.shape.adapter.CocVuong;
import com.tvdat.shape.adapter.ConTronOfCocVuongAdapter;
import com.tvdat.shape.adapter.LoTron;

public class ChuongTrinh {
	public static void testAdapter() {
		CocTron x = new CocTron(3.4, 5.1);
		LoTron y = new LoTron(5.1);
		
		CocVuong z = new CocVuong(6.5);
		ConTronOfCocVuongAdapter tmpZ = new ConTronOfCocVuongAdapter(z);
		System.out.println(y.isFit(x));
		System.out.println(y.isFit(tmpZ));
	}
	public static void main(String[] args) {
		testAdapter();
	}

}
