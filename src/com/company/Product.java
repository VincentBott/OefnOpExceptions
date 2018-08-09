package com.company;

public class Product {


    private int prijs;
    private String naam;


    public Product(String naam, int prijs) {

        if (naam.length() < 2) throw new IllegalArgumentException("Naam moet minstens 2 karakters lang zijn.");

        if (prijs < 0) throw new IllegalArgumentException("De prijs mag niet negatief zijn.");

        this.naam = naam;
        this.prijs = prijs;

    }

    public Object getNaam() {
        return this.naam;
    }

    public Object getPrijs() {
        return this.prijs;
    }
}
