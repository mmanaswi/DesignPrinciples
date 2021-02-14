package com.cts.observerpattern;

public class MainClient {

	public static void main(String args[]) {

		ObserverOne observerOne = new ObserverOne("Sam","Dance Competetion");
		ObserverTwo observerTwo = new ObserverTwo("Max","Music Competetion");
		ObserverThree observerThree = new ObserverThree("Riya","Art Competetion");

		NotificationService service = new NotificationService();
		service.addSubscriber(observerOne);
		service.addSubscriber(observerTwo);
		service.addSubscriber(observerThree);

		service.notifySubscriber();

		service.removeSubscriber(observerTwo);

		service.notifySubscriber();
	}
}
