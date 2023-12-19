package com.practice.spring.springpractice;

public enum LevelTwo {
    DUMMY_DEFAULT("DUMMY_L2_DEFAULT"),
    DUMMY_TWO("DUMMY_L2");

    private final String name;

    LevelTwo(String name) {
        this.name = name;
    }

    public String getDummy() {
        return name;
    }
}
