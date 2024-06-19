package com.pluralsight.services.MySql;

import com.pluralsight.models.Vehicle;
import com.pluralsight.services.VehicleDao;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MysqlVehicleDao implements VehicleDao
{
    DataSource dataSource;

    public MysqlVehicleDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public List<Vehicle> searchByPrice(double min,double max)
    {
        List<Vehicle> vehiclePrice = new ArrayList<>();

        try(Connection connection = dataSource.getConnection())
        {
            String sql = """
                    SELECT  VIN
                           , year_vehicle
                           , make
                           , model
                           , odometer
                           , price
                           , sold
                    FROM vehicles
                    WHERE price BETWEEN ? AND ?;
                    """;
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setDouble(1, min);
            statement.setDouble(2, max);

            ResultSet row = statement.executeQuery();


            while(row.next())
            {
                String vin = row.getString("VIN");
                int vehicleYear = row.getInt("year_Vehicle");
                String make = row.getString("make");
                String model = row.getString("model");
                int odometer = row.getInt("odometer");
                double price = row.getDouble("price");
                String sold = row.getString("sold");

                vehiclePrice.add(new Vehicle( vin, vehicleYear , make,model,odometer,price,sold));


            }


        }catch(SQLException e)
        {

        }

        return vehiclePrice;
    }

    public List<Vehicle> SearchByMakeModel(String make, String model)
    {
        List<Vehicle> vehicles = new ArrayList<>();
        try(Connection connection = dataSource.getConnection())
        {
            String sql =
                    """
                     SELECT VIN
                           , year_vehicle
                           , make
                           , model
                           , odometer
                           , price
                           , sold
                     FROM vehicles
                     WHERE (make = ?) And model = ?;
                    """;
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, make);
            statement.setString(2,model);

            ResultSet row = statement.executeQuery();

            while(row.next())
            {
                String vin = row.getString("VIN");
                int vehicleYear = row.getInt("year_Vehicle");
                String vehicleMake = row.getString("make");
                String vehicleModel = row.getString("model");
                int odometer = row.getInt("odometer");
                double price = row.getDouble("price");
                String sold = row.getString("sold");

                vehicles.add(new Vehicle( vin, vehicleYear , vehicleMake,vehicleModel,odometer,price,sold));

            }


        }
        catch(SQLException e)
        {

        }
        return vehicles;
    }

    @Override
    public List<Vehicle> searchyByYearRange(double min, double max)
    {
        List<Vehicle> vehicles = new ArrayList<>();
        try(Connection connection = dataSource.getConnection())
        {
            String sql= """
                    SELECT VIN
                           , year_vehicle
                           , make
                           , model
                           , odometer
                           , price
                           , sold
                    FROM vehicles
                    WHERE year_vehicle BETWEEN ? AND ?;
                    """;
            PreparedStatement statement = connection.prepareStatement(sql);
            Statement statement1 = co

            statement.setDouble(1,min);
            statement.setDouble(2,max);
            ResultSet row = statement.executeQuery();

            while(row.next())
            {
                String vin = row.getString("VIN");
                int vehicleYear = row.getInt("year_Vehicle");
                String vehicleMake = row.getString("make");
                String vehicleModel = row.getString("model");
                int odometer = row.getInt("odometer");
                double price = row.getDouble("price");
                String sold = row.getString("sold");

                vehicles.add(new Vehicle( vin, vehicleYear , vehicleMake,vehicleModel,odometer,price,sold));
            }



        }
        catch(SQLException e)
        {

        }
        return vehicles;
    }

    public List<Vehicle> searchByMileageRange(double min, double max)
    {
        List<Vehicle> vehicles = new ArrayList<>();
        try(Connection connection = dataSource.getConnection())
        {
            String sql= """
                    SELECT VIN
                           , year_vehicle
                           , make
                           , model
                           , odometer
                           , price
                           , sold
                    FROM vehicles
                    WHERE odometer BETWEEN ? AND ?;
                    """;
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setDouble(1,min);
            statement.setDouble(2,max);

        }
        catch(SQLException e)
        {

        }
        return vehicles;


    }

}
