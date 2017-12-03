package com.thoughtworks.demo.service.Player;

import org.springframework.stereotype.Service;

@Service
public class PlayerDrive {
    public void main(){
        System.out.println(Player.playCount);
        Player p=new Player("hah");
        System.out.println(Player.playCount);
    }
}
