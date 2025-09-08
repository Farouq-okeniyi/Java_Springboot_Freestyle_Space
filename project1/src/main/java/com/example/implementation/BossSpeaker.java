package com.example.implementation;
import org.springframework.stereotype.Component;
import com.example.model.Song;

@Component
public class BossSpeaker {
    public String makeSSound(Song song){
        return "Playing " + song.getTitle() + " by " + song.getArtist() + " from Boss Speaker";
    }
}
