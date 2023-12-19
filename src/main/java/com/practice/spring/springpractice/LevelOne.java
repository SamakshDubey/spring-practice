package com.practice.spring.springpractice;

public enum LevelOne {
    DUMMY_DEFAULT("DUMMY_L1_DEFAULT"),
    DUMMY_ONE("DUMMY_L1");

    private final String name;

    LevelOne(String name) {
        this.name = name;
    }

    public String getDummy() {
        return name;
    }
}
