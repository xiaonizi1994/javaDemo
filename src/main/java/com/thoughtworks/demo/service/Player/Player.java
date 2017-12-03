package com.thoughtworks.demo.service.Player;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class Player {
    static int playCount=0;
    private String name;

    protected final static int x = 0;
    protected final static int y;

    static {
        y=1;
    }

    public Player(String n) {
        name=n;
        playCount++;
    }

    public void go(){
        System.out.println(playCount);
    }
}
