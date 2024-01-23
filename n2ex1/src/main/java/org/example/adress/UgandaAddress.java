package org.example.adress;

import org.example.IOUtils;

public class UgandaAddress implements Address{

    private String address;

    public UgandaAddress(){
        this.address = provideAddress();
    }

    @Override
    public String provideAddress(){
        System.out.println("Input a Ugandan address: ");
        return IOUtils.readString();
    }

    @Override
    public String toString(){
        return "Address: " + address;
    }
}
