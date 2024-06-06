package com.tvdat._21T1020285_model;

import java.util.Date;
import lombok.*;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class _21t1020285_ThongTinRa {
//	Date thoiDiemVao;
//	String xe;
//	String loaiXe;
//	String tinhTrang1;
//	String thoiDiemRa;
//	String tinhTrang2;
//	double giaGuiXe;
	int loaiXe;
	String bienSoXe;
	String soVeXe;
	Date thoiGianRaBai;
	String tinhTrangRaBai;
	public String xe() {
		String xe = "";
		xe = this.bienSoXe.equals("Not Available") ? this.soVeXe + "\t" : this.bienSoXe; 
		return xe;
	}
}
