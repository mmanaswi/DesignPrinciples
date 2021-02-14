package com.cts.observerpattern;

public class SteveObserver implements INotificationObserver {

	private String name;

	public String getName() {
		return name;
	}

	public SteveObserver(String name) {
		super();
		this.name = name;
	}

	@Override
	public void onServerDown() {
		System.out.println("Hello " + name + "! Notification received!!!");

	}

}
