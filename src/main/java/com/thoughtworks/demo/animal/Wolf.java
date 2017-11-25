package com.thoughtworks.demo.animal;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Wolf extends Canine {
    public void eat(){
        System.out.println("wolf eat");
    }

    public void makeNoise(){
        System.out.println("ao");
    }

    public void bite(){System.out.println("bite");}
}
