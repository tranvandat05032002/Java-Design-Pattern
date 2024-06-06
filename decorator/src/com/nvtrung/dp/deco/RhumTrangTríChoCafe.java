package com.nvtrung.dp.deco;

import com.nvtrung.dp.component.Cafe;

public class RhumTrangTríChoCafe extends TrangTríChoCafe{

	@Override
	public String getMôTả() {
		return this.cafe.getMôTả() + ", rhum";
	}

	@Override
	public double getGiá() {
		return this.cafe.getGiá() + 5500;
	}

	// Hàm constructr
	// Thêm lớp trang trí Rhum vào cho ly café x
	public RhumTrangTríChoCafe(Cafe x) throws Exception {
		// Kiểm tra xem trước đó đã thêm Đường hoặc Sữa hay chưa
		boolean daCoDuongHoacSua = false;
		Cafe x2 = x;
		while (true) {
			if (x2 instanceof TrangTríChoCafe) {
				// Thực hiện kiểm tra
				if (x2 instanceof ĐườngTrangTríChoCafe ||
					x2 instanceof SữaTrangTríChoCafe) {
					daCoDuongHoacSua = true;
					break;
				}
				x2 = ((TrangTríChoCafe) x2).getCafe();
			} else
				break;
		}
		
		if (daCoDuongHoacSua)
			throw new Exception("Không được trang trí thêm Rhum khi đã có đường/sữa");
		
		this.cafe = x;
	}
}
