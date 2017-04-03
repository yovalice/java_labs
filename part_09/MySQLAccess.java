package part_09;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLAccess {
    private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    public static void main(String[] args) {
        MySQLAccess example = new MySQLAccess();
        try {
            example.readDataBase();
        } catch (Exception e){
            System.out.println("error in readDateBase()" + e.getMessage());
            System.out.println(e.getStackTrace());
        }
    }

    public void readDataBase() throws Exception {
        try {
            // This will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.jdbc.Driver");
            // Setup the connection with the DB
            connect = DriverManager
                    .getConnection("jdbc:mysql://localhost/college?"
                            + "user=<ryan>&password=<password>");


            // Statements allow to issue SQL queries to the database
            statement = connect.createStatement();
            // Result set get the result of the SQL query
            resultSet = statement
                    .executeQuery("select * from college.courses;");

            writeResultSet(resultSet);

            // PreparedStatements can use variables and are more efficient
            preparedStatement = connect
                    .prepareStatement("insert into  college.courses (course_name, description, credits, department) " +
                            "values (?, ?, ?, ?)");
            // Parameters start with 1
            preparedStatement.setString(1, "Database Design");
            preparedStatement.setString(2, "Introduction to Databases using MySQL");
            preparedStatement.setInt(3, 3);
            preparedStatement.setString(4, "Computer Science");
            preparedStatement.executeUpdate();


            preparedStatement = connect
                    .prepareStatement("SELECT course_name, description, credits, department  from college.courses");
            resultSet = preparedStatement.executeQuery();
            writeResultSet(resultSet);

            // Remove again the insert comment
            preparedStatement = connect
                    .prepareStatement("delete from college.courses where course_name = ? ; ");
            preparedStatement.setString(1, "Database Design");
            preparedStatement.executeUpdate();

            resultSet = statement
                    .executeQuery("select * from college.courses");
            writeMetaData(resultSet);



        } catch (Exception e) {
            throw e;
        } finally {
            close();
        }

    }

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

            if (connect != null) {
                connect.close();
            }
        } catch (Exception e) {

        }
    }

}