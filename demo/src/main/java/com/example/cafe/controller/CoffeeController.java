package com.example.cafe.controller;

import com.example.cafe.model.Coffee;
import com.example.cafe.service.CoffeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller 
@RequestMapping("/coffees")

public class CoffeeController {

    private final CoffeeService coffeeService;

    public CoffeeController(CoffeeService coffeeService) {
        this.coffeeService = coffeeService;
    }

    @GetMapping
    public String list(Model model) {
        model.addAttribute("coffees", coffeeService.getAllCoffees());
        return "list";
    }
    

    @GetMapping("/new")
    public String createForm(Model model) {
        model.addAttribute("coffee", new Coffee());
        return "form";
    }

    @PostMapping
    public String save(@ModelAttribute Coffee coffee) {
        coffeeService.saveCoffee(coffee);
        return "redirect:/coffees";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        Coffee coffee = coffeeService.getCoffeeById(id);
        if (coffee != null) {
            model.addAttribute("coffee", coffee);
        }
        return "form";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        coffeeService.deleteCoffee(id);
        return "redirect:/coffees";
    }
    
}