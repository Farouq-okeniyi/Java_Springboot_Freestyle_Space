package com.example.implementation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MichelinTypes {
    public String rotate(){
        return "Rotating from MichelinTypes";
    }
}
