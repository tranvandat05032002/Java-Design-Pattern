package com.tvdat.dp.de1.Models;

import java.util.ArrayList;

public class SQLServer implements ConnectMethod {
	private static String path;
	public SQLServer(String path) {
		this.path = path;
	}
	@Override
	public ArrayList<SinhVien> getAllSinhVien() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertSinhVien(SinhVien newSinhVien) {
		
	}

	@Override
	public void deleteSinhVien(String maSinhVien) {
		// TODO Auto-generated method stub
	}

}
