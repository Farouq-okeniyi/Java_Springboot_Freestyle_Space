package com.example.beans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
// import org.springframework.beans.factory.annotation.Autowired;
// import com.example.beans.Vehicle;
@Component
public class People {
    // public People() {
    //     System.out.println("People bean created by springboot ");
    // }
    // private String name;
    // private Vehicle vehicle;
    private String name = "lucy";
    // @Qualifier("vehicle2") // you can also put it here for auto wiring multiple beans
    private final Vehicle vehicle;

    @Autowired  
    public People(@Qualifier("vehicle2")Vehicle vehicle){ //autowiring using the 3rd step of autowirng multiple beans
        System.out.println("person bean created by bean");
        this.vehicle = vehicle;
    }
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
    // @Autowired
    // public void setVehicle(Vehicle vehicle){
    //     // Cannot assign to final field 'vehicle' - remove this setter method since vehicle is initialized in constructor
    //     throw new UnsupportedOperationException("Cannot modify final field 'vehicle'");
    // }
    // @Override
    public String toString(){
        return "Person name is - "+ name;
    }
}
