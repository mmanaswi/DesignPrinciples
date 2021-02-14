package com.cts.abstractpattern;

public class MainClient {

	public static void main(String[] args) { 
		System.out.println(OrderFactory.buildOrder(Channel.ECOMMERCE, ProductType.TOYS));
		System.out.println(OrderFactory.buildOrder(Channel.ECOMMERCE, ProductType.ELECTRONICS));
		System.out.println(OrderFactory.buildOrder(Channel.ECOMMERCE, ProductType.FURNITURE));
		System.out.println(OrderFactory.buildOrder(Channel.TELECALLER, ProductType.TOYS));
		System.out.println(OrderFactory.buildOrder(Channel.TELECALLER, ProductType.ELECTRONICS));
		System.out.println(OrderFactory.buildOrder(Channel.TELECALLER, ProductType.FURNITURE));
		}
}
