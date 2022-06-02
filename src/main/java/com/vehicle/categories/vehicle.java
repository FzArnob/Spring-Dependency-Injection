package com.vehicle.categories;

import com.vehicle.engines.Engine;

public interface vehicle {
	public void setVehicleName(String name);
    public String getVehicleName();
    public String getEngineType();
    public void setEngine(Engine engine);
    public boolean startTheEngine(boolean status);
}
