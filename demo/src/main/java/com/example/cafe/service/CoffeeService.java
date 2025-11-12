package com.example.cafe.service;

import com.example.cafe.model.Coffee;
import com.example.cafe.repository.CoffeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service 
public class CoffeeService {

    private final CoffeeRepository coffeeRepository;

    public CoffeeService(CoffeeRepository coffeeRepository) {
        this.coffeeRepository = coffeeRepository;
    }

    public List<Coffee> getAllCoffees() {
        return coffeeRepository.findAll();
    }

    public Coffee getCoffeeById(Long id) {
        return coffeeRepository.findById(id).orElse(null);
    }

    public Coffee saveCoffee(Coffee coffee) {
        return coffeeRepository.save(coffee);
    }

    public void deleteCoffee(Long id) {
        coffeeRepository.deleteById(id);
    } 

    public Coffee updateCoffee(Long id, Coffee coffeeDetails) {
        Coffee coffee = coffeeRepository.findById(id).orElse(null);
        
        if (coffee != null) {
            coffee.setName(coffeeDetails.getName());
            coffee.setOrigin(coffeeDetails.getOrigin());
            coffee.setPrice(coffeeDetails.getPrice());
            return coffeeRepository.save(coffee);
        }
        return null;
    }

}