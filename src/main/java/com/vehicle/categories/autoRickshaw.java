package com.vehicle.categories;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vehicle.engines.Engine;
@Component
public class autoRickshaw implements vehicle {

	private Engine engine;
	private String autoRickshawName;
    private String engineType;
    public void setVehicleName(String autoRickshawName) {
        this.autoRickshawName = autoRickshawName;
    }
    public String getVehicleName() {
        return this.autoRickshawName;
    }
    @Autowired
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
