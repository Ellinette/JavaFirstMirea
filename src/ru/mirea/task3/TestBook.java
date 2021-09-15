package ru.mirea.task3;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("F.M.Dostoevsky", "novel","Crime and Punishment",1866);
        System.out.println("The title of book is "+ b1.getTitle());
        System.out.println("The author of book is "+ b1.getAuthor());
        System.out.println("The genre of book is "+ b1.getGenre());
        System.out.println("The publication year of book is "+ b1.getYear()+"\n");
        b1.setTitle("Yhe fellowship of the Rings");
        b1.setAuthor("J.R.R.Tolkien");
        b1.setYear(1954);
        b1.setGenre("fantasy");
        System.out.println("The title of book is "+ b1.getTitle());
        System.out.println("The author of book is "+ b1.getAuthor());
        System.out.println("The genre of book is "+ b1.getGenre());
        System.out.println("The publication year of book is "+ b1.getYear()+"\n");
        System.out.println("The title of book is "+ b2.getTitle());
        System.out.println("The author of book is "+ b2.getAuthor());
        System.out.println("The genre of book is "+ b2.getGenre());
        System.out.println("The publication year of book is "+ b2.getYear());
    }
}
