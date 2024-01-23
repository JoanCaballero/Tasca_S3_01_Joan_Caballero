package org.example.factories;

import org.example.adress.Address;
import org.example.phone.Phone;

public interface AbstractFactory {

    Phone createPhone();
    Address createAddress();
}
