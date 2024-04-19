package com.tvdat.Infrastructure.UI;

import com.tvdat.dp.Domain.MODELS.Phone;
import com.tvdat.dp.Domain.MODELS.ConcreteState.StateChuan;
import com.tvdat.dp.Domain.MODELS.ConcreteState.StateNgoaiTroi;
import com.tvdat.dp.Domain.MODELS.ConcreteState.StateYenLang;

//Client
public class Client {

	public static void main(String[] args) {
		Phone dt = new Phone();
		
		dt.setProfile(new StateChuan());
		dt.onCalling();
		dt.onSMSReceived();
		dt.onSysNotification();
		
		System.out.println("----------------------------------------");
		
		dt.setProfile(new StateNgoaiTroi());
		dt.onCalling();
		dt.onSMSReceived();
		dt.onSysNotification();
		
		System.out.println("----------------------------------------");
		
		dt.setProfile(new StateYenLang());
		dt.onCalling();
		dt.onSMSReceived();
		dt.onSysNotification();
	}

}
