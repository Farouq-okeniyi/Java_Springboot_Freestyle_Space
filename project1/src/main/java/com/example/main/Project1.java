package com.example.main;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;

public class Project1 {
    public static void main(String[] args) {
        
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        String[] persons = context.getBeanNamesForType(Person.class);
        Person person = context.getBean(Person.class);
        String[] names = context.getBeanNamesForType(Vehicle.class);
        //instead of using this vehicle, we can also get to vehicle from the person Component
        // Vehicle vehicle = context.getBean(Vehicle.class);
        
        // vehicle.getVehicleServices().playMusic();
        // vehicle.getVehicleServices().rotate(); 
     
        person.getVehicle().getVehicleServices().playMusic();
        person.getVehicle().getVehicleServices().rotate();

    }
}
