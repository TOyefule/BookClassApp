package com.company;

public class Book {
    private String Title;
    private String Author;
    private String Description;
    private double Price ;
    private int isInStock;

    public Book() {
       // System.out.println("this is a default constructor");
    }

    public Book(String title, String author, String description, double price, int isInStock) {
        Title = title;
        Author = author;
        Description = description;
        Price = price;
        this.isInStock = isInStock;
    }

    public String getTitle() {
        return Title;
    }

    public String getAuthor() {
        return Author;
    }

    public String getDescription() {
        return Description;
    }

    public double getPrice() {
        return Price;
    }

    public int getIsInStock() {
        return isInStock;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public void setIsInStock(int isInStock) {
        this.isInStock = isInStock;
    }

    public String getDisplayText(){

        return Title + Author+ Description;
    }
}
