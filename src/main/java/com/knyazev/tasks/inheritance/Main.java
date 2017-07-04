package com.knyazev.tasks.inheritance;

/**
 * Task 2. Example of Inheritance
 * Created by Knyazev Oleg on 04.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Cat :");
        Cat cat = new Cat(false, "milk", 4, "black");

        System.out.println("Cat is vegetaring?" + cat.isVegetarian());
        System.out.println("Cat eats " + cat.getEats());
        System.out.println("Cat has " + cat.getNoOfLegs() + " legs.");
        System.out.println("Cat color is " + cat.getColor());

        System.out.println("Lion :");
        Lion lion = new Lion(false, "meat",4,"yellow");
        System.out.println("Lion is vegetaring?" + lion.isVegetarian());
        System.out.println("Lion eats " + lion.getEats());
        System.out.println("Lion has " + lion.getNoOfLegs() + " legs.");
        System.out.println("Lion color is " + lion.getColor());


    }

}
