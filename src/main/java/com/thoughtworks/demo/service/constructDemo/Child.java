package com.thoughtworks.demo.service.constructDemo;

public class Child extends Parent{
    public Child(int i, String j) {
        super(i, j);
        System.out.println("child i j");
    }
}
