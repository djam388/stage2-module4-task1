package com.mjc.stage2.impl;

import com.mjc.stage2.ConnectionFactory;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class H2ConnectionFactory implements ConnectionFactory {

    Connection connection = null;

    public H2ConnectionFactory() {
    }

    @Override
    public Connection createConnection() {
        Properties appProperties;
        try {
            appProperties = new ReadAppProperties().getProperties();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            Class.forName(appProperties.getProperty("jdbc_driver"));
            connection = DriverManager.getConnection(appProperties.getProperty("db_url"),
                    appProperties.getProperty("user"),
                    appProperties.getProperty("password"));
        }

        catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
    // Write your code here!
}

