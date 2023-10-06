package com.example.SpringBootRestCRUD.model;

public class Book {
    private int id;
    private String title;
    private double price;

    public Book(){

    }


    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
