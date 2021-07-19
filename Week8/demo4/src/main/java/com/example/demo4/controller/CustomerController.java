package com.example.demo4.controller;

import com.example.demo4.entity.Customers;
import com.example.demo4.service.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public String putCustomers(@PathVariable ("id") Integer id , @RequestBody Customers customers) throws Exception {
        customersService.updateCustomersById(id,customers);
        return "result: customers was successfully updated";
    }

    @PostMapping("/add")
    public String addCustomers(@RequestBody Customers customers) {
        customersService.createCustomers(customers);
        return "result: customers was successfully added";


    }
    @DeleteMapping("/{id}")
    public String deleteCustomers(@PathVariable ("id") Integer id) {
        customersService.deleteById(id);
        return "result: customers was successfully deleted";
    }


}