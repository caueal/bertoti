package main.java.com.thehecklers.sburrestdemo.service;

import com.thehecklers.sburrestdemo.entity.model.Coffee;
import com.thehecklers.sburrestdemo.repository.CoffeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CoffeeService {
    private final CoffeeRepository coffeeRepository;

    public CoffeeService(CoffeeRepository coffeeRepository) {
        this.coffeeRepository = coffeeRepository;
    }

    public List<Coffee> listarCoffees() {
        return (List<Coffee>) coffeeRepository.findAll();
    }

    public Optional<Coffee> obterCoffeePorId(String id) {
        return coffeeRepository.findById(id);
    }
}