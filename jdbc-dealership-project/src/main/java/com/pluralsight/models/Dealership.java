package com.pluralsight.models;

import java.util.ArrayList;

public class Dealership
{
    private final int dealershipId;
    private final  String name;
    private final String address;
    private final String phone;
    private final ArrayList<Vehicle> vehicles;

    public Dealership(int dealershipId, String name, String address, String phone, ArrayList<Vehicle> vehicles) {
        this.dealershipId = dealershipId;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.vehicles = vehicles;
    }


    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }




}
