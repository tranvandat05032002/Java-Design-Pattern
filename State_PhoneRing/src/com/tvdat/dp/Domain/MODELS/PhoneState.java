package com.tvdat.dp.Domain.MODELS;
//State
public interface PhoneState {
	void onCalling();
	void onSMSReceived();
	void onSysNotification();
}
