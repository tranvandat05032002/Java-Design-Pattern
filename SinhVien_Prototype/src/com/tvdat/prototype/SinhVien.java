package com.tvdat.prototype;
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
	// using prototype
	public SinhVien taoBanSao() {
		return new SinhVien(this);
	}
	// using clone
	public Object clone() throws CloneNotSupportedException {
		return new SinhVien(this);
	}
	@Override
	public String toString() {
		return "Sinh Vien: " + this.getHoTen();
	}
}
