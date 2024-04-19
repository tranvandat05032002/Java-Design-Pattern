package com.tvdat.dp.Domain.MODELS.ConcreteState;

import com.tvdat.dp.Domain.MODELS.PhoneState;
import com.tvdat.dp.Domain.MODELS.Utils;
// ConcreteState
public class StateChuan implements PhoneState {

	@Override
	public void onCalling() {
		System.out.printf("OnCalling: [\n");
		Utils.rung();
		Utils.phatAmThanh(80, 3);
		System.out.printf("]\n");
	}

	@Override
	public void onSMSReceived() {
		System.out.println("On SMS received: [");
		Utils.phatAmThanh(60, 1);
		System.out.println("]");
	}

	@Override
	public void onSysNotification() {
		System.out.println("On System Notification: [");
		Utils.phatAmThanh(50, 1);
		System.out.println("]");
		
	}
	
}
