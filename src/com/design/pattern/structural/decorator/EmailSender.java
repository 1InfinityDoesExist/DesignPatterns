package com.design.pattern.structural.decorator;

public class EmailSender implements NotificationSender {

	private NotificationSender sender;

	public EmailSender(NotificationSender sender) {
		super();
		this.sender = sender;
	}

	@Override
	public void send() {
		// TODO Auto-generated method stub

		if (sender != null) {
			sender.send();
		}
		System.out.println("Sending email notification");
	}

}
