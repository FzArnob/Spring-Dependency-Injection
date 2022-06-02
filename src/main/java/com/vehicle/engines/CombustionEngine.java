package com.vehicle.engines;

public class CombustionEngine implements Engine {
	public String getType() {
		return "Combustion Engine";
	}
	public boolean turnOn(boolean status) {
		if(status) {
			System.out.println("Combustion Engine successfully turned on.");
			return true;
		} else {
			System.out.println("Failed to turn on combustion engine");
			return false;
		}
	}
}
