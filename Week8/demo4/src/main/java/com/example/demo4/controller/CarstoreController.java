package com.example.demo4.controller;

import com.example.demo4.entity.CarStore;
import com.example.demo4.entity.Cars;
import com.example.demo4.service.CarsService;
import com.example.demo4.service.CarstoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/carstore")

public class CarstoreController {
    @Autowired
    private CarstoreService carstoreService;

    @GetMapping("/{id}")
    public CarStore getCarstore(@PathVariable("id") Integer id) throws Exception {
        return carstoreService.findById(id);

    }

    @GetMapping(value="/all")
    public List<CarStore> getAllCarstore() {
        return carstoreService.getAllCarstore();
    }


}
