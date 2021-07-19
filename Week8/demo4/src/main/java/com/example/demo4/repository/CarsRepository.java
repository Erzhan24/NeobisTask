package com.example.demo4.repository;

import com.example.demo4.entity.Cars;

import org.springframework.data.repository.CrudRepository;

public interface CarsRepository extends CrudRepository<Cars, Integer> {
}
