package com.tvdat.dp.State;

public class Phone {
	PhoneState state;
	
	public void onCalling() {
		this.state.onCalling();
	}
	
	public void onSMSReceived() {
		this.state.onSMSReceived();
	}
	public void onSysNotification() {
		this.state.onSysNotification();
	}
	
	public void setProfile(PhoneState state) {
		System.out.printf("Thiết lập trạng thái [%s] cho điện thoại\n", state.getClass().toString());
		this.state = state;
	}
}
