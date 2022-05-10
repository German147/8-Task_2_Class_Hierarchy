package org.universityHierarchy.Homework_Reflection_And_Threads;


import java.sql.SQLException;

public class PoolConnectionUsingDBCPDataSource {
    /**
     * This is a static object of BasicDataSource so there is no need to create a new instance to call it.
     * Just call by its name
     */
    //  private static BasicDataSource ds = null;

    /**
     * With this method we get the database properties
     *
     * @param
     * @return the configuration for our own dataSource connection
     */
//    public static DataSource getMySQLDataSource() {
//        if (PoolConnectionUsingDBCPDataSource.ds == null) {
//            PoolConnectionUsingDBCPDataSource.ds = new BasicDataSource();
//            PoolConnectionUsingDBCPDataSource.ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
//            PoolConnectionUsingDBCPDataSource.ds.setUrl("jdbc:mysql://localhost:3306/clinica");
//            PoolConnectionUsingDBCPDataSource.ds.setUsername("root");
//            PoolConnectionUsingDBCPDataSource.ds.setPassword("12345");
//            PoolConnectionUsingDBCPDataSource.ds.setMinIdle(5);
//            PoolConnectionUsingDBCPDataSource.ds.setMaxIdle(10);
//            PoolConnectionUsingDBCPDataSource.ds.setMaxOpenPreparedStatements(100);
//        }
//        return PoolConnectionUsingDBCPDataSource.ds;
//    }

    /**
     * This method
     *
     * @return the configuration of the connection to the DB
     * @throws SQLException this shoudl be instantiated int the DAO class for all the CRUD operations
     */
//    public static Connection getConnection() throws SQLException {
//        return getMySQLDataSource().getConnection();
//    }

}
