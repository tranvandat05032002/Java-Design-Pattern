package com.tvdat.Simple.MODELS;
import java.sql.Date;

import lombok.*;
@Data
@AllArgsConstructor
public class SinhVien {
	private String MaSinhVien;
	private String HoTen;
	private Boolean GioiTinhNam;
	private Date NgaySinh;
}
