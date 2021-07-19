package com.example.demo4.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Getter
@Setter
public class CarstoreModel {

    private int id;
    private int car_id;
    private int customer_id;
    private Date sale_date;

    public CarstoreModel ( int id, int car_id, int customer_id, Date sale_date ) {
        this.id = id;
        this.car_id = car_id;
        this.customer_id = customer_id;
        this.sale_date = sale_date;
    }


}
