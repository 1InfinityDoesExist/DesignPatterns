package com.design.pattern.structural.decorator;

public class Main {

	public static void main(String[] args) {

		NotificationSender s1 = new EmailSender(new SMSSender(null));

		NotificationSender s2 = new SMSSender(new EmailSender(null));

		NotificationSender s3 = new SMSSender(new SMSSender(new SMSSender(null)));

//		s1.send();
//		s2.send();

		s3.send();
	}

}
