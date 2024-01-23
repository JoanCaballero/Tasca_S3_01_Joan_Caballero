package org.example.factories;

import org.example.adress.Address;
import org.example.adress.UgandaAddress;
import org.example.phone.Phone;
import org.example.phone.UgandaPhone;

public class UgandaFactory implements AbstractFactory{
    @Override
    public Phone createPhone() {
        return new UgandaPhone();
    }

    @Override
    public Address createAddress() {
        return new UgandaAddress();
    }
}
