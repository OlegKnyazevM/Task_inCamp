package com.knyazev.tasks.polymorphism;

/**
 * Task 3. Example of Polymorphism
 * Created by Knyazev Oleg on 04.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        Shape[] a = new Shape[]{new Shape(), new Triangle(), new Circle(), new Cube()};

        for (Shape i : a) {
            i.draw();
        }
    }
}
