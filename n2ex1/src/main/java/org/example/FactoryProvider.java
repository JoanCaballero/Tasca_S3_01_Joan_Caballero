package org.example;

import org.example.factories.AbstractFactory;
import org.example.factories.NepalFactory;
import org.example.factories.UgandaFactory;

public class FactoryProvider {
    public static AbstractFactory getFactory(String country){
        switch (country) {
            case "Nepal" -> {
                return new NepalFactory();
            }
            case "Uganda" -> {
                return new UgandaFactory();
            }
        }
        return null;
    }
}
