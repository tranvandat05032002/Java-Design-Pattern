package com.tvdat._21T1020285_model;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class _21t1020285_ReadFile {
	public static String formatDate(Date theDate) {
        DateFormat sdf = new SimpleDateFormat("HH:mm dd/MM/yyyy");
        return sdf.format(theDate);
    }
	public static Date formatStringToDate(String theDateString) {
        DateFormat sdf = new SimpleDateFormat("HH:mm dd/MM/yyyy");
        try {
			return sdf.parse(theDateString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return null;
    }
	public static List<_21t1020285_ThongTinVao> readFromFileVao(String filename) throws IOException {
		List<_21t1020285_ThongTinVao> lstVao = new ArrayList<>();
		BufferedReader br = new BufferedReader(new FileReader(filename));
		while (true) {
				String line = br.readLine();
				if (line == null)
						break;
				String[] info = line.split(";");
				if (info.length < 5)
						continue;
				
				int loaiXe =  Integer.parseInt(info[0].trim());
				String bienSoXe = info[1].trim();
				String soVeXe = info[2].trim();
				Date thoiGianVaoBai = formatStringToDate(info[3].trim());
				String tinhTrangVaoBai = info[4].trim();
				_21t1020285_ThongTinVao x = new _21t1020285_ThongTinVao(loaiXe, bienSoXe, soVeXe, thoiGianVaoBai, tinhTrangVaoBai);
				lstVao.add(x);
		}
		br.close();
		
		return lstVao;
	}
	public static List<_21t1020285_ThongTinRa> readFromFileRa(String filename) throws IOException {
		List<_21t1020285_ThongTinRa> lstRa = new ArrayList<>();
		BufferedReader br = new BufferedReader(new FileReader(filename));
		while (true) {
				String line = br.readLine();
				if (line == null)
						break;
				String[] info = line.split(";");
				if (info.length < 5)
						continue;
				
				int loaiXe =  Integer.parseInt(info[0].trim());
				String bienSoXe = info[1].trim();
				String soVeXe = info[2].trim();
				Date thoiGianRaBai = formatStringToDate(info[3].trim());
				String tinhTrangRaBai = info[4].trim();
				_21t1020285_ThongTinRa x = new _21t1020285_ThongTinRa(loaiXe, bienSoXe, soVeXe, thoiGianRaBai, tinhTrangRaBai);
				lstRa.add(x);
		}
		br.close();
		
		return lstRa;
	}
}
