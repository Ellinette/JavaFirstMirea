package ru.mirea.task6;

public class Planet implements Nameable {
    private String name;
    public Planet (String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
