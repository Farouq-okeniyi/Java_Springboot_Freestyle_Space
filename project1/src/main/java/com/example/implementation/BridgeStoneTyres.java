package com.example.implementation;
import com.example.interfaces.Tyres;

import org.springframework.stereotype.Component;


@Component
public class BridgeStoneTyres implements Tyres {
    public String rotate(){
        return "Rotating from BridgeStone Tyres";
    }

    public String stop(){
        return "stop from Bridgestone Tyres";
    }
}
