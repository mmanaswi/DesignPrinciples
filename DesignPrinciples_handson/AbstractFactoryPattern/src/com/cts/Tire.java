package com.cts;

public abstract class Tire extends Factory{

	private Tire tire;

	public Tire(Tire tire) {
		super();
		this.tire = tire;
	}

	public Tire getTire() {
		return tire;
	}
	
	
}
