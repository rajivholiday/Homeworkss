package com.example.Car.controller;

import com.example.Car.entity.BMW;
import com.example.Car.service.BMWService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bmw")
public class BMWController {
    private final BMWService service;

    public BMWController(BMWService service) {
        this.service = service;
    }

    @RequestMapping("/create")
    public BMW create(@RequestParam int regNumber, @RequestParam String color, @RequestParam String engineType,
                      @RequestParam long mileage) {
        return service.create(regNumber, color, engineType, mileage);
    }

    @RequestMapping("/get/{regNumber}")
    public BMW get(@PathVariable int regNumber) {
        return service.get(regNumber);
    }

    @RequestMapping("/update/{regNumber}")
    public BMW update(@PathVariable int regNumber, @RequestParam String color, @RequestParam String engineType,
                      @RequestParam long mileage) {
        return service.update(regNumber, color, engineType, mileage);

    }

    @RequestMapping("/delete/{regNumber}")
    public String delete(@PathVariable int regNumber) {
        return service.delete(regNumber);
    }
}

