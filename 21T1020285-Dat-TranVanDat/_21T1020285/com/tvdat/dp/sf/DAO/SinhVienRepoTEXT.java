package com.tvdat.dp.sf.DAO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
//import java.util.Date;

import com.tvdat.dp.sf.MODELS.SinhVien;

public class SinhVienRepoTEXT implements SinhVienRepo {
	private static String path = null;
	public SinhVienRepoTEXT(String path) {
		this.path = path;
	}
	public void insertSinhVien(SinhVien sv) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(this.path));
			String line;
	        boolean exists = false;

	        while ((line = br.readLine()) != null) {
	            String[] parts = line.split(",");
	            if (parts.length > 0 && parts[0].equals(sv.getMaSinhVien())) {
	                exists = true;
	                break;
	            }
	        }
			br.close();
			
			if (!exists) {
				BufferedWriter writer = new BufferedWriter(new FileWriter(this.path, true));
				Format formatter = new SimpleDateFormat("yyyy-MM-dd");
	            String ngaySinh = formatter.format(sv.getNgaySinh());
				String[] parts = ngaySinh.split("-");
				if (parts.length == 3) {
				    ngaySinh = parts[0] + "/" + parts[1] + "/" + parts[2];
				} else {
				    System.out.println("Invalid date format: " + ngaySinh);
				}
				writer.write(sv.getMaSinhVien() + "," + sv.getHoTen() + "," + sv.isGioiTinhNam() + "," + ngaySinh);
				writer.newLine();
                writer.close();
                System.out.println("Thêm sinh viên thành công!");
            } else {
                System.out.println("Mã sinh viên đã tồn tại!");
            }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public ArrayList<SinhVien> getSinhVien()  {
		ArrayList<SinhVien> lstSV = new ArrayList<SinhVien>();
		try{
			BufferedReader br = new BufferedReader(new FileReader(this.path));
			while (true) {
				String line = br.readLine();
				if (line == null || line == "") {
					break;
				} else {
					String lineSinhVien[] = line.trim().split(",");
					if(lineSinhVien.length == 4) {
						for(int i = 0; i < lineSinhVien.length; i++) {
							String maNhanVien = lineSinhVien[0].trim();
							String hoTen = lineSinhVien[1].trim();
							boolean gioiTinhNam = Boolean.parseBoolean(lineSinhVien[2].trim());
							String ngaySinh = lineSinhVien[3].trim();;
							String[] parts = ngaySinh.split("/");
							if (parts.length == 3) {
							    ngaySinh = parts[0] + "-" + parts[1] + "-" + parts[2];
							} else {
							    System.out.println("Invalid date format: " + ngaySinh);
							}
							SinhVien sv = new SinhVien(maNhanVien, hoTen, gioiTinhNam, Date.valueOf(ngaySinh));
							lstSV.add(sv);
							break;
						}
					}
				}
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lstSV;
	}

	public void deleteSinhVien(String MaSinhVien) {
		File inputFile = new File(this.path);
		File tempFile = new File("/Users/spiderman/Documents/DHKH_2021-2025/DP_Java/21T1020285-Dat-TranVanDat/lib/sinhvientmp.txt");
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(inputFile));
			BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
			String currentLine;

			while((currentLine = reader.readLine()) != null) {
			    String[] trimmedLine = currentLine.trim().split(",");
			    if(trimmedLine[0].equals(MaSinhVien)) {
			    	continue;
			    };
			    writer.write(currentLine + System.getProperty("line.separator"));
			}
			writer.close(); 
			reader.close(); 
			inputFile.delete();
			boolean successfull = tempFile.renameTo(inputFile);
			if(successfull) {
				System.out.println("Xoa sinh vien thah cong!!!");
			}
			else {
				System.out.println("Xoa sinh vien that bai!!!");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
