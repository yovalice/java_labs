package part_09;

import java.sql.*;

/*
 * Created by yovaliceroman on 4/4/17.
 */


public class MyDbTest {

    private Connection connection = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    public static void main(String[] args)
            throws Exception {

        MyDbTest example = new MyDbTest();

        try {
            example.createTable();
            example.insertRecord("Yanitza", "Rivera");
            example.insertRecord("Brayan", "Rodriguez");
            example.update("Sebastian", "Rivera", 2);
            example.getRecord(2);
            example.delete(1);

        } catch (Exception e){
            System.out.println("error" + e.getMessage());
            System.out.println(e.getStackTrace());
        }
    }

    public static Connection getConnection()
        throws Exception{

        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/car_dealership?" +
                    "user=&password=&useSSL=false");

            return connection;

        } catch (Exception e) {
                System.out.println(e);
        }

        return null;
    }

    //create table method
    public void createTable()
            throws Exception {
        try {
            connection = getConnection();

            statement = connection.createStatement();

            preparedStatement = connection
                    .prepareStatement("create table Sales_Representative ( id int NOT NULL auto_increment, " +
                            "FirstName varchar(30) NOT NULL, LastName varchar(30) NOT NULL, PRIMARY KEY (id))");

            preparedStatement.executeUpdate();

        } catch (Exception e) {
            throw e;
        } finally {
            close();
        }
    }

    //insert into table method
    public void insertRecord(String firstName, String lastName)
           throws Exception {
            try {
                connection = getConnection();

                statement = connection.createStatement();

                preparedStatement = connection
                        .prepareStatement("insert into car_dealership.Sales_Representative (FirstName, LastName)"
                                + "values ( ? , ?)");

                preparedStatement.setString(1, firstName);
                preparedStatement.setString(2, lastName);
                preparedStatement.executeUpdate();

            } catch (Exception e) {
                throw e;
            } finally {
                close();
            }
        }

    //update record method
    public void update(String firstName, String lastName, int id)
            throws Exception {
        try {
            connection = getConnection();

            statement = connection.createStatement();

            preparedStatement = connection
                    .prepareStatement("update car_dealership.Sales_Representative set FirstName = ?, " +
                            "LastName = ? where id = ? ");

            preparedStatement.setString(1, firstName);
            preparedStatement.setString(2, lastName);
            preparedStatement.setInt(3, id);
            preparedStatement.executeUpdate();

        } catch (Exception e) {
            throw e;
        } finally {
            close();
        }
    }

    //delete record method
    public void delete(int id)
            throws Exception {
        try {
            connection = getConnection();

            statement = connection.createStatement();

            preparedStatement = connection
                    .prepareStatement("delete from car_dealership.Sales_Representative where id = ? ");

            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();

        } catch (Exception e) {
            throw e;
        } finally {
            close();
        }
    }

    //get record method
    public void getRecord(int id)
            throws Exception {
        try {
            connection = getConnection();

            statement = connection.createStatement();

            preparedStatement = connection
                    .prepareStatement("select * from car_dealership.Sales_Representative where id = ?");

            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();

            writeResultSet(resultSet);

        } catch (Exception e) {
            throw e;
        } finally {
            close();
        }

    }

    private void writeResultSet(ResultSet resultSet) throws SQLException {
        while (resultSet.next()) {
            String firstName = resultSet.getString("FirstName");
            String lastName = resultSet.getString("LastName");
            int id = resultSet.getInt("id");
            System.out.println("Id: " + id);
            System.out.println("First Name: " + firstName);
            System.out.println("Last Name: " + lastName);
            System.out.println("---------------------------------");
            System.out.println("---------------------------------");

        }
    }

    private void close() {
        try {

            if (statement != null) {
                statement.close();
            }

            if (connection != null) {
                connection.close();
            }
        } catch (Exception e) {

        }
    }
}
