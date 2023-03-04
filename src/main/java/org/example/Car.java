package org.example;

import java.time.LocalDateTime;
import java.util.Date;

public class Car {
    private Integer id;
    private String name;
    private String surname;
    private String color;
    private String level;
    private String brand;
    private String model;

    private LocalDateTime Brithday;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDateTime getBrithday() {
        return Brithday;
    }

    public void setBrithday(LocalDateTime brithday) {
        Brithday = brithday;
    }
}
