package com.cts.observerpattern;

public class MainClient {

	public static void main(String args[]) {

		SteveObserver steveObserver = new SteveObserver("Steve");
		JohnObserver johnObserver = new JohnObserver("John");

		NotificationService service = new NotificationService();
		service.addSubscriber(steveObserver);
		service.addSubscriber(johnObserver);

		service.notifySubscriber();

		service.removeSubscriber(johnObserver);

		service.notifySubscriber();
	}
}
