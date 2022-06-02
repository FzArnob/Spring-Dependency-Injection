package com.vehicle.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.vehicle.categories.bike;
import com.vehicle.categories.car;
import com.vehicle.categories.vehicle;
import com.vehicle.engines.CombustionEngine;
import com.vehicle.engines.ElectricalEngine;
import com.vehicle.engines.Engine;

@Configuration
@ComponentScan(value={"com.vehicle.categories"})
public class DIConfigeration {
	@Bean(name = "electricalEngine")
	@Primary
    public Engine getElectricalEngine() {
        return new ElectricalEngine();
    }

    @Bean(name= "combustionEngine")
    public Engine getCombustionEngine() {
        return new CombustionEngine();
    }
    
	@Bean(name="car")
	public vehicle getCar(){
		car car = new car(getElectricalEngine());
		return car;
	}
	@Bean(name="bike")
	public vehicle getBike(){
		bike bike = new bike();
		bike.setEngine(getCombustionEngine());
		return bike;
	}
}
