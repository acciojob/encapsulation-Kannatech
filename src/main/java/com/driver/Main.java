package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj=new RWOnly();
        obj.setName("Ram");
        //System.out.println(" test " + obj.getName());
        obj.getName();
    }

}