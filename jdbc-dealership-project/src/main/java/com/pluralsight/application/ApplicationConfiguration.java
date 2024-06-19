package com.pluralsight.application;

import com.pluralsight.Controller.VehicleController;
import com.pluralsight.View.*;
import com.pluralsight.services.MySql.MysqlVehicleDao;
import com.pluralsight.services.VehicleDao;
import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ApplicationConfiguration
{
    //DataSources
    private final DataSource dataSource = buildDataSource();

    private static DataSource buildDataSource() {
        try (FileInputStream stream = new FileInputStream("src/main/resources/config.properties")) {
            // first get the variables from the properties file
            Properties properties = new Properties();
            properties.load(stream);

            String connectionString = properties.getProperty("db.connectionString");
            String username = properties.getProperty("db.username");
            String password = properties.getProperty("db.password");

            // build a BasicDataSource object
            BasicDataSource dataSource = new BasicDataSource();
            dataSource.setUrl(connectionString);
            dataSource.setUsername(username);
            dataSource.setPassword(password);

            return dataSource;

        } catch (IOException e) {
        }

        return null;
    }

    VehicleDao vehicleDao = new MysqlVehicleDao(dataSource);
    VehicleController vehicleController = new VehicleController(vehicleDao);

    Display displayFormat = new Display();
    VehiclePriceRange vehiclePriceRange = new VehiclePriceRange();
    VehicleMakeModel vehicleMakeModel = new VehicleMakeModel();
    VehicleYearRange vehicleYearRange = new VehicleYearRange();
    HomeView homeView = new HomeView();
}
