package com.tvdat.dp.sf.MODELS;

import java.util.Date;
import lombok.*;
@Data
@AllArgsConstructor
public class SinhVien  {
	private String MaSinhVien;
	private String HoTen;
	private boolean GioiTinhNam;
	private Date NgaySinh;
}
