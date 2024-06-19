package com.pluralsight.View;

import com.pluralsight.models.Vehicle;

import java.util.List;
import java.util.Scanner;

public class Display
{
    Scanner in = new Scanner(System.in);

    public void displayVehicle(List<Vehicle> vehiclePrice)
    {
        System.out.println("Vehicle");
        System.out.println("-".repeat(40));
        vehiclePrice.forEach( vehicle -> {
            System.out.printf("%-4s %-12d %-10s %-10s %f \n", vehicle.getVin(), vehicle.getYear(), vehicle.getMake(), vehicle.getModel(),vehicle.getPrice());
        });
    }
}
