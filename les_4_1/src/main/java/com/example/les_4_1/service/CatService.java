package com.example.les_4_1.service;

import com.example.les_4_1.entity.Cat;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CatService {
    private ArrayList<Cat> cats = new ArrayList<>();

    public Cat create(int id, String color, String name, int age) {
        Cat c = fillData(id, color, name, age);
        cats.add(c);
        return c;
    }

    public Cat getCat(int id) {
        for (Cat c : cats) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    public String delete(int id) {
        for (Cat c : cats) {
            if (c.getId() == id) {
                cats.remove(c);
            }
        }
        return "Cat was deleted";
    }

    private Cat fillData(int id, String color, String name, int age) {
        Cat c = new Cat();
        c.setId(id);
        c.setColor(color);
        c.setName(name);
        c.setAge(age);
        return c;
    }

    public Cat update(int id, String color, String name, int age) {
        Cat c = fillData(id, color, name, age);
        for (int i = 0; i < cats.size(); i++) {
            if (cats.get(i).getId() == id) {
                cats.add(i, c);
            }

        }
        return c;
    }

}
