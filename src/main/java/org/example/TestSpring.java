package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//                "applicationContext.xml"
//        );
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer);
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();
//        RockMusic rockMusic = context.getBean("rockMusic", RockMusic.class);
//        ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);
//        System.out.println(rockMusic.getSong());
//        System.out.println(classicalMusic.getSong());
//        Music music = context.getBean("musicBean", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);
//
//        boolean comparison = musicPlayer1 == musicPlayer2;
//        System.out.println(comparison);
//
//        System.out.println(musicPlayer1);
//        System.out.println(musicPlayer2);
//
//        musicPlayer2.setVolume(25);
//        System.out.println(musicPlayer1.getVolume());
//        System.out.println(musicPlayer2.getVolume());
//        musicPlayer.playMusic();
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);
//        ClassicalMusic classicalMusic2 = context.getBean("classicalMusic", ClassicalMusic.class);
//        System.out.println(classicalMusic1 == classicalMusic2);
        context.close();
    }
}
