package com.hillel.nekrasov.home_works.works15;

public class Main {
    public static void main(String[] args) {

        MusicStyles[] groups = {new PopMusic(), new RockMusic(), new ClassicMusic()};
        for (MusicStyles group : groups) {
            group.playMusic();
        }
    }
  }
