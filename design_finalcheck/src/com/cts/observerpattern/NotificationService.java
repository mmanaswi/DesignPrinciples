package com.cts.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class NotificationService implements INotificationService{

	List<INotificationEventObserver> observers = new ArrayList<INotificationEventObserver>();
	@Override
	public void addSubscriber(INotificationEventObserver observer) {
		observers.add(observer);
		System.out.println("All observers in list after adding:");
		for (INotificationEventObserver o : observers) {
			System.out.println(o + " ");
		}
		
	}

	@Override
	public void removeSubscriber(INotificationEventObserver observer) {
		observers.remove(observer);
		System.out.println("All observers in list after removing:");
		for (INotificationEventObserver o : observers) {
			System.out.println(o + " ");
		}
		
	}

	@Override
	public void notifySubscriber() {
		for (INotificationEventObserver o : observers) {
			o.on100TicketsBooked();
		}
		
	}

}
