package com.tvdat._21T1020285_UI;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.tvdat._21T1020285_model._21t1020285_ReadFile;
import com.tvdat._21T1020285_model._21t1020285_ThongTinGiuXe;
import com.tvdat._21T1020285_model._21t1020285_ThongTinGiuXeDap;
import com.tvdat._21T1020285_model._21t1020285_ThongTinGiuXeMay;
import com.tvdat._21T1020285_model._21t1020285_ThongTinGiuXeOto;
import com.tvdat._21T1020285_model._21t1020285_ThongTinRa;
import com.tvdat._21T1020285_model._21t1020285_ThongTinVao;

public class _21T1020285_Client {
	public static String getLoaiXe(int loaiXe) {
		if(loaiXe == 0) {
			return "Xe Đạp";
		}
		else if(loaiXe == 2) {
			return "Xe Máy";
		}
		else if(loaiXe == 4) {
			return "Xe Oto";
		}
		else {
			return "Loại xe không hợp lệ";
		}
	}
	public static String getHuHong(int n) {
		if(n == -1) {
			return "không xác định giá tiền gửi xe.";
		}
		return null;
		
	}
	public static void solve() {
		String pathFileVao = "/Users/spiderman/Documents/DHKH_2021-2025/DP_Java/21T1020285-TranVanDat/src/lib/vao.txt";
		String pathFileRa = "/Users/spiderman/Documents/DHKH_2021-2025/DP_Java/21T1020285-TranVanDat/src/lib/ra.txt";
		_21t1020285_ReadFile rf = null;
		List<_21t1020285_ThongTinGiuXeDap> lstXD = new ArrayList<_21t1020285_ThongTinGiuXeDap>();
		List<_21t1020285_ThongTinGiuXeMay> lstXM = new ArrayList<_21t1020285_ThongTinGiuXeMay>();
		List<_21t1020285_ThongTinGiuXeOto> lstOto = new ArrayList<_21t1020285_ThongTinGiuXeOto>();
		try {
			List<_21t1020285_ThongTinVao> lstVao = rf.readFromFileVao(pathFileVao); 
			for(int i = 0; i < lstVao.size(); i++) {
				_21t1020285_ThongTinVao ttVao = lstVao.get(i);
				if(ttVao.getLoaiXe() == 0) {
					_21t1020285_ThongTinGiuXeDap ttXD = new _21t1020285_ThongTinGiuXeDap();
					ttXD.setSoVeXe(ttVao.getSoVeXe());
					ttXD.setThoiDiemVao(ttVao.getThoiGianVaoBai());
					ttXD.setThoiDiemRa(null);
					lstXD.add(ttXD);
				}
				else if(ttVao.getLoaiXe() == 2) {
					_21t1020285_ThongTinGiuXeMay ttXM = new _21t1020285_ThongTinGiuXeMay();
					ttXM.setBienSoXe(ttVao.getBienSoXe());
					ttXM.setThoiDiemVao(ttVao.getThoiGianVaoBai());
					ttXM.setThoiDiemRa(null);
					lstXM.add(ttXM);
				}
				else if(ttVao.getLoaiXe() == 4) {
					_21t1020285_ThongTinGiuXeOto ttOto = new _21t1020285_ThongTinGiuXeOto();
					ttOto.setBienSoXe(ttVao.getBienSoXe());
					ttOto.setThoiDiemVao(ttVao.getThoiGianVaoBai());
					ttOto.setTrangThaiKhiVao(ttVao.getTinhTrangVaoBai());
					ttOto.setTrangThaiKhiRa(null);
					ttOto.setThoiDiemRa(null);
					lstOto.add(ttOto);
				}
			}
			
			System.out.println("STT\tThời điểm vao\t\t\t\tXe\t\tLoại xe\t\t\tTình trạng 1\t\t\tThời điểm ra\t\t\t\tTình trạng 2\t\t\tGiá giữ xe");
			List<_21t1020285_ThongTinRa> lstRa = rf.readFromFileRa(pathFileRa);
			for(int i = 0; i < lstRa.size(); i++) {
				_21t1020285_ThongTinRa ttRa = lstRa.get(i);
				int STT = i + 1;
				for(int j = 0; j < lstXD.size(); j++) {
					_21t1020285_ThongTinGiuXeDap ttXDVao = lstXD.get(j);
					if(ttXDVao.isMatched(ttRa)) {
						ttXDVao.setThoiDiemRa(ttRa.getThoiGianRaBai());
						_21t1020285_ThongTinVao xdRM = new _21t1020285_ThongTinVao(ttRa.getLoaiXe(), ttRa.getBienSoXe(), ttRa.getSoVeXe(), ttXDVao.getThoiDiemVao(), "Not Available");
						lstVao.remove(xdRM);
						System.out.println(STT + "\t" + ttXDVao.getThoiDiemVao() + "\t\t" + ttRa.xe() + "\t" +  getLoaiXe(ttRa.getLoaiXe()) + "\t\t\t" + "-" + "\t\t\t\t" + ttRa.getThoiGianRaBai() + "\t\t" + "-" + "\t\t\t\t" + ttXDVao.getChiPhi());
					}	
				}
				for(int k = 0; k < lstXM.size(); k++) {
					_21t1020285_ThongTinGiuXeMay ttXMVao = lstXM.get(k);
					if(ttXMVao.isMatched(ttRa)) {
						ttXMVao.setThoiDiemRa(ttRa.getThoiGianRaBai());
						_21t1020285_ThongTinVao xmRM = new _21t1020285_ThongTinVao(ttRa.getLoaiXe(), ttRa.getBienSoXe(), ttRa.getSoVeXe(), ttXMVao.getThoiDiemVao(), "Not Available");
						lstVao.remove(xmRM);
						System.out.println(STT + "\t" + ttXMVao.getThoiDiemVao() + "\t\t" + ttRa.xe() + "\t" +  getLoaiXe(ttRa.getLoaiXe()) + "\t\t\t" + "-" + "\t\t\t\t" + ttRa.getThoiGianRaBai() + "\t\t" + "-" + "\t\t\t\t" + ttXMVao.getChiPhi());
					}	
				}
				for(int v = 0; v < lstOto.size(); v++) {
					_21t1020285_ThongTinGiuXeOto ttOtoVao = lstOto.get(v);
					if(ttOtoVao.isMatched(ttRa)) {
						ttOtoVao.setTrangThaiKhiRa(ttRa.getTinhTrangRaBai());
						ttOtoVao.setThoiDiemRa(ttRa.getThoiGianRaBai());
						_21t1020285_ThongTinVao otoRM = new _21t1020285_ThongTinVao(ttRa.getLoaiXe(), ttRa.getBienSoXe(), ttRa.getSoVeXe(), ttOtoVao.getThoiDiemVao(), ttOtoVao.getTrangThaiKhiVao());
						lstVao.remove(otoRM);
						if(ttOtoVao.getChiPhi() == -1) {
							System.out.println(STT + "\t" + ttOtoVao.getThoiDiemVao() + "\t\t" + ttRa.xe() + "\t" +  getLoaiXe(ttRa.getLoaiXe()) + "\t\t\t" + ttOtoVao.getTrangThaiKhiVao() + "\t" + ttRa.getThoiGianRaBai() + "\t\t" + ttOtoVao.getTrangThaiKhiRa() + "\t\t\t" + "không xác định giá tiền gửi xe.");	
						}
						else {
							System.out.println(STT + "\t" + ttOtoVao.getThoiDiemVao() + "\t\t" + ttRa.xe() + "\t" +  getLoaiXe(ttRa.getLoaiXe()) + "\t\t\t" + ttOtoVao.getTrangThaiKhiVao() + "\t" + ttRa.getThoiGianRaBai() + "\t\t" + ttOtoVao.getTrangThaiKhiRa() + "\t" + ttOtoVao.getChiPhi());
						}
						
					}
				}
			}
			System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
			System.out.println("STT\tThời điểm vào\t\t\t\tXe\t\t\tLoại xe\t\t\tTình trạng");
			for(int i = 0; i < lstVao.size(); i++) {
				int STT = i + 1;
				_21t1020285_ThongTinVao ttVao = lstVao.get(i);
				String tinhTrang =  "";
				if(ttVao.getTinhTrangVaoBai().compareTo("Not Available") == 0) {
					tinhTrang = "-";
				}
				else {
					tinhTrang = ttVao.getTinhTrangVaoBai();
				}
				System.out.println(STT + "\t" + ttVao.getThoiGianVaoBai() + "\t\t" + ttVao.xe() + "\t\t" + getLoaiXe(ttVao.getLoaiXe()) + "\t\t\t" + tinhTrang);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		solve();
	}

}
