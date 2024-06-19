package com.pluralsight.View;

import java.util.Scanner;

public class VehicleMakeModel
{
    private Scanner in = new Scanner(System.in);

    public String vehicleMake()
    {
        System.out.println("-".repeat(40));
        System.out.println();
        System.out.println();
        System.out.println("Vehicle Make and model: ");
        System.out.println("-".repeat(40));
        System.out.println("Enter the vehicle make");

        return in.nextLine();
    }

    public String vehicleModel()
    {
        System.out.println();
        System.out.println("Enter the vehicle model");

        return in.nextLine();
    }


}
