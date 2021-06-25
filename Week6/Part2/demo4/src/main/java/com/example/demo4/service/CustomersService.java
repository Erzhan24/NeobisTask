package com.example.demo4.service;


import com.example.demo4.entity.Customers;
import com.example.demo4.repository.CustomersRepository;
import jdk.jshell.spi.ExecutionControlProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomersService {

    @Autowired
    private CustomersRepository customersRepository;

    public List<Customers> getAllCustomers() {
        return (List<Customers>) customersRepository.findAll();
    }

    public Customers findById(Integer id) throws Exception {
        return customersRepository.findById(id).orElseThrow(Exception::new);
    }

    public String deleteById(Integer id) {
        customersRepository.deleteById(id);
        return id + " was successfully deleted!";
    }

    public Customers createCustomers(Customers customers) {
        Customers customers1 = new Customers(1, customers.getEmail(), customers.getName(), customers.getNumber(), customers.getAddress());

        return customersRepository.save(customers1);
    }

    public Customers updateCustomersById(int id, Customers customersModel) {
        Optional<Customers> customers = customersRepository.findById(id);
        if (customers.isPresent()) {
            Customers updatedCustomer = customers.get();

            updatedCustomer.setEmail(customersModel.getEmail());
            updatedCustomer.setName(customersModel.getName());
            updatedCustomer.setNumber(customersModel.getNumber());
            updatedCustomer.setAddress(customersModel.getAddress());

            customersRepository.save(updatedCustomer);
        }


        return customersModel;
    }
}