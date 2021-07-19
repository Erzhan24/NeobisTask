package com.example.demo4.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "carstore")
public class CarStore {

    @Id
    @Column(name = "id", updatable = false, nullable = false)
    private int id;

    @ManyToOne
    private Customers customer_id;

    @ManyToOne
    private Cars car_id;



    @Column(name = "sale_date")
    private Date sale_date;

}
