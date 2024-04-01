package com.tvdat.adapter.MODELS;

import java.util.Date;
import lombok.*;
import com.tvdat.adapter.UI.PhanTu;
import com.tvdat.dp.CongNhan;

@Getter
public class PhanTuCongNhan implements PhanTu {
	private CongNhan cn;
	
	public PhanTuCongNhan(CongNhan cn) {
		this.cn = cn;
	}
	@Override
	public String getDanhGia() {
		Date currentDate = new Date();
		int totalYear = currentDate.getYear() - cn.getNgayBatDauLamViec().getYear();
		if(totalYear < 0) {
			return null;
		}
 		if(totalYear < 1) {
			return "X";
		}
		else if(totalYear >= 1 && totalYear <= 5) {
			return "D";
		}
		else if(totalYear > 5 && totalYear <= 10) {
			return "C";
		}
		else if(totalYear > 10 && totalYear <= 20) {
			return "B";
		}
		else{
			return "A";
		}
		
	}
	@Override
	public String getLoaiPT() {
		return "CN";
	}

}
