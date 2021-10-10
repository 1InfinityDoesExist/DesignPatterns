package com.design.pattern.structural.adapter_1;

public class AppNotificationSender implements NotificationSender {

	private final DependencyNotificationSender DependencyNotificationSender;

	public AppNotificationSender(
			com.design.pattern.structural.adapter_1.DependencyNotificationSender dependencyNotificationSender) {
		super();
		DependencyNotificationSender = dependencyNotificationSender;
	}

	@Override
	public void sendNotification() {
		DependencyNotificationSender.sendNotification();

	}

}
