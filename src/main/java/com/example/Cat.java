package com.example;

import com.animal.Animal;

public class Cat implements Animal {
    public String name = "Furry";

    public String feels_like() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}   