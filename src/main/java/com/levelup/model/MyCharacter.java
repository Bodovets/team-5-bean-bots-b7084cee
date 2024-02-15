package com.levelup.model;

public class MyCharacter {

    public String DEFAULT_NAME;

    private String name;

    private Position position;

    public MyCharacter() {
        DEFAULT_NAME = "BeanBot";
        position = new Position();
    }

    public MyCharacter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Position getPosition() {
        return position;
    }

}
