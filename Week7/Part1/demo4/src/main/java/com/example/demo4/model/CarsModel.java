package com.example.demo4.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class CarsModel {
    private int id;
    private String  mark;
    private String model;
    private double capasity;
    private String color;
    private double price;
    private Date year_of_car;


    public CarsModel(int id, String mark, String model, double capasity, String color, double price, Date yearOfCar) {
        this.id = id;
        this.mark = mark;
        this.model = model;
        this.capasity = capasity;
        this.color = color;
        this.price = price;
        this.year_of_car = year_of_car;
    }

}

