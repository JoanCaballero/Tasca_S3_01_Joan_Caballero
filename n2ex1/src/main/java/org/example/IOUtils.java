package org.example;

import org.example.factories.AbstractFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IOUtils {

    private static final List<Contact> agenda = new ArrayList<>();
    private static final Scanner sc = new Scanner(System.in);
    public static String readString(){
        return sc.nextLine();
    }
    public static void addToAgenda(){
        System.out.println("Input a valid country: Uganda - Nepal");
        String country = sc.nextLine();
        AbstractFactory provider = FactoryProvider.getFactory(country);
        agenda.add(new Contact(provider));
    }
    public static void showAgenda(){
        agenda.forEach(System.out::println);
    }
}
