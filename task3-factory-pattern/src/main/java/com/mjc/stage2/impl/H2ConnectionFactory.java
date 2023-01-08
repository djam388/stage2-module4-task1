package com.mjc.stage2.impl;

import com.mjc.stage2.ConnectionFactory;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class H2ConnectionFactory implements ConnectionFactory {
    Properties appProperties = new ReadAppProperties().getProperties();
    Connection connection = null;

    public H2ConnectionFactory() throws IOException {
    }

    @Override
    public Connection createConnection() throws SQLException, ClassNotFoundException {
        Class.forName(appProperties.getProperty("jdbc_driver"));
        connection = DriverManager.getConnection(appProperties.getProperty("db_url"),
                appProperties.getProperty("user"),
                appProperties.getProperty("password"));
        return connection;
    }
    // Write your code here!
}

