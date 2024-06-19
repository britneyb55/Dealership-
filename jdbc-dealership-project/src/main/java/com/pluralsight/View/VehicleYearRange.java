package com.pluralsight.View;

import java.util.Scanner;

public class VehicleYearRange
{
    private Scanner in = new Scanner(System.in);

    public double vehicleYearMin()
    {
        System.out.println();
        System.out.println("Vehicle Year Range");
        System.out.println("-".repeat(40));
        System.out.print("Enter Earlist Year :  ");

        return Integer.parseInt(in.nextLine());
    }

    public double vehicleYearMax()
    {
        System.out.println();
        System.out.println("-".repeat(40));
        System.out.print("Enter recent vehicle year");

        return Integer.parseInt(in.nextLine());

    }

}
