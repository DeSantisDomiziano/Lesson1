package org.java.animals.entity;

import org.java.animals.abst.Animal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Zoo {

    /*
    per ogni specie, ricerca dell'esemplare più alto e più basso
    per ogni specie, ricerca dell'esemplare più pesante e più leggero
    per gli animali dotati di coda, l'esemplare con la coda più lunga di tutto lo zoo nel complesso
    per gli animali dotati di ali, l'esemplare con la maggiore apertura alare
     */
    private ArrayList<Animal> animals = new ArrayList<>();

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void addAnimal(Animal animal) {
        this.animals.add(animal);
    }

    public <T extends Animal> void getHeaviestAndLightest(Class<T> clazz){

        T heaviest = animals.stream()
                .filter(clazz::isInstance)
                .map(animal -> (T) animal)
                .max(Comparator.comparing(Animal::getWeight))
                .orElse(null);

        T lightest = animals.stream()
                .filter(clazz::isInstance)
                .map(animal -> (T) animal)
                .min(Comparator.comparing(Animal::getWeight))
                .orElse(null);

        System.out.println("Heaviest: " + heaviest);
        System.out.println("lightest: " + lightest);
    }

    public <T extends Animal> void getTallestAndShortest(Class<T> clazz) {
        T tallest = animals.stream()
                .filter(clazz::isInstance)
                .map(animal -> (T) animal)
                .max(Comparator.comparing(Animal::getHeight))
                .orElse(null);

        T shortest = animals.stream()
                .filter(clazz::isInstance)
                .map(animal -> (T) animal)
                .min(Comparator.comparing(Animal::getHeight))
                .orElse(null);

        System.out.println("Tallest: " + tallest);
        System.out.println("Shortest: " + shortest);
    }
}