package com.tvdat.adapter.MODELS;

import java.util.List;

import com.tvdat.adapter.UI.PhanTu;

public class SapXep {
	public static void sapXepTheoDoUuTien(List<PhanTu> lstpt) {
		int n = lstpt.size();
		for(int i = 0; i < n - 1; i++) {
			for(int j = i + 1; j < n; j++) {
				int currIndex = i;
				if(lstpt.get(j).getDanhGia().compareTo(lstpt.get(i).getDanhGia()) < 0) {
					currIndex = j;
				}
				PhanTu temp = lstpt.get(currIndex);;
				lstpt.set(currIndex, lstpt.get(i));
				lstpt.set(i, temp);
			}
		}
		System.out.println("STT\t\tHọ Tên\t\tLoại\t\tĐộ ưu tiên\t");
		int idx = 1;
		for(PhanTu elm: lstpt) {
			if(elm instanceof PhanTuSinhVien) {
				PhanTuSinhVien ptsv = (PhanTuSinhVien) elm;
				String hoTen = ptsv.getSv().getHoTen();
				String loai = ptsv.getLoaiPT();
				String doUuTien = ptsv.getDanhGia();
				System.out.printf("%d\t\t%s\t\t%s\t\t%s\t\t%n", idx, hoTen, loai, doUuTien);
			}
			else if(elm instanceof PhanTuCongNhan) {
				PhanTuCongNhan ptcn = (PhanTuCongNhan) elm;
				String hoTen = ptcn.getCn().getHoTen();
				String loai = ptcn.getLoaiPT();
				String doUuTien = ptcn.getDanhGia();
				System.out.printf("%d\t\t%s\t\t%s\t\t%s\t\t%n", idx, hoTen, loai, doUuTien);
			}
			idx++;
		}
	}
}
