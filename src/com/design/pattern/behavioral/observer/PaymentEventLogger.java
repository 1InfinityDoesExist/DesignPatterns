package com.design.pattern.behavioral.observer;

public class PaymentEventLogger implements PaymentListener {

	private void logEvent() {
		System.out.println("Payment Received");
	}

	@Override
	public void paymentMade() {
		// TODO Auto-generated method stub
		logEvent();

	}

}
