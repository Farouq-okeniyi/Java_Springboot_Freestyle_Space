package com.example.beans;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
@Component
public class People {
    // public People() {
    //     System.out.println("People bean created by springboot ");
    // }
    // private String name;
    // private Vehicle vehicle;
    private String name = "lucy";
    private Vehicle vehicle;


    //autowiring uing the Autiwired annotation
    
    
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void printHello(){
        System.out.println("Hello User");
    }
    public Vehicle getVehicle(){
        return vehicle;
    }
    @Autowired
    public void setVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
    }
    // @Override
    public String toString(){
        return "Person name is - "+ name;
    }
}
