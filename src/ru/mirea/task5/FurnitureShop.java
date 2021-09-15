package ru.mirea.task5;

public class FurnitureShop {
    public static void main(String[] args) {
Chair ch1 = new Chair("pine", 24, "cotton");
Cupboard sh1 = new Cupboard("birch", 16, 6);
Table t1 = new Table("glass", 8, "circle");
System.out.println("Our stock:");
ch1.ChToString();
sh1.ShToString();
t1.TToString();
    }
}
