package org.example.phone;

import org.example.IOUtils;

public class UgandaPhone implements Phone{

    private String phone;

    public UgandaPhone(){
        this.phone = providePhone();
    }

    @Override
    public String providePhone() {
        System.out.println("Input a ugandan phone number: ");
        String number = IOUtils.readString();
        return "+256 " + number;
    }

    @Override
    public String toString(){
        return "Phone number: " + phone;
    }
}
