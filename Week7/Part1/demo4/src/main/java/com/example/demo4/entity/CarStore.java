package com.example.demo4.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
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

    @Column(name = "car_id")
    private int car_id;

    @Column(name = "customer_id")
    private int customer_id;

    @Column(name = "sale_date")
    private Date sale_date;

}
