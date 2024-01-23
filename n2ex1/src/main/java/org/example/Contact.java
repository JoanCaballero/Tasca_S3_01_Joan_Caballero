package org.example;

import org.example.adress.Address;
import org.example.factories.AbstractFactory;
import org.example.phone.Phone;

public class Contact {

    private AbstractFactory provider;
    private Phone phone;
    private Address address;

    public Contact(AbstractFactory provider){
        this.provider = provider;
        this.phone = provider.createPhone();
        this.address = provider.createAddress();
    }

    @Override
    public String toString(){
        return phone + ", " + address;
    }
}
