package com.example.les_4_1.controller;

import com.example.les_4_1.entity.Dog;
import com.example.les_4_1.service.DogService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DogController {
    private final DogService service;

    public DogController(DogService service) {
        this.service = service;
    }

    @RequestMapping("/dog/create/")
    public Dog createDog(@RequestParam int id, @RequestParam String color, @RequestParam String name,
                         @RequestParam int age) {
        return service.create(id, color, name, age);
    }

    @RequestMapping("/dog/get/{id1}")
    public Dog getDogById(@PathVariable int id) {
        return service.getDog(id);
    }

    @RequestMapping("/dog/delete/{id2}")
    public String deleteDog(@PathVariable(name = "id2") int id) {
        return service.delete(id);
    }

    @RequestMapping("/dog/update/{dog_id}")
    public Dog update(@PathVariable(name = "dog_id") int id, @RequestParam String color, @RequestParam String name,
                      @RequestParam int age) {
        return service.update(id, color, name, age);
    }
}
