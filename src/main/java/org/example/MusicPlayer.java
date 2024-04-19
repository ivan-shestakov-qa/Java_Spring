package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MusicPlayer {
    private Music music;
    private String name;
    private int volume;
    public void playMusic(){
        System.out.println("playing: " + music.getSong());
    }
}
