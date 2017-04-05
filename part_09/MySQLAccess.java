package part_09;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.ExecutionException;

public class MySQLAccess {
    private Connection connection = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    public static void main(String[] args) {
        MySQLAccess example = new MySQLAccess();
        try {
//            example.readDataBase(args[0], args[1], Integer.parseInt(args[2]), args[3]);
            example.updateDescription(Integer.parseInt(args[0]), args[1]);

        } catch (Exception e){
            System.out.println("error in readDateBase()" + e.getMessage());
            System.out.println(e.getStackTrace());
        }
    }

    public void updateDescription(int id, String desc)
            throws Exception {
        try {
            // This will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.jdbc.Driver");
            // Setup the connection with the DB


            connection = DriverManager.getConnection("jdbc:mysql://localhost/college?" +
                    "user=&password=&useSSL=false");


            // Statements allow to issue SQL queries to the database
            statement = connection.createStatement();

            // Result set get the result of the SQL query
            resultSet = statement.executeQuery("select * from college.courses;");

            writeResultSet(resultSet);

            // PreparedStatements can use variables and are more efficient
            preparedStatement = connection
                    .prepareStatement("update college.courses set description = ? where id = ? ");

            // Parameters start with 1
            preparedStatement.setString(1, desc);
            preparedStatement.setInt(2, id);
            preparedStatement.executeUpdate();

        } catch (Exception e) {
            throw e;
        } finally {
            close();
        }
    }

//    public void readDataBase(String course_name, String desc, int credits, String department)
//            throws Exception {
//        try {
//            // This will load the MySQL driver, each DB has its own driver
//            Class.forName("com.mysql.jdbc.Driver");
//            // Setup the connection with the DB
//
//
//            connection = DriverManager.getConnection("jdbc:mysql://localhost/college?" +
//                    "user=&password=&useSSL=false");
//
//
//            // Statements allow to issue SQL queries to the database
//            statement = connection.createStatement();
//
//            // Result set get the result of the SQL query
//            resultSet = statement.executeQuery("select * from college.courses;");
//
//            writeResultSet(resultSet);
//
//            // PreparedStatements can use variables and are more efficient
//            preparedStatement = connection
//                    .prepareStatement("insert into  college.courses (course_name, description, credits, department) " +
//                            "values (?, ?, ?, ?)");
//            // Parameters start with 1
//            preparedStatement.setString(1, course_name);
//            preparedStatement.setString(2, desc);
//            preparedStatement.setInt(3, credits);
//            preparedStatement.setString(4, department);
//            preparedStatement.executeUpdate();
//
//
//            preparedStatement = connection
//                    .prepareStatement("SELECT course_name, description, credits, department from college.courses");
//            resultSet = preparedStatement.executeQuery();
//
//            writeResultSet(resultSet);
//
//
//            // Remove again the insert comment
////            preparedStatement = connection
////                    .prepareStatement("delete from college.courses where course_name = ? ; ");
////            preparedStatement.setString(1, "Database Design");
////            preparedStatement.executeUpdate();
//
//            resultSet = statement.executeQuery("select * from college.courses");
//
//            writeMetaData(resultSet);
//
//        } catch (Exception e) {
//            throw e;
//        } finally {
//            close();
//        }
//
//    }

    private void writeMetaData(ResultSet resultSet) throws SQLException {
        //         Now get some metadata from the database
        // Result set get the result of the SQL query

        System.out.println("The columns in the table are: ");

        System.out.println("Table: " + resultSet.getMetaData().getTableName(1));

        for  (int i = 1; i<= resultSet.getMetaData().getColumnCount(); i++){
            System.out.println("Column " +i  + " "+ resultSet.getMetaData().getColumnName(i));
        }
    }

    private void writeResultSet(ResultSet resultSet) throws SQLException {
        // ResultSet is initially before the first data set
        while (resultSet.next()) {
            // It is possible to get the columns via name
            // also possible to get the columns via the column number
            // which starts at 1
            // e.g. resultSet.getSTring(2);
            String course = resultSet.getString("course_name");
            String description = resultSet.getString("description");
            int credits = resultSet.getInt("credits");
            String department = resultSet.getString("department");
            System.out.println("Course: " + course);
            System.out.println("Description: " + description);
            System.out.println("Credits: " + credits);
            System.out.println("Department: " + department);
            System.out.println("---------------------------------");
            System.out.println("---------------------------------");

        }
    }

    // You need to close the resultSet
    private void close() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }

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