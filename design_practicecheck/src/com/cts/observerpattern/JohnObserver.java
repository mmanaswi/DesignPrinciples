package com.cts.observerpattern;

public class JohnObserver implements INotificationObserver {

	private String name;

	public String getName() {
		return name;
	}

	public JohnObserver(String name) {
		super();
		this.name = name;
	}

	@Override
	public void onServerDown() {
		System.out.println("Hello " + name + "! Notification received!!!");

	}

}
