package com.tvdat.shape.adapter;

public class ConTronOfCocVuongAdapter extends CocTron {
	private CocVuong x;
	
	public ConTronOfCocVuongAdapter(CocVuong x) {
		this.x = x;
	}
	@Override
	public double getBanKinh() {
		return x.getKichThuoc() * Math.sqrt(0.5);
	}
}
