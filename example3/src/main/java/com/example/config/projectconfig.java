package com.example.config;
// import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Primary;
// import org.springframework.context.annotation.ComponentScan;
// import the Vehicle class from the correct package
import com.example.beans.Vehicle;
import com.example.beans.People;


@Configuration
// @ComponentScan(basePackages = "com.example.beans")
public class projectconfig {

    //learing auto wiring
    @Bean
    public Vehicle vehicle(){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Toyota");
        return vehicle;
    }
    @Bean
    public People people(){
        People people = new People();   
        people.setName("farouq");
        people.setVehicle(vehicle());

        return people;
    }

    // @Primary
    // @Bean
    // Vehicle vehicle(){
    //     var veh = new Vehicle();
    //     veh.setName("Honda Accord");
    //     return veh;
    // }
    //primary annotation decalaration
    // @Primary
    // @Bean
    // Vehicle vehicle4(){
    //     var veh = new Vehicle();
    //     veh.setName("honda Accord");
    //     return veh;
    // }

    // @Bean(value = "audiVehicle")
    // Vehicle vehicle1(){
    //     var veh = new Vehicle();
    //     veh.setName("Audi A4");
    //     return veh;
    // }
    
    // @Bean(value = "mercedesVehicle")
    // Vehicle vehicle2(){
    //     var veh = new Vehicle();
    //     veh.setName("mercedes Benz");
    //     return veh;
    // }

    // @Bean(value = "bmwVehicles")
    // Vehicle vehicle3(){
    //     var veh = new Vehicle();
    //     veh.setName("bmw 3 series");
    //     return veh;
    // }
    

}
