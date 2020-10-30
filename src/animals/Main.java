package animals;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        // System.out.println(animalList.toString());
        animalList.add(new Mammals("Panda", 1869));
        animalList.add(new Mammals("Zebra", 1778));
        animalList.add(new Mammals("Koala", 1816));
        animalList.add(new Mammals("Sloth", 1804));
        animalList.add(new Mammals("Armadillo", 1758));
        animalList.add(new Mammals("Raccoon", 1758));
        animalList.add(new Mammals("Bigfoot", 2021));

        animalList.add(new Birds("Pigeon", 1837));
        animalList.add(new Birds("Peacock", 1821));
        animalList.add(new Birds("Toucan", 1758));
        animalList.add(new Birds("Parrot", 1824));
        animalList.add(new Birds("Swan", 1758));

        animalList.add(new Fish("Salmon", 1758));
        animalList.add(new Fish("Catfish", 1817));
        animalList.add(new Fish("Perch", 1758));


        // Sorting by year discovered
        System.out.println("Sorting By Year Discovered");
        animalList.sort((a1, a2) -> (a1.getYearDiscovered() < a2.getYearDiscovered()) ? 1 : -1);
        printFilteredList(animalList, a -> a instanceof Animal);

        //Sorting Alphabetically
        System.out.println("Sorting Alphabetically");
        animalList.sort((a1, a2) -> (a1.getName().compareToIgnoreCase(a2.getName())));
        animalList.forEach(a -> System.out.println(a));

        //Sorting by movement
        System.out.println("Sorting By Movement");
        printFilteredList(animalList, a -> a instanceof Birds);
        printFilteredList(animalList, a -> a instanceof Fish);
        printFilteredList(animalList, a -> a instanceof Mammals);

        System.out.println("Sorting By Breathing");
        printFilteredList(animalList, a -> a instanceof Birds);
        printFilteredList(animalList, a -> a instanceof Mammals);


    }

    public static void printFilteredList(List<Animal> animalList, AnimalTester AnimalTester) {
        for (Animal a : animalList) {
            if (AnimalTester.test(a)) {
                System.out.println(a);
            }
        }
    }
}