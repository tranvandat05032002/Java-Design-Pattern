package com.tvdat.dp.Prototype;

@lombok.AllArgsConstructor 
@lombok.NoArgsConstructor
@lombok.Getter
@lombok.Setter
public class SinhVienNuocNgoai extends SinhVien {
	private String quocGia;
	
	public String getQuocGia() {
		return quocGia;
	}
	
	public void setQuocGia(String qg) {
		this.quocGia = qg;
	}
	public SinhVienNuocNgoai(String maSinhVien, String hoTen, String quocGia) {
		super(maSinhVien, hoTen);
		this.quocGia = quocGia;
	}
	public SinhVienNuocNgoai(SinhVienNuocNgoai x) {
		super(x);
		this.quocGia = x.quocGia;
	}
	@Override
	public SinhVien taoBanSao() {
		return new SinhVienNuocNgoai(this);
	}
	@Override
	public String toString() {
		return "Sinh viên NUOC NGOAI " + this.getHoTen() + " có quốc tịch = " + this.getQuocGia();
	}	
}