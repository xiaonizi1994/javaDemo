package com.thoughtworks.demo.service.Player;

public class Player {
    static int playCount=0;
    private String name;

    public Player(String n) {
        name=n;
        playCount++;
    }
}
