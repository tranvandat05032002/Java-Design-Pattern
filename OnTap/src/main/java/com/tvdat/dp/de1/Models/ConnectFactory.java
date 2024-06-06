package com.tvdat.dp.de1.Models;

public class ConnectFactory {
	public ConnectMethod getConnect(String connectType, String connectPath) {
		if(connectType.trim().equals("TEXT_FILE")) {			
			return new File(connectPath);
		}
		else if(connectType.trim().equals("MS_SQLServer")) {
			return new SQLServer(connectPath);
		}
		else {
			return new MySQL(connectPath);
		}
	}
}
