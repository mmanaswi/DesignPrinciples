package com.cts.abstractpattern;

public abstract class Car {

	CarType model = null;
	Location location = null;

	Car(CarType model, Location location) {
		this.model = model;
		this.location = location;
	}

	CarType getModel() {
		return model;
	}

	void setModel(CarType model) {
		this.model = model;
	}

	Location getLocation() {
		return location;
	}

	void setLocation(Location location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "CarModel - " + model + " located in " + location;
	}

	abstract void construct();
}
