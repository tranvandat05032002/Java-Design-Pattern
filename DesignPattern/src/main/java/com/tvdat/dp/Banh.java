package com.tvdat.dp;

public class Banh {
	private double duong;
	private double bot;
	
	private double vani;
	private double nuocDua;
	private double cacao;
	private double ot;
	private double tieu;
	
	
	public static class BanhBuider {
		private double duong;
		private double bot;
		
		private double vani;
		private double nuocDua;
		private double cacao;
		private double ot;
		private double tieu;
		
		public BanhBuilder(double duong, double bot) {
			this.duong = duong;
			this.bot = bot;
		}
		public BanhBuilder vani(double value) {
			this.vani = value;
			return this;
		}
	}
}
