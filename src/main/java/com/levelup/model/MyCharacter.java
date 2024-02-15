package com.levelup.model;

public class MyCharacter {

    public String DEFAULT_NAME;
    
    private String name;

    public MyCharacter() {
        DEFAULT_NAME = "BeanBot";
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

}
