package com.pluralsight.models;

public class Inventory
{
    private int dealershi_id;
    private String VIN;

    public Inventory(int dealershi_id, String VIN) {
        this.dealershi_id = dealershi_id;
        this.VIN = VIN;
    }


    public Inventory() {
    }

    public int getDealershi_id() {
        return dealershi_id;
    }

    public void setDealershi_id(int dealershi_id) {
        this.dealershi_id = dealershi_id;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }
}
