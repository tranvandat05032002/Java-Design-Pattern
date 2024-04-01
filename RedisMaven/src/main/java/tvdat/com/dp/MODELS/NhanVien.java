package tvdat.com.dp.MODELS;

import tvdat.com.dp.MODELS.Person;

public class NhanVien extends Person {
	
	public NhanVien(String maNhanvien, String hoTen, String loaiHopDong, int heSoLuong) {
		super(maNhanvien, hoTen, loaiHopDong, heSoLuong);
	}
	public String displayNhanVien() {
		return getMaNhanVien() + "\t" + getHoTen() + "\t" + getLoaiHopDong() + "\t" + getHeSoLuong();
	}

}
