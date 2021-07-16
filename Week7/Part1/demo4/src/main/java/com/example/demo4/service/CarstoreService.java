package com.example.demo4.service;

import com.example.demo4.entity.CarStore;
import com.example.demo4.entity.Customers;
import com.example.demo4.repository.CarstoreRepository;
import com.example.demo4.repository.CustomersRepository;
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

    public CarStore createCarstore(CarStore carStore) {
        CarStore c = new CarStore(carStore.getId(), carStore.getCar_id(), carStore.getCustomer_id(), carStore.getSale_date());

        return carstoreRepository.save(c);
    }

}