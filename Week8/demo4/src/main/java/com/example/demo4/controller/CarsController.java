package com.example.demo4.controller;


import com.example.demo4.entity.Cars;
import com.example.demo4.entity.Customers;
import com.example.demo4.service.CarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/cars")
public class CarsController {

    @Autowired
    private CarsService carsService;

    @GetMapping("/{id}")
    public Cars getCars(@PathVariable("id") Integer id) throws Exception {
        return carsService.findById(id);

    }


    @GetMapping(value="/all")
    public List<Cars> getAllCars() {
        return carsService.getAllCars();
    }

    @PutMapping("/{id}")
    public String putCars(@PathVariable ("id") Integer id , @RequestBody Cars cars) throws Exception {
        carsService.updateCarsById(id,cars);
        return "result: car was successfully updated";
    }

    @PostMapping("/add")
    public String addCars(@RequestBody Cars cars) {
        carsService.createCars(cars);
        return "result: car was successfully added";


    }
    @DeleteMapping("/{id}")
    public String deleteCars(@PathVariable ("id") Integer id) {
        carsService.deleteById(id);
        return "result: car was successfully deleted";
    }

}
