package com.tvdat.UI;

import java.util.ArrayList;

import com.tvdat.dontdp.SinhVien;
import com.tvdat.dontdp.SinhVienNuocNgoai;

public class ChuongTrinh {
	public static void printSinhVien() {
		SinhVien VanDat = new SinhVien("21T1020285", "Trần Văn Đạt");
		SinhVien x = new SinhVien();
		// cach 1
		x.setMaSinhVien(VanDat.getMaSinhVien());
		x.setHoTen(VanDat.getHoTen());
		// cach 2
		SinhVien x2 = new SinhVien(VanDat);
		System.out.println(x.toString());
		System.out.println(x2.toString());
	}
	public static void printSinhVienNuocNgoai() {
		ArrayList<SinhVien> lst1 = new ArrayList<>();
		lst1.add(new SinhVien("sv1", "Nguyễn Văn Trung"));
		lst1.add(new SinhVienNuocNgoai("21T1020228", "Hoang Anh", "Xích đạo"));
		lst1.add(new SinhVienNuocNgoai("sv3", "Lê Thị Hoa", "XYZ corppation"));
		lst1.add(new SinhVien("sv100", "John Smith"));
		ArrayList<SinhVien> lst2 = new ArrayList<>();
		for(int i = 0; i < lst1.size(); i++) {
			SinhVien x = lst1.get(i);
			if(x instanceof SinhVienNuocNgoai) {
				lst2.add(new SinhVienNuocNgoai((SinhVienNuocNgoai) x));
			}
			lst2.add(new SinhVien(x));
		}
		for(int i = 0; i < lst2.size(); i++) {
			System.out.println(lst2.get(i).toString());
		}
	}
	public static void copySinhVienUsePrototype() {
		ArrayList<com.tvdat.prototype.SinhVien> lst1 = new ArrayList<>();
		lst1.add((new com.tvdat.prototype.SinhVien("sv1", "Nguyễn Văn Trung")));
		lst1.add(new com.tvdat.prototype.SinhVienNuocNgoai("21T1020228", "Hoang Anh", "Xích đạo"));
		lst1.add(new com.tvdat.prototype.SinhVienNuocNgoai("sv3", "Lê Thị Hoa", "XYZ corppation"));
		lst1.add(new com.tvdat.prototype.SinhVien("sv100", "John Smith"));
		ArrayList<com.tvdat.prototype.SinhVien> lst2 = new ArrayList<>();
		for(int i = 0; i < lst1.size(); i++) {
			com.tvdat.prototype.SinhVien x = lst1.get(i);
			lst2.add(x.taoBanSao());
		}
		for(int i = 0; i < lst2.size(); i++) {
			System.out.println(lst2.get(i).toString());
		}
	}
	public static void main(String[] args) {
//		printSinhVien();
//		printSinhVienNuocNgoai();
		copySinhVienUsePrototype();
	}

}
