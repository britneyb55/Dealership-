package com.pluralsight;

import com.pluralsight.application.ApplicationConfiguration;
import com.pluralsight.application.DealershipApplication;

public class Main {
    public static void main(String[] args)
    {
        ApplicationConfiguration config = new ApplicationConfiguration();

        DealershipApplication app = new DealershipApplication(config);
        app.run();
    }
}