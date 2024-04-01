package com.tvdat.dp.sf.UI;

import com.tvdat.dp.sf.DAO.SinhVienRepo;
import com.tvdat.dp.sf.DAO.SinhVienRepoSQL;
import com.tvdat.dp.sf.DAO.SinhVienRepoTEXT;
import com.tvdat.dp.sf.MODELS.CauHinh;

public class SinhVienRepoFactory {
	public SinhVienRepo createSinhVienRepo(CauHinh cfg) {
		if("SQLife".equals(cfg.getLoaiNguon())) {
			return new SinhVienRepoSQL(cfg.getChuoiKetNoi());
		}
		else {
			return new SinhVienRepoTEXT(cfg.getChuoiKetNoi());
		}
	}
}
