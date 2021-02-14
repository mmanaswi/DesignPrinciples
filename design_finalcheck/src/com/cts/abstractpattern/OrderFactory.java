package com.cts.abstractpattern;

public class OrderFactory {

	public static Order buildOrder(Channel channel, ProductType productType) {
		Order order = null;
		switch(channel) {
			case ECOMMERCE:
				order = ECOMMERCEOrderBuilder.buildOrder(productType);
				break;
			case TELECALLER:
				order = TELECALLEROrderBuilder.buildOrder(productType);
				break;
			default:
				break;
		}
		return order;
	}
}
