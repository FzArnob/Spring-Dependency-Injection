package com.vehicle.categories;


import com.vehicle.engines.Engine;

public class car implements vehicle {

	private Engine engine;
	private String carName;
    private String engineType;
    public car(Engine engine) {
        this.engine = engine;
        this.engineType = engine.getType();
    }
    
    public void setVehicleName(String carName) {
        this.carName = carName;
    }
    public String getVehicleName() {
        return this.carName;
    }
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
    public String getEngineType() {
        return this.engineType;
    }

	public boolean startTheEngine(boolean status){
		return this.engine.turnOn(status);
	}
}
