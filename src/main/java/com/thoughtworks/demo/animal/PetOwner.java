package com.thoughtworks.demo.animal;

public class PetOwner {
    public void giveShot(Animal a){
        a.makeNoise();
    }

    public void giveTouch(Pet pet){pet.friendly();}
}
