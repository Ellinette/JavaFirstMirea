package ru.mirea.task3;

public class Book {
    private String author;
    private String genre;
    private String title;
    private int year;

    public Book(String author, String genre, String title, int year){
        this.author = author;
        this.genre = genre;
        this.title = title;
        this.year = year;
    }
    public Book(){
        this.author = "J.K.Rowling";
        this.genre = "fantasy";
        this.title = "Harry Potter and Philosopher Stone";
        this.year = 1997;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public String getAuthor(){
        return this.author;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    public String getGenre(){
        return this.genre;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    }
    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        return this.year;
    }
}
