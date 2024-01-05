package org.java.animals.abst;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public abstract class Animal {

    public static ArrayList<Animal> allAnimals = new ArrayList<>();
    private String name;
    private String favFood;
    private int age;
    private LocalDate startZoo;
    private float weight;
    private int height;

    public Animal(String name, String favFood, int age, LocalDate startZoo, float weight, int height) {
        setName(name);
        setFavFood(favFood);
        setAge(age);
        setStartZoo(startZoo);
        setWeight(weight);
        setHeight(height);
        allAnimals.add(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFavFood() {
        return favFood;
    }

    public void setFavFood(String favFood) {
        this.favFood = favFood;
    }

    public int getAge() {


        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getStartZoo() {
        return startZoo;
    }

    public void setStartZoo(LocalDate startZoo) {
        this.startZoo = startZoo;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + getName() + '\'' +
                ", favFood='" + getFavFood() + '\'' +
                ", age=" + getAge() +
                " years old, startZoo=" + getStartZoo() +
                ", weight=" + getWeight() +
                "kg, height=" + getHeight();
    }
}
