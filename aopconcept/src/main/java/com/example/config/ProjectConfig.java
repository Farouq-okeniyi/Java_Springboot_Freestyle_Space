package com.example.config;
import org.springframework.context.annotation.ComponentScan;
// import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@Configuration
@ComponentScan(basePackages = {"com.example.implementation", "com.example.services", "com.example.aspect"})
// @ComponentScan(basePackageClasses = {com.example.beans.Vehicle.class, com.example.beans.Person.class})
@EnableAspectJAutoProxy
public class ProjectConfig {
    
}
