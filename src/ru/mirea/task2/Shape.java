package ru.mirea.task2;

public class Shape {
    private String shape;

    public Shape (String sh){
        this.shape = sh;
    }
    public Shape (){
        this.shape = "circle";
    }
    public void setShape(String sh){
        this.shape = sh;
    }
    public String getShape(){
        return this.shape;
    }
    public String toString(){
        return "the shape of this object is "+ this.shape;
    }
}
