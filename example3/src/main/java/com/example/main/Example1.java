package com.example.main;
// import java.beans.VetoableChangeListener;

import java.util.Random;
import java.util.function.Supplier;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;

// import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
// import org.springframework.context.annotation.ComponentScan;
// import org.springframework.context.annotation.Configuration;

import com.example.beans.Vehicle;
import com.example.beans.People;
import com.example.config.projectconfig;

public class Example1 {
    public static void main(String[] args) {
        
        var context = new AnnotationConfigApplicationContext(projectconfig.class);
        //for learning auto wiring
        People person = context.getBean(People.class);
        // Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Person  name form spring Context is " + person.getName());
        // System.out.println("Vehicle  name form spring Context is " + vehicle.getName());
        System.out.println("Vehicle  that person owns is " + person.getVehicle());
        //primary annotation beans usage

    //     Vehicle volkswagen = new Vehicle();
    //     volkswagen.setName("Volkswagen");
        
    //     Supplier<Vehicle> volkswagenSupplier = () -> volkswagen;

    //     Supplier<Vehicle> audiSupplier = () -> {
    //         Vehicle audi = new Vehicle();
    //         audi.setName("Audi");

    //         return audi;
    //     };

    //     Random random = new Random();
    //     int randomNumber = random.nextInt(10);
    //     System.out.println("Random Number = " + randomNumber);

    //     if((randomNumber % 2) == 0){
    //         context.registerBean("audiVehicle", Vehicle.class, audiSupplier);
    //         System.out.println("Vehicle is Audi");
    //     }
    //     else{
    //         context.registerBean("volkswagenVehicle", Vehicle.class, volkswagenSupplier);
    //         System.out.println("Vehicle is Volkswagen");
    //     }

    //     Vehicle volkswagenVehicle = null;

    //     Vehicle audiVehicle = null;
    // //when ever we try to create a bean and a bean is not inside the context with a particular bean name we will get a no
    // // such bean definition exception.
    // // we can handle this exception by using a try catch block.
    //     try{
    //         volkswagenVehicle = context.getBean("volkswagenVehicle",Vehicle.class);

    //     }catch(NoSuchBeanDefinitionException noSuchBeanDefinitionException){
    //         System.out.println("Volkswagen Bean not found");
    //     }

    //     try{
    //         audiVehicle = context.getBean("audiVehicle", Vehicle.class);
    //     }catch(NoSuchBeanDefinitionException noSuchBeanDefinitionException){
    //         System.out.println("Audi Bean not found");
    //     }

    //     if (volkswagenVehicle != null){
    //         System.out.println("Programming vehicle with Spring context is" + volkswagenVehicle.getName());

    //     }else{
    //        System.out.println("Programming vehicle with Spring context is" + audiVehicle.getName());

    //     }




        // Vehicle vehicle = context.getBean(Vehicle.class);
        // System.out.println(vehicle.getName());
        // vehicle.printHello();
        // context.close();
        // Vehicle veh = context.getBean("audiVehicle",Vehicle.class);
        // System.out.println(veh.getName());

        // Vehicle veh2 = context.getBean("mercedesVehicle",Vehicle.class);
        // System.out.println(veh2.getName());

        // Vehicle veh3 = context.getBean("bmwVehicles", Vehicle.class);
        // System.out.println(veh3.getName());


    }
}
//next is spring projects
//we have springcore and spring mvc
//we have spring boot
//we have spring data
//we have spring cloud
//spring security
//spring session 
//spring integration
//spring AMQP