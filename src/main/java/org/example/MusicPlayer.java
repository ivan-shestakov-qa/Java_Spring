package org.example;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@AllArgsConstructor
//@NoArgsConstructor
@Getter
@Setter
public class MusicPlayer {
    private Music music1;
    private Music music2;
//    private String name;
//    private int volume;
    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1, @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }
    public String playMusic(){
        return "playing: " + music1.getSong() + ", " + music2.getSong();
    }
}
