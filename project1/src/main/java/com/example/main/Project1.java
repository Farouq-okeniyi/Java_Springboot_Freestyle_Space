package com.example.main;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import com.example.model.Song;
import com.example.services.VehicleServices;

public class Project1 {
    public static void main(String[] args) {
        
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        // String[] persons = context.getBeanNamesForType(Person.class);
        // System.out.println("before retrieving the person bean from the Spring context");
        // Person person = context.getBean(Person.class);
        // System.out.println("after retrieving the person bean from the Spring context");
        // String[] names = context.getBeanNamesForType(Vehicle.class);
        // //instead of using this vehicle, we can also get to vehicle from the person Component
        // // Vehicle vehicle = context.getBean(Vehicle.class);
        
        // // vehicle.getVehicleServices().playMusic();
        // // vehicle.getVehicleServices().rotate(); 
     
        // person.getVehicle().getVehicleServices().playMusic();
        // person.getVehicle().getVehicleServices().rotate();

        // VehicleServices vehicleServices1 = context.getBean(VehicleServices.class);
        // VehicleServices vehicleServices2 = context.getBean("vehicleServices", VehicleServices.class);
        // System.out.println("hash code from vehicle service 1: " + vehicleServices1.hashCode());
        // System.out.println("hash code from vehicle service 2: " + vehicleServices2.hashCode());

        // if (vehicleServices1 == vehicleServices2) {
        //     System.out.println("Both vehicle services are the same instance. there for a singleton scope.");
        // } else {
        //     System.out.println("Vehicle services are different instances. there for a prototype scope.");
        // }


        var vehicleServices = context.getBean(VehicleServices.class);
        System.out.println(vehicleServices.getClass());
        Song song = new Song();
        song.setArtist("Ed sheeran");
        song.setTitle("Shape of you");

        boolean vehicleStarted = true;

        String moveVehicleStatus = vehicleServices.moveVehicle(vehicleStarted);

        String playMusicStatus = vehicleServices.playMusic(vehicleStarted, song);

        String applyBrakeStatus = vehicleServices.applyBrake(vehicleStarted);

    }
}
