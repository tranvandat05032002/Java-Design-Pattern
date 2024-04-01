package com.tvdat.dp.sf.MODELS;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import lombok.*;
@Data
public class CauHinh {
	private String loaiNguon = null;
	private String chuoiKetNoi = null;
	private static CauHinh _instance = null;
	public String getChuoiKetNoi () {
		return this.chuoiKetNoi;
	}
	private CauHinh(String pathLocal) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(pathLocal));
			this.loaiNguon = br.readLine();
			this.chuoiKetNoi = br.readLine();
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static CauHinh getInstance(String pathLocal) {
		if(_instance == null) {
			_instance = new CauHinh(pathLocal);
		}
		return _instance;
	}
}
