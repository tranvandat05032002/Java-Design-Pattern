package com.tvdat.dp.sf.DAO;

import java.sql.SQLException;
import java.util.ArrayList;

import com.tvdat.dp.sf.MODELS.SinhVien;

public interface SinhVienRepo {
	void insertSinhVien(SinhVien sv);
	ArrayList<SinhVien> getSinhVien() throws SQLException;
	void deleteSinhVien(String maSinhVien);
}
