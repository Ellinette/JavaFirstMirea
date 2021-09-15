package ru.mirea.task2;

public class TestShape {
    public static void main(String[] args) {
        Shape sh1 = new Shape("triangle");
        Shape sh2 = new Shape();
        Shape sh3 = new Shape();
        sh2.setShape("ellipse");
        System.out.println(sh1);
        System.out.println(sh2);
        System.out.println(sh3);
    }
}
