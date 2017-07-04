package com.knyazev.tasks.encapsulation;

/**
 * Task 1. Example of encapsulation
 * Created by Knyazev Oleg on 04.07.2017.
 */
public class Main {
        public static void main(String[] args) {
            Students name = new Students(0);
            Students name2 = new Students(3);
            Students name3 = new Students(6);
            Students name4 = new Students(65);
            Students name5 = new Students(1);
            System.out.println(name.getId());
            System.out.println(name2.getId());
            System.out.println(name3.getId());
            System.out.println(name4.getId());
            System.out.println(name5.getId());

        }
}
