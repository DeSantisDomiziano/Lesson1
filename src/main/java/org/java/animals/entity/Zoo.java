package org.java.animals.entity;

import org.java.animals.abst.Animal;
import org.java.animals.abst.AnimalWithTail;
import org.java.animals.abst.AnimalWithWings;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Zoo {

    //Start Bill Pugh Singleton
    private Zoo(){}

    private static class SingletonHelper {
        private static final Zoo INSTANCE = new Zoo();
    }

    public static Zoo getInstance() {
        return  SingletonHelper.INSTANCE;
    }
    //End Bill Pugh Singleton

    private Map<Class<? extends Animal>, ArrayList<Animal>> allAnimals = new HashMap<>();

    private void addAnimal(Class<? extends Animal> keyClass, Animal animal) {
        allAnimals.computeIfAbsent(keyClass, k -> new ArrayList<>()).add(animal);
    }

    public void addAnimalByClass(Class<?> clazz, Animal animal){

        if (clazz != animal.getClass()){
            System.out.println("Class cannot be different from the animal's class\n" +
                        "Class: " + clazz + " | Animal's Class: " + animal.getClass());
        }
        else if(!allAnimals.containsKey(clazz)){
            addAnimal((Class<? extends Animal>) clazz, animal);
        }
        else{
            allAnimals.get(clazz).add(animal);
        }
    }

    public ArrayList<? extends Animal> getAnimalByClass(Class<?> clazz){
        return allAnimals.get(clazz);
    }

    public <T extends Animal> void getHeaviestAndLightestByClass(Class<T> clazz){

        T heaviest = getAnimalByClass(clazz).stream()
                //.filter(clazz::isInstance)
                .map(clazz::cast)
                .max(Comparator.comparing(Animal::getWeight))
                .orElse(null);

        T lightest = getAnimalByClass(clazz).stream()
                //.filter(clazz::isInstance)
                .map(clazz::cast)
                .min(Comparator.comparing(Animal::getWeight))
                .orElse(null);

        System.out.println("Heaviest: " + heaviest);
        System.out.println("lightest: " + lightest);
    }

    public <T extends Animal> void getTallestAndShortest(Class<T> clazz) {
        T tallest = getAnimalByClass(clazz).stream()
                //.filter(clazz::isInstance)
                .map(clazz::cast)
                .max(Comparator.comparing(Animal::getHeight))
                .orElse(null);

        T shortest = getAnimalByClass(clazz).stream()
                //.filter(clazz::isInstance)
                .map(clazz::cast)
                .min(Comparator.comparing(Animal::getHeight))
                .orElse(null);

        System.out.println("Tallest: " + tallest);
        System.out.println("Shortest: " + shortest);
    }


    public <T extends AnimalWithTail> void getLongestTailByClass(Class<T> clazz){

        AnimalWithTail longestTail = getAnimalByClass(clazz).stream()
                .filter(animal -> animal instanceof AnimalWithTail)
                .map(clazz::cast)
                .max(Comparator.comparing(AnimalWithTail::getTailLength))
                .orElse(null);

        System.out.println(longestTail.getTailLength());
    }

    public <T extends AnimalWithWings> void getLongestWingsSpan(Class<T> clazz) {

        AnimalWithWings longestWingsSpan = getAnimalByClass(clazz).stream()
                .filter(animal -> animal instanceof AnimalWithWings)
                .map(clazz::cast)
                .max(Comparator.comparing(AnimalWithWings::getWingsSpan))
                .orElse(null);

        System.out.println(longestWingsSpan.getWingsSpan());

    }
}