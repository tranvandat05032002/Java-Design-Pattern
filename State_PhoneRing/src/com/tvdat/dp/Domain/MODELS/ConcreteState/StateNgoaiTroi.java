package com.tvdat.dp.Domain.MODELS.ConcreteState;

import com.tvdat.dp.Domain.MODELS.PhoneState;
import com.tvdat.dp.Domain.MODELS.Utils;
// ConcreteState
public class StateNgoaiTroi implements PhoneState {

	@Override
	public void onCalling() {
		System.out.printf("OnCalling: [\n");
		Utils.rung();
		Utils.rung();
		Utils.rung();
		Utils.phatAmThanh(100, 5);
		System.out.printf("]\n");
		
	}

	@Override
	public void onSMSReceived() {
		System.out.printf("OnSMS Received: [\n");
		Utils.phatAmThanh(100, 1);
		System.out.printf("]\n");
	}

	@Override
	public void onSysNotification() {
		System.out.printf("On System Notification: [\n");
		Utils.phatAmThanh(90, 1);
		System.out.printf("]\n");
	}

}
