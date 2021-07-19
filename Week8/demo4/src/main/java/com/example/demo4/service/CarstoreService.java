package com.example.demo4.service;

import com.example.demo4.entity.CarStore;
import com.example.demo4.repository.CarstoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarstoreService {

    @Autowired
    private CarstoreRepository carstoreRepository;

    public List<CarStore> getAllCarstore() {
        return (List<CarStore>) carstoreRepository.findAll();
    }

    public CarStore findById(Integer id) throws Exception {
        return carstoreRepository.findById(id).orElseThrow(Exception::new);
    }

    public String deleteById(Integer id) {
        carstoreRepository.deleteById(id);
        return id + " was successfully deleted!";
    }


}