package com.vehicle.categories;


import com.vehicle.engines.Engine;

public class bike implements vehicle {

	private Engine engine;
	private String bikeName;
    private String engineType;
    public void setVehicleName(String bikeName) {
        this.bikeName = bikeName;
    }
    public String getVehicleName() {
        return this.bikeName;
    }
    public void setEngine(Engine engine) {
        this.engine = engine;
        this.engineType = engine.getType();
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
