package com.design.pattern.behavioral.observer;

public class Main {

	public static void main(String[] args) {

		PaymentManager paymentManager = new PaymentManager();
		PaymentListener p1 = new NotificationManager();
		paymentManager.registerPaymentListener(p1);

		PaymentListener p2 = new PaymentEventLogger();
		paymentManager.registerPaymentListener(p2);

		System.out.println("-------------1st ------------------------");
		paymentManager.pay();

		paymentManager.unregisterPaymentListener(p1);

		System.out.println("------------------2nd------------------");
		paymentManager.pay();
	}

}
