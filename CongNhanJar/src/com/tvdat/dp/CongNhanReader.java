package com.tvdat.dp;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class CongNhanReader {
	public static List<CongNhan> readFromFile(String filename) throws IOException {
			List<CongNhan> lst = new ArrayList<>();
			BufferedReader br = new BufferedReader(new FileReader(filename));
			while (true) {
					String line = br.readLine();
					if (line == null)
							break;
					
					// Tách chuỗi: hoTen, ngayBatDauLamViec
					String[] info = line.split(",");
					if (info.length < 2)
							continue;
					
					String hoTen = info[0].trim();
					String ngayBatDauLamViec = info[1].trim();
					SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
					Date startDateWork = null;
					CongNhan x;
					try {
						startDateWork = formatter.parse(ngayBatDauLamViec);
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					x = new CongNhan(hoTen, startDateWork);
					lst.add(x);	
			}
			br.close();
			
			return lst;
	}
}
