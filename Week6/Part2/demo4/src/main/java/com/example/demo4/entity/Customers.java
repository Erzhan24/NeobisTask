package com.example.demo4.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "customers")
public class Customers {
    @Id
    @Column(name = "id", updatable = false, nullable = false)
    private int id;

    @Column(name = "email")
    private String email;

    @Column(name = "name")
    private String name;

    @Column(name = " number")
    private int number;

    @Column(name = "address")
    private String address;
}
