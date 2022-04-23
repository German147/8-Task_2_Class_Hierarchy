package org.universityHierarchy.Homework_Reflection_And_Threads;

import org.apache.commons.dbcp.BasicDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class PoolConnectionUsingDBCPDataSource {
    /**
     * This is a static object of BasicDataSource so there is no need to create a new instance to call it.
     * Just call by its name
     */
    private static BasicDataSource ds = null;

    /**
     * With this method we get the database properties
     *
     * @return the configuration for our own dataSource connection
     */
    public static DataSource getMySQLDataSource() {
        if (ds == null) {
            ds = new BasicDataSource();
            ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
            ds.setUrl("jdbc:mysql://localhost:3306/clinica");
            ds.setUsername("root");
            ds.setPassword("12345");
            ds.setMinIdle(5);
            ds.setMaxIdle(10);
            ds.setMaxOpenPreparedStatements(100);
        }
        return ds;
    }

    /**
     * This method
     *
     * @return the configuration of the connection to the DB
     * @throws SQLException this shoudl be instantiated int the DAO class for all the CRUD operations
     */
    public static Connection getConnection() throws SQLException {
        return getMySQLDataSource().getConnection();
    }

}
