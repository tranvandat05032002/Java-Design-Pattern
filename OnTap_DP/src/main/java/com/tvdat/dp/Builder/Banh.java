package com.tvdat.dp.Builder;
import lombok.*;
@Getter
public class Banh {
	// thuộc tính bắt buộc có
	private double duong;
	private double bot;
	
	// thuộc tính tuỳ chọn
	private double vani;
	private double nuocDua;
	private double cacao;
	private double ot;
	private double tieu;
	
	// 1. tạo inner class cho class Banh
	public static class Builder {
		// thuộc tính bắt buộc có
		private double duong;
		private double bot;
		
		// thuộc tính tuỳ chọn
		private double vani;
		private double nuocDua;
		private double cacao;
		private double ot;
		private double tieu;
		
		// 2. tạo constructor cho các thuộc tính bắt buộc
		public Builder(double duong, double bot) {
			this.duong = duong;
			this.bot = bot;
		}
		// với mỗi thuộc tính optional tạo một Builder x(Type value){this.x = value; return thisd}
		public Builder vani(double value) {
			this.vani = value;
			return this;
		}
		public Builder nuocDua(double value) {
			this.nuocDua = value;
			return this;
		}
		public Builder caCao(double value) {
			this.cacao = value;
			return this;
		}
		public Builder ot(double value) {
			this.ot = value;
			return this;
		}
		public Builder tieu(double value) {
			this.tieu = value;
			return this;
		}
		// tạo hàm build
		public Banh build() {
			return new Banh(this);
		}
	}
	//5. Hàm dựng với đối số Builder
	private Banh(Builder b) {
		this.duong = b.duong;
		this.bot = b.bot;
		this.vani = b.vani;
		this.cacao = b.cacao;
		this.nuocDua = b.nuocDua;
		this.ot = b.ot;
		this.tieu = b.tieu;
	}
}
