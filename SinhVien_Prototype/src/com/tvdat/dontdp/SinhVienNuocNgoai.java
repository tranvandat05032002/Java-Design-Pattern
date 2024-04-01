package com.tvdat.dontdp;
import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SinhVienNuocNgoai extends SinhVien {
	private String quocGia;
	
	public SinhVienNuocNgoai(String maSinhVien, String hoTen, String quocGia) {
		super(maSinhVien, hoTen);
		this.quocGia = quocGia;
	}
	public SinhVienNuocNgoai(SinhVienNuocNgoai x) {
		super(x);
		this.quocGia = x.quocGia;
	}
	@Override
	public String toString() {
		return "Sinh Vien: " + this.getHoTen() + " Co Quoc Tich là " + this.getQuocGia();
	}
}
