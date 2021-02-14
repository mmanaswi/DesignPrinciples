package com.cts.abstractpattern;

public class ToysOrder extends Order{

	public ToysOrder(Channel channel) {
		super(channel, ProductType.TOYS);
		processOrder();
}

	@Override
	public void processOrder() {
		System.out.println("***Connecting to Toys department***");
		
	}
}
