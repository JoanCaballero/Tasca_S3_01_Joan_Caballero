package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int select;

        do {
            printMenu();

            select = scanner.nextInt();
            scanner.nextLine();

            switch (select) {
                case 1 -> IOUtils.addToAgenda();

                case 2 -> IOUtils.showAgenda();

                case 3 -> System.out.println("Exiting program");
            }

        } while (select != 3);
    }

    public static void printMenu() {

        System.out.println("""
                -------------------
                Escolliu una opció:
                1: Introduce a new contact
                2: Show contact list
                3: Exit
                ------------------
                """);

    }
}