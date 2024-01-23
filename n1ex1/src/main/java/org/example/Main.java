package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Undo undo = Undo.getInstance();
        do {
            int opcion = mostrarMenu();
            switch (opcion) {
                case 1 -> undo.addComandaiRegistre();
                case 2 -> undo.removeComandaiRegistre();
                case 3 -> undo.ultimesComandes();
                case 4 -> undo.deshacer();
                case 5 -> System.exit(0);
            }
        } while (true);
    }

    private static int mostrarMenu() {
        System.out.println("1. Afegir comanda");
        System.out.println("2. Eliminar comanda");
        System.out.println("3. Mostrar últimes comandes");
        System.out.println("4. Desfer acció");
        System.out.println("5. Sortir");
        System.out.print("Introdueix una opció: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}