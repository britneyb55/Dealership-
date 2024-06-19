package com.pluralsight.View;

import java.util.Scanner;

public class VehiclePriceRange
{
    public double getMinPrice()
    {
        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.println("Price Range");
        System.out.println("-".repeat(40));
        System.out.print("Enter the minimum price ");

        return Integer.parseInt(in.nextLine());
    }

    public double getMaxPrice()
    {
        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter the max price ");
        System.out.println("-".repeat(40));

        return Integer.parseInt(in.nextLine());
    }


}
