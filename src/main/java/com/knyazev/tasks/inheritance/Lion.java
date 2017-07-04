package com.knyazev.tasks.inheritance;

/**
 * Task 2. Example of Inheritance
 * Created by Knyazev Oleg on 04.07.2017.
 */
public class Lion extends Animal {
    private String color;

    public Lion(boolean veg, String food, int legs) {
        super(veg, food, legs);
        this.color="\n" + "Yellow";
    }

    public Lion(boolean veg, String food, int legs, String color){
        super(veg, food, legs);
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
