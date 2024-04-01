package com.tvdat.adapter.MODELS;
import lombok.*;
import com.tvdat.adapter.UI.PhanTu;
import com.tvdat.adapter.dp.SinhVien;
@Getter
public class PhanTuSinhVien implements PhanTu {
	private SinhVien sv;
	
	public PhanTuSinhVien(SinhVien sv) {
		this.sv = sv;
	}
	@Override
	public String getDanhGia() {
		// TODO Auto-generated method stub
		double avg = sv.getDiemTrungBinh();
		if(avg > 10 || avg < 0) {
			return null;
		}
		if(avg < 4) {
			return "X";
		}
		else if(avg >= 4 && avg < 6) {
			return "D";
		}
		else if(avg >= 6 && avg < 7) {
			return "C";
			
		}
		else if(avg >= 7 && avg < 8.5) {
			return "B";
		}
		else {
			return "A";
		}
	}
	@Override
	public String getLoaiPT() {
		return "SV";
	}
	
}
