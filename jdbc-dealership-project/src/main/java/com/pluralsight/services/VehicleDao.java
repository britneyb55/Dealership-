package com.pluralsight.services;

import com.pluralsight.models.Vehicle;

import java.util.List;

public interface VehicleDao
{
    List<Vehicle> searchByPrice(double min, double max);
    List<Vehicle> SearchByMakeModel(String make, String model);
    List<Vehicle> searchyByYearRange(double min, double max);
    List<Vehicle> searchByMileageRange(double min, double max);

}
