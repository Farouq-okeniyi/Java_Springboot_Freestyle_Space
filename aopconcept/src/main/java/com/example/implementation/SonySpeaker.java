package com.example.implementation;

import com.example.interfaces.Speakers;
import com.example.model.Song;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SonySpeaker implements Speakers {
    public String makeSound(Song song){
        return "Playing " + song.getTitle() + " by " + song.getArtist() +" from sony Speaker";
    }   
}
