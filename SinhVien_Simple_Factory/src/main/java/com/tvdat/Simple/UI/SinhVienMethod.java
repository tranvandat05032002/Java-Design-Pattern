package com.tvdat.Simple.UI;

import java.util.ArrayList;
import java.util.List;

import com.tvdat.Simple.MODELS.SinhVien;

public interface SinhVienMethod {
	List<SinhVien> selectAll();
	public void insertSinhVien();
	public void deleteSinhVien();
	public void getSinhVien();
}
