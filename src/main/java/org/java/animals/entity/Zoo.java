package org.java.animals.entity;

import org.java.animals.abst.Animal;
import org.java.animals.abst.AnimalWithTail;
import org.java.animals.abst.AnimalWithWings;

import java.util.ArrayList;
import java.util.Comparator;

public class Zoo {

    private ArrayList<Animal> animals = new ArrayList<>();
    private ArrayList<AnimalWithTail> animalsWithTail = new ArrayList<>();
    private ArrayList<AnimalWithWings> animalsWithWings = new ArrayList<>();

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void addAnimal(Animal animal) {
        this.animals.add(animal);
    }

    public <T extends AnimalWithTail> void addAnimalWithTailIntoList(AnimalWithTail animalWithTail){
        addAnimal(animalWithTail);
        this.animalsWithTail.add(animalWithTail);
    }

    public  <T extends  AnimalWithWings> void  addAnimalWithWingsIntoList(AnimalWithWings animalWithWings){
        addAnimal(animalWithWings);
        this.animalsWithWings.add(animalWithWings);
    }

    public <T extends Animal> void getHeaviestAndLightest(Class<T> clazz){

        T heaviest = animals.stream()
                .filter(clazz::isInstance)
                .map(clazz::cast)
                .max(Comparator.comparing(Animal::getWeight))
                .orElse(null);

        T lightest = animals.stream()
                .filter(clazz::isInstance)
                .map(clazz::cast)
                .min(Comparator.comparing(Animal::getWeight))
                .orElse(null);

        System.out.println("Heaviest: " + heaviest);
        System.out.println("lightest: " + lightest);
    }

    public <T extends Animal> void getTallestAndShortest(Class<T> clazz) {
        T tallest = animals.stream()
                .filter(clazz::isInstance)
                .map(clazz::cast)
                .max(Comparator.comparing(Animal::getHeight))
                .orElse(null);

        T shortest = animals.stream()
                .filter(clazz::isInstance)
                .map(clazz::cast)
                .min(Comparator.comparing(Animal::getHeight))
                .orElse(null);

        System.out.println("Tallest: " + tallest);
        System.out.println("Shortest: " + shortest);
    }

    public <T extends AnimalWithTail> void getLongestTail(Class<T> clazz){

            AnimalWithTail longestTail = animalsWithTail.stream()
                    .filter(clazz::isInstance)
                    //.map(clazz::cast)
                    .max(Comparator.comparing(AnimalWithTail::getTailLength))
                    .orElse(null);

            System.out.println(longestTail.getTailLength());

    }

    public <T extends AnimalWithWings> void getLongestWingsSpan(Class<T> clazz) {

        AnimalWithWings longestWingsSpan = animalsWithWings.stream()
                .filter(clazz::isInstance)
                //.map(clazz::cast)
                .max(Comparator.comparing(AnimalWithWings::getWingsSpan))
                .orElse(null);

        System.out.println(longestWingsSpan.getWingsSpan());

    }
}
