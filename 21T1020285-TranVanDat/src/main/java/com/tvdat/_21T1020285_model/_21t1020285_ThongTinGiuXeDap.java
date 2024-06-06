package com.tvdat._21T1020285_model;

import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class _21t1020285_ThongTinGiuXeDap extends _21t1020285_ThongTinGiuXe {
	String soVeXe;
	public _21t1020285_ThongTinGiuXeDap(Date thoiDiemVao, Date thoiDiemRa,  String soVeXe) {
		super(thoiDiemVao, thoiDiemRa);
		this.soVeXe = soVeXe;
	}
	@Override
	public double getChiPhi() {
		double totalPrice = totalTime(0, formatDate(thoiDiemVao),formatDate(thoiDiemRa)) * 2000;
		return totalPrice;
	}
	@Override
	public boolean isMatched(_21t1020285_ThongTinRa x) {
		return getSoVeXe().equals(x.soVeXe) ? true : false;
	}
}
