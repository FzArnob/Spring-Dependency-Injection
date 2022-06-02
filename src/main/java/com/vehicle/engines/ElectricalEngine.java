package com.vehicle.engines;

public class ElectricalEngine implements Engine {
	public String getType() {
		return "Electrical Engine";
	}
	public boolean turnOn(boolean status) {
		if(status) {
			System.out.println("Electric Engine successfully turned on.");
			return true;
		} else {
			System.out.println("Failed to turn on electric engine");
			return false;
		}
	}
}
