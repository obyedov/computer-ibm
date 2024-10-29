package com.obyedov.oop.computer;

public class Computer {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public void on(){
        System.out.println(name + unionText() + "acceso");
    }

    public void off(){
        System.out.println(name + unionText() + "spento");
    }

    public String unionText(){
        return " è ";
    }
}
