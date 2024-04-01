package com.tvdat.shape.adapter;
import lombok.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoTron {
	private double BanKinh;
	
	public boolean isFit(CocTron x) {
		return this.getBanKinh() >= x.getBanKinh();
	}
}
