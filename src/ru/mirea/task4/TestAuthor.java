package ru.mirea.task4;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("K.T.Brown","KBrown@gmail.com", 'f');
        System.out.println("The name of author is " + a1.getName());
        System.out.println("The email of author is " + a1.getEmail());
        System.out.println("the gender of author is " + a1.getGender());
        a1.setEmail("BrowBrow.gmail.com");
        System.out.println(a1);
    }
}
