package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Geef naam van product: ");

        String naam = scanner.nextLine();

        System.out.print("Geef prijs van product: ");

        int prijs = Integer.parseInt(scanner.nextLine());

        try {

            Product p = new Product(naam, prijs);

            System.out.printf("%s kost %d EUR.%n", p.getNaam(), p.getPrijs());

        } catch(IllegalArgumentException ex){

            System.out.println(ex.getMessage());
        }
    }
}
