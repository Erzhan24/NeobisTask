package com.example.demo4.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomersModel {
    private int id;
    private String email;
    private String name;
    private int number;
    private String address;


    public CustomersModel(int id, String email, String name, int number, String address) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.number = number;
        this.address= address;
    }

}
