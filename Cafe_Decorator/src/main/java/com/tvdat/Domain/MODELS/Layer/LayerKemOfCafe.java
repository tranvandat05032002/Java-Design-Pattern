package com.tvdat.Domain.MODELS.Layer;

import com.tvdat.Domain.MODELS.Cafe.Cafe;

public class LayerKemOfCafe extends LayerOfCafe {

	@Override
	public String getMôTả() {
		// TODO Auto-generated method stub
		return this.getCafe().getMôTả() + " Kem";
	}

	@Override
	public double getGiá() {
		// TODO Auto-generated method stub
		return this.getCafe().getGiá() + 2000;
	}
	
//	public int countLayerOfCafe(Cafe cafe) {
//		int nKemLayer = 0;
//		Cafe cafeTmp = cafe;
//		while(true) {
//			if(cafeTmp instanceof Cafe) {
//				if(cafeTmp instanceof LayerKemOfCafe) {
//					nKemLayer++;
//				}
//				// cast to LayerOfCafe
//				cafeTmp = ((LayerOfCafe) cafeTmp).getCafe();
//			}
//			else {
//				break;
//			}
//		}
//		return nKemLayer;
//	}
	
	public LayerKemOfCafe(Cafe cafe) throws Exception {
//		if(countLayerOfCafe(cafe) >= 2) {
//			throw new Exception("Không được thêm quá 2 lớp trang trí đường");
//		}
		boolean daCoDuongHoacSua = false;
		Cafe x2 = cafe;
		while (true) {
			if (x2 instanceof LayerOfCafe) {
				if (x2 instanceof LayerDuongOfCafe ||
					x2 instanceof LayerSuaOfCafe) {
					daCoDuongHoacSua = true;
					break;
				}
				x2 = ((LayerOfCafe) x2).getCafe();
			} else
				break;
		}
		
		if (daCoDuongHoacSua)
			throw new Exception("Không được trang trí thêm Kem khi đã có đường/sữa");
		this.cafe = cafe;
	}
}
