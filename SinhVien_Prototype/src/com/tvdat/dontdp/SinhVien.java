package com.tvdat.dontdp;
import com.tvdat.UI.SinhVienMethod;

import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SinhVien implements SinhVienMethod{
	private String maSinhVien;
	private String hoTen;
	
	public SinhVien(SinhVien x) {
		this.maSinhVien = x.maSinhVien;
		this.hoTen = x.hoTen;
	}
	@Override
	public String toString() {
		return "Sinh Vien: " + this.getHoTen();
	}
}
