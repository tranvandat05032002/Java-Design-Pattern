package com.tvdat.adapter.UI;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.tvdat.adapter.MODELS.PhanTuCongNhan;
import com.tvdat.adapter.MODELS.PhanTuSinhVien;
import com.tvdat.adapter.MODELS.SapXep;
import com.tvdat.adapter.dp.SinhVien;
import com.tvdat.adapter.dp.SinhVienReader;
import com.tvdat.dp.CongNhan;
import com.tvdat.dp.CongNhanReader;
public class ChuongTrinh {
	public void readDataFile(String pathSV, String pathCN) {
		try {
			List<PhanTu> lstpt = new ArrayList<PhanTu>();
			List<SinhVien> lstSV = SinhVienReader.readFromFile(pathSV);
			List<CongNhan> lstCN = CongNhanReader.readFromFile(pathCN);
			for(SinhVien Element: lstSV) {
				PhanTuSinhVien ptsv = new PhanTuSinhVien(Element);
				lstpt.add(ptsv);
			}
			for(CongNhan Element: lstCN) {
				PhanTuCongNhan ptcn = new PhanTuCongNhan(Element);
				lstpt.add(ptcn);
			}
			SapXep.sapXepTheoDoUuTien(lstpt);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
			ChuongTrinh ct = new ChuongTrinh();
			String pathSinhVien = "/Users/spiderman/Documents/DHKH_2021-2025/DP_Java/SinhVien_Adapter/lib/SinhVien.txt";
			String pathCongNhan = "/Users/spiderman/Documents/DHKH_2021-2025/DP_Java/SinhVien_Adapter/lib/CongNhan.txt"; 
			ct.readDataFile(pathSinhVien, pathCongNhan);
	}
}