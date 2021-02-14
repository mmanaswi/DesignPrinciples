package com.cts.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class NotificationService implements INotificationService {

	List<INotificationObserver> observers = new ArrayList<INotificationObserver>();

	@Override
	public void addSubscriber(INotificationObserver observer) {
		observers.add(observer);
		System.out.println("All observers in list after adding:");
		for (INotificationObserver o : observers) {
			System.out.println(o + " ");
		}

	}

	@Override
	public void removeSubscriber(INotificationObserver observer) {
		observers.remove(observer);
		System.out.println("All observers in list after removing:");
		for (INotificationObserver o : observers) {
			System.out.println(o + " ");
		}
	}

	@Override
	public void notifySubscriber() {
		for (INotificationObserver o : observers) {
			o.onServerDown();
		}

	}

}
