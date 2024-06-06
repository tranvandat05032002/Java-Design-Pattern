package com.tvdat._21T1020285_model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public interface _21T1020285_GiuXeMethod {
	double getChiPhi();
	boolean isMatched(_21t1020285_ThongTinRa x);
	default String formatDate(Date theDate) {
        DateFormat sdf = new SimpleDateFormat("HH:mm dd/MM/yyyy");
        return sdf.format(theDate);
    }
	default Date formatStringToDate(String theDateString) {
        DateFormat sdf = new SimpleDateFormat("HH:mm dd/MM/yyyy");
        try {
			return sdf.parse(theDateString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return null;
    }
	default double totalTime(int kieuXe, String thoiDiemVao, String thoiDiemRa) {
		String dateString1 = thoiDiemVao;
	    String dateString2 = thoiDiemRa;
        long secs = (formatStringToDate(dateString2).getTime() - formatStringToDate(dateString1).getTime()) / 1000;
        int totalHours = (int)secs / 3600;    
        secs = secs % 3600;
        int days = totalHours / 24;
        int hours = totalHours % 24;
        int mins = (int)secs / 60;
        secs = secs % 60;
        if((kieuXe == 0 || kieuXe == 2) && (hours != 0 || mins != 0)) {
        	days += 1;
        	return (int)days;
        }
        else if(kieuXe == 4 && (mins > 0 || totalHours > 0)) {
        	double gioGuiXeOto = (double)totalHours;
        	gioGuiXeOto = (mins <= 30) ? gioGuiXeOto + 0.5f : gioGuiXeOto + 1f;
        	return gioGuiXeOto;
        }
        else {
        	return 0;
        }
	}
}
