package com.design.pattern.behavioral.observer;

public class NotificationManager implements PaymentListener {
	private void sendNotifictions() {
		System.out.println("Notification sent");
	}

	@Override
	public void paymentMade() {
		sendNotifictions();

	}

}
