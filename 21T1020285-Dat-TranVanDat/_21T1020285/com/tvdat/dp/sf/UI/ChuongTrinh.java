package com.tvdat.dp.sf.UI;


import java.sql.Date;

import com.tvdat.dp.sf.DAO.SinhVienRepo;
import com.tvdat.dp.sf.MODELS.CauHinh;
import com.tvdat.dp.sf.MODELS.SinhVien;

public class ChuongTrinh {
	public void getListSinhVien(CauHinh cfg) {
		SinhVienRepo svRepo = null;
		SinhVienRepoFactory svRepoFac = new SinhVienRepoFactory();
		
		svRepo = svRepoFac.createSinhVienRepo(cfg);
		try {
			for(int i = 0; i < svRepo.getSinhVien().size(); i++) {
				SinhVien sv = svRepo.getSinhVien().get(i);
				System.out.println(sv);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		ChuongTrinh ct = new ChuongTrinh();
		CauHinh cfg = CauHinh.getInstance("/Users/spiderman/Documents/DHKH_2021-2025/DP_Java/21T1020285-Dat-TranVanDat/lib/config.txt");
		SinhVienRepo repo = new SinhVienRepoFactory().createSinhVienRepo(cfg);
		SinhVien sv01 = new SinhVien("21T1020313", "Trần Hoài Bão", true, Date.valueOf("2003-10-20"));
// 		selectAll		
//		ct.getListSinhVien(cfg);
//		insert
//		ct.getListSinhVien(cfg);
//		repo.insertSinhVien(sv01);
//		ct.getListSinhVien(cfg);
////		delete
		ct.getListSinhVien(cfg);
		repo.deleteSinhVien("21T1020313");
		ct.getListSinhVien(cfg);
	}
}
