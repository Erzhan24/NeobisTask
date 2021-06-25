package com.example.demo4.repository;


import com.example.demo4.entity.Customers;
import org.springframework.data.repository.CrudRepository;

public interface CustomersRepository extends CrudRepository<Customers, Integer> {
}
