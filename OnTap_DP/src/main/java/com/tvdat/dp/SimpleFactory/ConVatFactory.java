package com.tvdat.dp.SimpleFactory;

public class ConVatFactory {
	public ConVatMethod getConVatFactory(String loaiConVat) {
		if( "Meo".equals(loaiConVat)) {
			return new ConMeo();
		}
		else if("Cho".equals(loaiConVat)) {
			return new ConCho();
		}
		else {
			return new ConVit();
		}
	}
}
