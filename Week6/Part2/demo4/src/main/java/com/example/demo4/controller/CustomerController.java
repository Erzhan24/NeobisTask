package com.example.demo4.controller;

import com.example.demo4.entity.Customers;
import com.example.demo4.service.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/customers")
public class CustomerController {

    @Autowired
    private CustomersService customersService;

    @GetMapping("/{id}")
    public Customers getCustomers(@PathVariable ("id") Integer id) throws Exception {
        return customersService.findById(id);
    }


    @GetMapping(value="/all")
    public List<Customers> getAllCustomers() {
        return customersService.getAllCustomers();
    }

    @PutMapping("/{id}")
    public Customers putCustomers(@PathVariable ("id") Integer id ,@RequestBody Customers customers) throws Exception {
        return customersService.updateCustomersById(id,customers);
    }

    @PostMapping("/add")
    public Customers addCustomers(@RequestBody Customers customers) {
        customersService.createCustomers(customers);
        return customers;

    }
    @DeleteMapping("/{id}")
    public void deleteCustomers(@PathVariable ("id") Integer id) {
        customersService.deleteById(id);
    }


}