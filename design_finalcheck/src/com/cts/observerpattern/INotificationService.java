package com.cts.observerpattern;

public interface INotificationService {

	public void addSubscriber(INotificationEventObserver observer);

	public void removeSubscriber(INotificationEventObserver observer);

	public void notifySubscriber();
}
