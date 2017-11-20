package com.thoughtworks.demo.animal;

public class Cat extends Animal implements Pet{
    @Override
    public void friendly() {
        System.out.println("miao");
    }
}
