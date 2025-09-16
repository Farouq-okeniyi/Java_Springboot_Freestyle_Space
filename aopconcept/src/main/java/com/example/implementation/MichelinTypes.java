package com.example.implementation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.example.interfaces.Tyres;

@Component
@Primary
public class MichelinTypes implements Tyres {
    @Override
    public String rotate(){
        return "Rotating from MichelinTypes";
    }
    @Override
    public String stop(){
        return "vehicle stopped from MichelinTyres";
    }
}
