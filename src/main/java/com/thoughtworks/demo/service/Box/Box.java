package com.thoughtworks.demo.service.Box;

public class Box {
    Integer i;
    int j;

    public static void main(){
        Box t=new Box();
        t.go();
    }

    public void go(){
        j=i;
        System.out.println(j);
        System.out.println(i);
    }
}
