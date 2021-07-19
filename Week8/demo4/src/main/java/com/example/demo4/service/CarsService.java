package com.example.demo4.service;

import com.example.demo4.entity.Cars;
import com.example.demo4.repository.CarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CarsService {
    @Autowired
    private CarsRepository carsRepository;


    public List<Cars> getAllCars() {
        return (List<Cars>) carsRepository.findAll();
    }

    public Cars findById(Integer id) throws Exception {
        return carsRepository.findById(id).orElseThrow(Exception::new);
    }

    public String deleteById(Integer id) {
        carsRepository.deleteById(id);
        return id + " was successfully deleted!";
    }

    public Cars createCars(Cars cars) {
        Cars cars1 = new Cars(cars.getId(), cars.getMark(), cars.getModel(), cars.getCapasity(),cars.getColor(),cars.getPrice(), cars.getYear_of_car());

        return carsRepository.save(cars1);
    }

    public Cars updateCarsById(int id, Cars carsModel) {
        Optional<Cars> cars = carsRepository.findById(id);
        if (cars.isPresent()) {
            Cars updatedCar = cars.get();

            updatedCar.setMark(carsModel.getMark());
            updatedCar.setModel(carsModel.getModel());
            updatedCar.setYear_of_car(carsModel.getYear_of_car());
            updatedCar.setCapasity(carsModel.getCapasity());
            updatedCar.setColor(carsModel.getColor());
            updatedCar.setPrice(carsModel.getPrice());


            carsRepository.save(updatedCar);
        }


        return carsModel;
    }
}
