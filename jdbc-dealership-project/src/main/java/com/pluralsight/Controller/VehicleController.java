package com.pluralsight.Controller;

import com.pluralsight.models.Vehicle;
import com.pluralsight.services.VehicleDao;

import javax.sql.DataSource;

import java.util.List;

public class VehicleController
{
    private VehicleDao vehicleDao;


    public VehicleController(VehicleDao vehicleDao)
    {
        //create a instance of an object
        this.vehicleDao = vehicleDao;
    }

    public List<Vehicle> vehiclePriceRange(double min, double max)
    {
        var vehicle = vehicleDao.searchByPrice( min, max);

        return vehicle;
    }

    public List<Vehicle> vehicleMakeModel(String make, String model)
    {
        var vehicle = vehicleDao.SearchByMakeModel(make, model);
        return vehicle;
    }

    public List<Vehicle> vehicleYearRange(double min, double max)
    {
        var vehicle = vehicleDao.searchyByYearRange(min,max);
        return vehicle;
    }
}
