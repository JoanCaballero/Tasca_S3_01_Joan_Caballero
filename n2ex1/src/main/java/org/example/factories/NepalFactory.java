package org.example.factories;

import org.example.adress.Address;
import org.example.adress.NepalAddress;
import org.example.phone.NepalPhone;
import org.example.phone.Phone;

public class NepalFactory  implements AbstractFactory{

    @Override
    public Phone createPhone() {
        return new NepalPhone();
    }

    @Override
    public Address createAddress() {
        return new NepalAddress();
    }
}
