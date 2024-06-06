package com.tvdat._21T1020285_model;

import java.util.Date;

import lombok.*;
@Data
@NoArgsConstructor
public class _21t1020285_ThongTinGiuXeMay extends _21t1020285_ThongTinGiuXe {
	String bienSoXe;
	public _21t1020285_ThongTinGiuXeMay(Date thoiDiemVao, Date thoiDiemRa, String bienSoXe) {
		super(thoiDiemVao, thoiDiemRa);
		this.bienSoXe = bienSoXe;
	}
	@Override
	public double getChiPhi() {
		double totalPrice = totalTime(2, formatDate(thoiDiemVao),formatDate(thoiDiemRa)) * 3000;
		return totalPrice;
	}
	@Override
	public boolean isMatched(_21t1020285_ThongTinRa x) {
		return getBienSoXe().equals(x.bienSoXe) ? true : false;
	}
}
