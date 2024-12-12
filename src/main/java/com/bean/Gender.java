package com.bean;

public enum Gender {
    MALE("male"),
    FEMALE("female"),
    OTHERS("others");

    private final String value;

    Gender(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}
