package com.tvdat._21T1020285_model;

import java.util.Date;

import lombok.*;
@Data
@NoArgsConstructor
public class _21t1020285_ThongTinGiuXeOto extends _21t1020285_ThongTinGiuXe {
	String bienSoXe;
	String trangThaiKhiVao;
	String trangThaiKhiRa;
	public _21t1020285_ThongTinGiuXeOto(Date thoiDiemVao, Date thoiDiemRa, String bienSoXe, String trangThaiKhiVao, String trangThaiKhiRa) {
		super(thoiDiemVao, thoiDiemRa);
		this.bienSoXe = bienSoXe;
		this.trangThaiKhiVao = trangThaiKhiVao;
		this.trangThaiKhiRa = trangThaiKhiRa;
	}
	@Override
	public double getChiPhi() {
		double totalPrice = totalTime(4, formatDate(thoiDiemVao),formatDate(thoiDiemRa)) * 10000;
		if(trangThaiKhiVao.compareTo(trangThaiKhiRa) != 0) {
			return -1;
		}
		return totalPrice;
	}
	@Override
	public boolean isMatched(_21t1020285_ThongTinRa x) {
		return getBienSoXe().equals(x.bienSoXe) ? true : false;
	}
}