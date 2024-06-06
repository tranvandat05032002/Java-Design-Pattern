package com.tvdat.dp.State;


public class StateImLang implements PhoneState {
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
