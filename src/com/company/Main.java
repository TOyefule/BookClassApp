package com.company;


/*

    [X]  Create a project in IntelliJ called BookApplication.

    [X]  Create a Book class that allows for Book title, author, description, price and isInStock variables

    [X]  The Book class shall contain private member variables, a default constructor, an overloaded constructor and a method called getDisplayText() which prints the author, title and description.

    [X]  The application shall also contain getters and setters for each private member variable.

    [X]  Create another class called BookApp which contains the main method. In the main method you shall create an instance of a Book and print the Author, Title and Description.

    [X]  Publish your solution to GitHub and submit your GitHub url as the assignment.



*/
public class Main {

    public static void main(String[] args) {
        Book harrypotter = new Book();
        harrypotter.setTitle("Harry Potter and the Half Blood Prince ");
        harrypotter.setAuthor("J.K.Rowling ");
        harrypotter.setDescription("Teenage wizard goes on adventures" );
        harrypotter.setPrice(12.50);



        String bookResult = harrypotter.getDisplayText();
        System.out.println(bookResult);
    }



}
