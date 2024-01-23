package org.example.phone;

import org.example.IOUtils;

public class NepalPhone implements Phone{

    private String phone;

    public NepalPhone(){
        this.phone = providePhone();
    }

    @Override
    public String providePhone() {
        System.out.println("Input a nepali phone number: ");
        String number = IOUtils.readString();
        return "+977 " + number;
    }

    @Override
    public String toString(){
        return "Phone number: " + phone;
    }
}
