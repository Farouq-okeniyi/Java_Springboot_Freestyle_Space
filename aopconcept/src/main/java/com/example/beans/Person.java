package com.example.beans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Lazy;

@Component(value = "personBean")
@Lazy //lazy instantiation
public class Person {
    private String name = "lucy";
    private final Vehicle vehicle;

    @Autowired  
    public Person(Vehicle vehicle){ 
        System.out.println("person bean created by bean");
        this.vehicle = vehicle;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }  
   
    public Vehicle getVehicle(){
        return vehicle;
    }

}
