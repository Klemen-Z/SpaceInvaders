package com.ptsd.spaceinvaders;

public class Player extends Ship {
    private String name;

    Player(){

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
