package com.tvdat.Simple.DAO;

import com.tvdat.Simple.MODELS.SinhVienFILE;
import com.tvdat.Simple.MODELS.SinhVienSQL;
import com.tvdat.Simple.UI.SinhVienMethod;

public class SinhVienFactory {
	public SinhVienMethod getSinhVien(String type) {
		switch(type) {
		  case "SQL":
		    return new SinhVienSQL();
		  case "FILE":
		    // code block
			return new SinhVienFILE();
		}
		return null;
	}
}
