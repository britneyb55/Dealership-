package com.pluralsight.application;

import com.pluralsight.models.Vehicle;

import java.util.List;

public class DealershipApplication
{
    private ApplicationConfiguration config;


    public DealershipApplication(ApplicationConfiguration config)

    {
        this.config = config;
    }

    public void run()
    {
        while(true)
        {
            int selection = config.homeView.getUserSelection();

            switch (selection)
            {
                case 1 -> displayPriceRange();
                case 2 -> displayVehicleMakeModel();
                case 3 -> displayVehicleYearRange();
                case 0 -> System.exit(0);
            }
        }

    }

    private void displayVehicleYearRange()
    {
        double min = config.vehicleYearRange.vehicleYearMin();
        double max = config.vehicleYearRange.vehicleYearMax();

        List<Vehicle> vehicles = config.vehicleController.vehicleYearRange(min,max);
        config.displayFormat.displayVehicle(vehicles);
    }

    private void displayVehicleMakeModel()
    {
        String make = config.vehicleMakeModel.vehicleMake();
        String model = config.vehicleMakeModel.vehicleModel();
        System.out.println();
        List<Vehicle> vehicleMakeModel= config.vehicleController.vehicleMakeModel(make,model);
        config.displayFormat.displayVehicle(vehicleMakeModel);
    }

    private void displayPriceRange()
    {
        double min = config.vehiclePriceRange.getMinPrice();
        double max = config.vehiclePriceRange.getMaxPrice();
        System.out.println();
        //go to the actors controller and get a list of actors
        List<Vehicle> vehiclePrice = config.vehicleController.vehiclePriceRange(min, max);

        // call the actor listView and pass in th returned list
        config.displayFormat.displayVehicle(vehiclePrice);
    }


}

