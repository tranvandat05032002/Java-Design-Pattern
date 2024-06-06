package com.tvdat.dp.Domain.MODELS.ConcreteState;

import com.tvdat.dp.Domain.MODELS.PhoneState;
import com.tvdat.dp.Domain.MODELS.Utils;
// ConcreteState
public class StateYenLang implements PhoneState {

	@Override
	public void onCalling() {
		System.out.printf("OnCalling: [\n");
		Utils.rung();
		System.out.printf("]\n");
			
	}

	@Override
	public void onSMSReceived() {
		System.out.printf("OnSMSReceived: [\n");
		System.out.printf("]\n");
		
	}

	@Override
	public void onSysNotification() {
		System.out.printf("onSysNotification: [\n");
		System.out.printf("]\n");
	}

}
