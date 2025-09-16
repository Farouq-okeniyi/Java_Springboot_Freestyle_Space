package com.example.beans;
import com.example.services.VehicleServices;
import org.springframework.context.annotation.Lazy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("VehicleBean")
@Lazy
public class Vehicle {
    private String name = "Honda";
    private final VehicleServices vehicleServices;

    @Autowired
    public Vehicle(VehicleServices vehicleServices){
        System.out. println("Vehicle bean created by bean");
        this.vehicleServices = vehicleServices;
    }

      public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VehicleServices getVehicleServices(){
        return vehicleServices;
    }
}



