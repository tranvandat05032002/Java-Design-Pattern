package com.tvdat.dp.de1.Models;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class File implements ConnectMethod {
	private String path;
	public File(String path) {
		this.path = path;
	}
	public static String formatDate(Date theDate) {
        DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        return sdf.format(theDate);
    }
	public static Date formatStringToDate(String theDateString) {
        DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        try {
			return sdf.parse(theDateString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return null;
    }
	@Override	
	public ArrayList<SinhVien> getAllSinhVien() {
		ArrayList<SinhVien> lstSinhVien = new ArrayList<SinhVien>();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(this.path));
			String line;
			while ((line = br.readLine()) != null) {
				String[] currentLine = line.trim().split(","); 
				if (currentLine.length == 4) {
					String maSinhVien = currentLine[0];
					String hoTen = currentLine[1];
					boolean gioiTinhNam = Boolean.parseBoolean(currentLine[2]);
					Date ngaySinh = formatStringToDate(currentLine[3]);
					SinhVien sv = new SinhVien(maSinhVien, hoTen, ngaySinh, gioiTinhNam);
					lstSinhVien.add(sv);
				}
			}
			return lstSinhVien;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void insertSinhVien(SinhVien newSinhVien) {
		ArrayList<SinhVien> lstSV = getAllSinhVien();
		boolean exist = false;
		for (SinhVien sv : lstSV) {
			if (sv.getMaSinhVien().equalsIgnoreCase(newSinhVien.getMaSinhVien())) {
				System.out.println("Ma SV da ton tai");
				exist = true;
				break;
			}
		}
		if (!exist) {
			try {
				BufferedWriter bw = new BufferedWriter(new FileWriter(this.path, true));
				String line = newSinhVien.getMaSinhVien() + "," 
						+ newSinhVien.getHoTen() + ","
						+ newSinhVien.getGioiTinhNam() + ","
						+ formatDate((newSinhVien.getNgaySinh())) + "\n";
				bw.write(line);
				bw.close();
				System.out.println("Them ok");
			} catch (IOException e) {
				System.out.println("Them ko OK");
				// TODO: handle exception
			}
		}
	}

	@Override
	public void deleteSinhVien(String maSinhVien) {
		ArrayList<SinhVien> lstSV = getAllSinhVien();	
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(this.path));
			for (SinhVien sv : lstSV) {
				if (!sv.getMaSinhVien().equalsIgnoreCase(maSinhVien)) {
					String line = sv.getMaSinhVien() + "," 
							+ sv.getHoTen() + ","
							+ sv.getGioiTinhNam() + ","
							+ formatDate(sv.getNgaySinh()) + "\n";
					bw.write(line);
				}
			}
			bw.close();
			System.out.println("Xoa ok");
		} catch (IOException e) {
			System.out.println("Xoa ko OK");
			// TODO: handle exception
		}
	}
}
