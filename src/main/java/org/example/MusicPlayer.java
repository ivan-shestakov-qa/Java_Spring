package org.example;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//@AllArgsConstructor
//@NoArgsConstructor
@Getter
@Setter
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
//    private String name;
//    private int volume;
    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic){
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }
    public String playMusic(){
        return "playing: " + classicalMusic.getSong();
    }
}
