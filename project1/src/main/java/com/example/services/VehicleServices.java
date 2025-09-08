package com.example.services;
import com.example.interfaces.Tyres;
import com.example.beans.Vehicle;
import com.example.interfaces.Speakers;
import com.example.model.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.stereotype.Component;
import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;
@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class VehicleServices {

    private static final Logger logger = Logger.getLogger(VehicleServices.class.getName());

    @Autowired
    private Speakers speakers;
    private Tyres tyres;
    public VehicleServices() {
        System.out.println("VehicleServices bean created by bean");
    }
    public String playMusic(boolean vehicleStarted, Song song){
        Instant start  = Instant.now();
        logger.info("Method executed start");

        String music = null;

        if(vehicleStarted){
            music = speakers.makeSound(song);
        }else{
            logger.log(Level.SEVERE, "Vehicle not started to perform " + "the Operation");
        }

        logger.info("Method execution now ended ");
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        logger.info("Time took to finish is " + timeElapsed + " milliseconds");

        return music;
        // String music = speakers.makeSound();
        // System.out.println(music);
    }
 
    public String moveVehicle(Boolean vehicleStarted){
        Instant start = Instant.now();
        logger.info("Vehicle has started moving");

        String status = null;

        if(vehicleStarted){
            status = tyres.rotate();
        }else{
            logger.log(Level.SEVERE, "Vehicle not started to perform " + "the Operation");
        }
        logger.info("Vehicle has stopped moving");
        Instant finish = Instant.now();

        long timeElapsed = Duration.between(start, finish).toMillis();

        logger.info("it took " + timeElapsed +" milliseconds to move the car around");

        return status;

    }

    public String applyBrake(Boolean vehicleStarted){
        Instant start = Instant.now();
        logger.info("Applying Brakes now");

        String slowingDown = null;

        if(vehicleStarted){
            slowingDown = tyres.stop();
        }else{
            logger.log(Level.SEVERE, "Vehicle not started to perform " + "the Operation");   
        }
        logger.info("Vehicle has applied Brakes");
        Instant finish = Instant.now();

        long timeElapsed = Duration.between(start, finish).toMillis();

        logger.info("it took " + timeElapsed +" milliseconds to apply the brakes");


        return slowingDown;
    }
    public void rotate(){
        String status = tyres.rotate();
        System.out.println(status);
    }

    public Speakers getSpeaker(){
        return speakers;
    }
    
    public  void setSpeakers(Speakers speakers){
        this.speakers = speakers;
    }

    public Tyres getTyres(){
        return tyres;
    }
    @Autowired
    public void setTyres(Tyres tyres){
        this.tyres = tyres;
    }
}

