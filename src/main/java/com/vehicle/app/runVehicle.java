/* 
 * @groupId      com.vehicle
 * @artifactId   Spring-Dependency-Injection
 * @author       FzArnob
 * @copyright    2022 FzArnob
 * @license      MIT License
 * @version      0.0.1
*/

package com.vehicle.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vehicle.categories.autoRickshaw;
import com.vehicle.categories.bike;
import com.vehicle.categories.car;
import com.vehicle.categories.vehicle;
import com.vehicle.config.DIConfiguration;


public class runVehicle {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfiguration.class);
		System.out.println("BASIC JAVA Annotation Dependency Injection");
		vehicle electricCar = context.getBean(car.class);
		electricCar.setVehicleName("Tesla Model X");
		//output
		System.out.println("=================================================");
		System.out.println("Car Name: " + electricCar.getVehicleName());
		System.out.println("Car EnginType: " + electricCar.getEngineType());
		electricCar.startTheEngine(true);
		System.out.println("=================================================");
		vehicle fuelBike = context.getBean(bike.class);
		fuelBike.setVehicleName("Yamaha FZS-FI V 3.0");
		//output
		System.out.println("Bike Name: " + fuelBike.getVehicleName());
		System.out.println("Bike EnginType: " + fuelBike.getEngineType());
		fuelBike.startTheEngine(true);
		System.out.println("=================================================");
		
		System.out.println();
		
		System.out.println("XML Based Annotation Dependency Injection");
		ApplicationContext context_XML = new ClassPathXmlApplicationContext("applicationContext.xml");
		vehicle fuelCar = context_XML.getBean("car", car.class);
        fuelCar.setVehicleName("Mercedes-Benz S-Class");
		//output
		System.out.println("=================================================");
		System.out.println("Car Name: " + fuelCar.getVehicleName());
		System.out.println("Car EnginType: " + fuelCar.getEngineType());
		fuelCar.startTheEngine(true);
		System.out.println("=================================================");
		vehicle electricBike = context_XML.getBean("bike", bike.class);
		electricBike.setVehicleName("TVS iQube");
		//output
		System.out.println("Bike Name: " + electricBike.getVehicleName());
		System.out.println("Bike EnginType: " + electricBike.getEngineType());
		electricBike.startTheEngine(true);
		System.out.println("=================================================");

		System.out.println();
		
		System.out.println("Automated Annotation Dependency Injection");
		vehicle autoRickshaw = context.getBean(autoRickshaw.class);
		autoRickshaw.setVehicleName("Bajaj RE Optima Auto");
		//output
		System.out.println("=================================================");
		System.out.println("Auto Rickshaw Name: " + autoRickshaw.getVehicleName());
		System.out.println("Auto Rickshaw EnginType: " + autoRickshaw.getEngineType());
		autoRickshaw.startTheEngine(true);
		System.out.println("=================================================");
		//close all context
		context.close();
		((ConfigurableApplicationContext) context_XML).close();
	}
}
