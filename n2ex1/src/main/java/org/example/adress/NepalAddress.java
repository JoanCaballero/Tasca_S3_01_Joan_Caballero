package org.example.adress;

import org.example.IOUtils;

public class NepalAddress implements Address{

    private String address;

    public NepalAddress(){
        this.address = provideAddress();
    }

    @Override
    public String provideAddress(){
        System.out.println("Input a Nepali address: ");
        return IOUtils.readString();
    }

    @Override
    public String toString(){
        return "Address: " + address;
    }
}
