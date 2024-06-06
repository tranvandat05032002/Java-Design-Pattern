package com.tvdat.dp.de1.UI;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import com.tvdat.dp.de1.Models.ConnectFactory;
import com.tvdat.dp.de1.Models.SinhVien;

public class Client {
	public static ArrayList<SinhVien> lstSinhVien;
	public static String path = "/Users/spiderman/Documents/DHKH_2021-2025/DP_Java/OnTap/lib/config.txt";
	public static ConnectFactory cnt = new ConnectFactory();
	public static String connectType = null;
	public static String connectPath = null;

	public static void getAllSinhVien() {
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			connectType = br.readLine();
			connectPath = br.readLine();
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lstSinhVien = cnt.getConnect(connectType, connectPath).getAllSinhVien();
		for (SinhVien sv : lstSinhVien) {
			System.out.println(sv);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("------------Lay danh sach sinh vien----------------");
		getAllSinhVien();
		SinhVien tranvandat = new SinhVien("21T1020285", "Tran Van Dat", java.sql.Date.valueOf("2003-10-20") , true);
		cnt.getConnect(connectType, connectPath).insertSinhVien(tranvandat);
		System.out.println("------------Danh sanh sinh vien sau khi them----------------");
		getAllSinhVien();
		cnt.getConnect(connectType, connectPath).deleteSinhVien(tranvandat.getMaSinhVien());
		System.out.println("------------Danh sanh sinh vien sau khi xoa----------------");
		getAllSinhVien();
	}

}
