package com.example.demo4.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cars")
public class Cars {

        @Id
        @Column(name = "id", updatable = false, nullable = false)
        private int id;

        @Column(name = "mark")
        private String mark;

        @Column(name = "model")
        private String model;

        @Column(name = "capasity")
        private double capasity;

        @Column(name = "color")
        private String color;

        @Column(name = "price")
        private double price;

        @Column(name = "year_of_car")
        private Date year_of_car;
    }

