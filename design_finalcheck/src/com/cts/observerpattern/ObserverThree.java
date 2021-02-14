package com.cts.observerpattern;

public class ObserverThree implements INotificationEventObserver{

private String eventName;
private String observerName;
	
	public String getEventName() {
		return eventName;
	}
	
	public String getName() {
		return observerName;
	}

	public ObserverThree(String observerName,String eventName) {
		super();
		this.observerName=observerName;
		this.eventName = eventName;
	}


	@Override
	public void on100TicketsBooked() {
		System.out.println("Hello "+observerName+"!!! The event " + eventName + " has crossed 100 ticket bookings!!!");
		System.out.println();
		
	}
}
