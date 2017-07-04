package com.knyazev.tasks.encapsulation;

/**
 * Task 1. Example of encapsulation
 * Created by Knyazev Oleg on 04.07.2017.
 */
public class Students {
    private int id = 0;
    private final String names[] = {"Oleg", "Vova", "Rita", "Tanya", "Artem", "Mihail", "Jenya"};

    public Students(int id) {
        this.id = id;
    }

    public String getId() {
        String result= "";
        if (id < 0 || id >= 7){
            result = " Число дожно быть больше или равно \"0\" и меньше \"6\", включительно.";
        }else result = names[id];
        return result;
    }
}
