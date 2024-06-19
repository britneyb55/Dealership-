package com.pluralsight.View;

import java.util.Scanner;

public class HomeView
{
    public int getUserSelection()
    {
        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.println("Dealership Home");
        System.out.println("-".repeat(40));
        System.out.println(" 1) Vehicle by price range ");
        System.out.println(" 2) Search by Vehicle make and model ");
        System.out.println(" 3) Search by Vehicle year");
        System.out.println(" 0) Exit");
        System.out.println();
        System.out.println("Please select an option");

        return Integer.parseInt(in.nextLine());

    }
}
