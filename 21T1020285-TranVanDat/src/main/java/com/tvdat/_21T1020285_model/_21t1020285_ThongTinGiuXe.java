package com.tvdat._21T1020285_model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class _21t1020285_ThongTinGiuXe implements _21T1020285_GiuXeMethod {
	Date thoiDiemVao;
	Date thoiDiemRa;
	@Override
	public double getChiPhi() {
		return 1.2;
	}
	@Override
	public boolean isMatched(_21t1020285_ThongTinRa x) {
		return false;
	}
}
