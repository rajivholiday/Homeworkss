package com.example.les_4_1.entity;

public class Dog {
    private int id;
    private String color;
    private String name;
    private int age;

    public Dog(int id, String color, String name, int age) {
        this.id = id;
        this.color = color;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
