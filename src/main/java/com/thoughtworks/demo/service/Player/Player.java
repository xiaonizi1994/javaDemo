package com.thoughtworks.demo.service.Player;

public class Player {
    static int playCount=0;
    private String name;

    private final static int x = 0;
    private final static int y;

    static {
        y=1;
    }

    public Player(String n) {
        name=n;
        playCount++;
    }
}
