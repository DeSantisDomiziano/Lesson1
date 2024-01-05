package org.java.animals.utility;

import org.java.animals.abst.Animal;
import org.java.animals.entity.Eagle;
import org.java.animals.entity.Lion;
import org.java.animals.entity.Tiger;

import java.util.ArrayList;

public abstract class UtilityMethod {

    public static <T extends Animal> void getHeaviestAndLightest(ArrayList<T> animals){


        T heaviest = animals.get(0);
        T lightest = animals.get(0);

        for (T animal : animals) {
            if (animal.getWeight() > heaviest.getWeight()) {
                heaviest = animal;
            }

            if (animal.getWeight() < lightest.getWeight()) {
                lightest = animal;
            }
        }

        System.out.println("more heaviest is: " + heaviest.getName() + " with " + heaviest.getWeight() +"kg");
        System.out.println("more lightest is: " + lightest.getName() + " with " + lightest.getWeight() +"kg");
    }

    public static <T extends Animal> void getHighestAndShortest(ArrayList<T> animals){


        T shortest = animals.get(0);
        T highest = animals.get(0);

        for (T animal : animals) {
            if (animal.getHeight() > highest.getHeight()) {
                highest = animal;
            }

            if (animal.getHeight() < shortest.getHeight()) {
                shortest = animal;
            }
        }

        System.out.println("more highest is: " + highest.getName() + " with " + highest.getHeight() +"cm");
        System.out.println("more shortest is: " + shortest.getName() + " with " + shortest.getHeight() +"cm");
    }

    public static int getLongestTail(){

        int longestTail = 0;

        for (Animal animal: Animal.allAnimals) {

            if (animal instanceof Tiger tiger) {

                // Tiger tiger  = (Tiger) animal;
                //  longestTail = tiger.getTailLenght() > longestTail ? tiger.getTailLenght() : longestTail;

                longestTail = Math.max(tiger.getTailLenght(), longestTail);

            } else if (animal instanceof Lion lion) {

                longestTail = Math.max(lion.getTailLenght(), longestTail);
            }

        }

        return longestTail;
    }

    public static int getLongestWingspan(){

        int longestWingspan = 0;

        for (Animal animal: Animal.allAnimals) {

            if (animal instanceof Eagle eagle) {

                longestWingspan = Math.max(eagle.getWingspan(), longestWingspan);

            }

        }

        return longestWingspan;
    }
}
