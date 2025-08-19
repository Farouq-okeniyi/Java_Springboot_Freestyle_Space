package com.example.beans;
import org.springframework.stereotype.Component;
// import javax.annotation.PostConstruct;
// import javax.annotation.PreDestroy;
@Component
public class Vehicle {
    public Vehicle(){
        System.out.println("Vehicle beans created by springboot");
    }
    private String name = "Toyota";


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void printHello(){
        System.out.println("Hello Olamilakan!!!");
    }
    @Override
    public String toString(){
        return "Person name is - "+ name;
    }
    //post construct annotation!
    //  @PostConstruct
    //  public void initialize(){
    //     this.name = "Honda";
    //  }
    
     //pre destroy annotation
    //  @PreDestroy
    //  public void destroy(){
    //     System.out.println("Destroying the bean");

    //  }

}



