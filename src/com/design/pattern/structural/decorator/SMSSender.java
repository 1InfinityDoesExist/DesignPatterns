package com.design.pattern.structural.decorator;

public class SMSSender implements NotificationSender {

	private final NotificationSender sender;

	public SMSSender(NotificationSender sender) {
		super();
		this.sender = sender;
	}

	@Override
	public void send() {
		// TODO Auto-generated method stub
		if (sender != null) {
			sender.send();
		}
		System.out.println("Sending SMS notification");

	}

}
