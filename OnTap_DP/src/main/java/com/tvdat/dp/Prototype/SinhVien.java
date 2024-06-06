package com.tvdat.dp.Prototype;
import lombok.*;
@AllArgsConstructor 
@NoArgsConstructor
@Getter
@Setter
public class SinhVien {
	private String maSinhVien;
	private String hoTen;

	public SinhVien(SinhVien x) {
		this.maSinhVien = x.maSinhVien;
		this.hoTen = x.hoTen;
	}
	public SinhVien taoBanSao() {
		return new SinhVien(this);
	}
	@Override
	public String toString() {
		return "Sinh viên " + this.getHoTen();				
	}	
}
