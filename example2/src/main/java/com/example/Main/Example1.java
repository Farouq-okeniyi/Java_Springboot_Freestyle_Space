package com.example.Main;
import java.beans.VetoableChangeListener;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.beans.Vehicle;
import com.example.config.projectConfig;

public class Example1 {
    public static void main(String[] args) {
        
        var context = new AnnotationConfigApplicationContext(projectConfig.class);
        //primary annotation beans usage
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println(vehicle.getName());

        // Vehicle veh = context.getBean("audiVehicle",Vehicle.class);
        // System.out.println(veh.getName());

        // Vehicle veh2 = context.getBean("mercedesVehicle",Vehicle.class);
        // System.out.println(veh2.getName());

        // Vehicle veh3 = context.getBean("bmwVehicles", Vehicle.class);
        // System.out.println(veh3.getName());

        vehicle.printHello();

    }
}
