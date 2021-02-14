package com.cts.abstractpattern;

public class ElectronicOrder extends Order{

	public ElectronicOrder(Channel channel) {
		super(channel, ProductType.ELECTRONICS);
		processOrder();
}

	@Override
	public void processOrder() {
		System.out.println("***Connecting to Electronics department***");
		
	}

}
