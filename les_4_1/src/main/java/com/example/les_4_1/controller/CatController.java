package com.example.les_4_1.controller;

import com.example.les_4_1.entity.Cat;
import com.example.les_4_1.service.CatService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatController {
    private final CatService service;

    public CatController(CatService service) {
        this.service = service;
    }


    @RequestMapping("/cat")
    public Cat createCat(@RequestParam int id, @RequestParam String color,
                         @RequestParam String name, @RequestParam int age) {
        return service.create(id, color, name, age);

    }

    @RequestMapping("cat/get/{cat_id1}")
    public Cat getCatById(@PathVariable(name = "cat_id1") int id) {
        return service.getCat(id);
    }

    @RequestMapping("cat/delete/{cat_id}")
    public String delete(@PathVariable(name = "cat_id") int id) {
        return service.delete(id);
    }

    @RequestMapping("cat/update/{id}")
    public Cat update(@PathVariable int id, @RequestParam String color, @RequestParam String name, @RequestParam int age) {
        return service.update(id, color, name, age);
    }


}
