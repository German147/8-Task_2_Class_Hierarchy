package org.universityHierarchy.Homework_Reflection_And_Threads;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class MyConnectionPool_ToDB {

    private static final Logger LOGGER = LogManager.getLogger(MyConnectionPool_ToDB.class);
    // TODO: 11/05/2022  crear constructor privado
    /**
     * Here it is established the configuration of the DB
     */
    private static final String DRIVER_CLASS = "driver.class.name";
    private static final String JDBC_URL = "datasource.url";
    private static final String JDBC_USER = "datasource.username";
    private static final String JDBC_PASSWORD = "datasource.password";
    /**
     * Here I create an object the connection class MyConnectionPool_ToDB called datasource.
     * This is the only object of this class, that is why it is private
     */
    private static MyConnectionPool_ToDB dataSource;
    /**
     * The next object of BasicDataSouece will have a standard basic connection, this will
     * allow us to create a connection pool.
     */
    //  private BasicDataSource basicDataSource = null;
    private static Connection connection = null;
    private static final Properties properties = null;

    /**
     * Here I create private constructor of this class with the initialized field of the
     * basicDataSource, it is private in order not to be able to be created from another class,
     * respecting the design patron of singleton
     */
    private MyConnectionPool_ToDB() {
        //  basicDataSource = new BasicDataSource();

        try {
            properties.load(new FileInputStream("src/main/resources/DataBase.properties"));
//            Class.forName(properties.getProperty(DRIVER_CLASS));
            connection = DriverManager.getConnection(
                    properties.getProperty(JDBC_URL),
                    properties.getProperty(JDBC_USER),
                    properties.getProperty(JDBC_PASSWORD));

        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
//        basicDataSource.setDriverClassName(DRIVER_CLASS);
//        basicDataSource.setUrl(JDBC_URL);
//        basicDataSource.setUsername(JDBC_USER);
//        basicDataSource.setPassword(JDBC_PASSWORD);


        //minimum non-active connection allowed
        //   basicDataSource.setMinIdle(5);
        //maximum non-active connection allowed
        //  basicDataSource.setMaxIdle(10);
        //maximum of both, non-active and active connections allowed
        //  basicDataSource.setMaxTotal(15);
        //waiting time for a free connection ----putting -1 (minus 1) the time is infinite
        //   basicDataSource.setMaxWaitMillis(10000);

    }

    /**
     * Here we generate an instance of a new object of this class just in case that
     * there is not an existing one.
     * If not,then it returns only one object. So this verify there is only one object
     * of this class
     */
//    public static MyConnectionPool_ToDB getInstance() {
//        if (dataSource == null) {
//            dataSource = new MyConnectionPool_ToDB();
//        }
//        return dataSource;
//    }

    /**
     * Here I create an object of type Connection, first I set null this Connection in order to
     * set the correct parameter of its datasource
     */
//    public Connection getConnection() {
//        Connection connect = null;
//        try {
//            connect = this.basicDataSource.getConnection();
//        } catch (SQLException e) {
//            LOGGER.error(e.getMessage());
//        }
//        return connect;
//    }
    public static Connection getConnection() {
        return connection;
    }

    public static void closeConnection(Connection connection) throws SQLException {
        connection.close();
    }


//    /**
//     * Here I am using the library of org.apache.commons.dbcp2.BasicDataSource to create
//     * this connection pool.
//     * @return the connection datasource
//     */
//    public static DataSource getDatasource() {
//        BasicDataSource ds = new BasicDataSource();
//        ds.setUrl(JDBC);
//        ds.setUsername(JDBC_USER);
//        ds.setPassword(JDBC_PASSWORD);
//        ds.setInitialSize(50);
//
//        return ds;
//    }

//    public static Connection getConnection() throws SQLException {
//        return getDatasource().getConnection();
//    }

//    public static void close(ResultSet rs) throws SQLException {
//        rs.close();
//    }

    //
//    public static void close(@NotNull Statement stmt) throws SQLException {
//        stmt.close();
//    }
//
//    public static void close(PreparedStatement stmt) throws SQLException {
//        stmt.close();
//    }

}
