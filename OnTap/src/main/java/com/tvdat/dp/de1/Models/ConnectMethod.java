package com.tvdat.dp.de1.Models;

import java.util.ArrayList;

public interface ConnectMethod {
	public ArrayList<SinhVien> getAllSinhVien();
	public void insertSinhVien(SinhVien newSinhVien);
	public void deleteSinhVien(String maSinhVien);
}
