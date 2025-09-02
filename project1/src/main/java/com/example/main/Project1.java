package com.example.main;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import com.example.services.VehicleServices;

public class Project1 {
    public static void main(String[] args) {
        
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        // String[] persons = context.getBeanNamesForType(Person.class);
        // Person person = context.getBean(Person.class);
        // String[] names = context.getBeanNamesForType(Vehicle.class);
        // //instead of using this vehicle, we can also get to vehicle from the person Component
        // // Vehicle vehicle = context.getBean(Vehicle.class);
        
        // // vehicle.getVehicleServices().playMusic();
        // // vehicle.getVehicleServices().rotate(); 
     
        // person.getVehicle().getVehicleServices().playMusic();
        // person.getVehicle().getVehicleServices().rotate();

        VehicleServices vehicleServices1 = context.getBean(VehicleServices.class);
        VehicleServices vehicleServices2 = context.getBean("vehicleServices", VehicleServices.class);
        System.out.println("hash code from vehicle service 1: " + vehicleServices1.hashCode());
        System.out.println("hash code from vehicle service 2: " + vehicleServices2.hashCode());

        if (vehicleServices1 == vehicleServices2) {
            System.out.println("Both vehicle services are the same instance.");
        } else {
            System.out.println("Vehicle services are different instances.");
        }
    }
}
