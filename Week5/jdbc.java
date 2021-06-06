import java.sql.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        addCar("MB","w211","2011-02-02",2.4,"white",123.4);
        showTableCar();
        showTableCustomers();
        deleteCar(1);


    }

    private static Connection getConnection() throws SQLException {
        final String username = "Erzhan2";
        final String password = "fixer";
        final String url = "jdbc:mysql://localhost:3306/mysql";
        Connection connection = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url,username,password);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }

    private static void addCar( String mark, String model, String yearOfDate, double capasity, String color, double price) throws SQLException {
        Connection connection = getConnection();

        if(connection != null) {
            PreparedStatement preparedStatement = null;
            try {
                preparedStatement = connection.prepareStatement("insert into Cars (mark, model, yearOfDate, capasity, color, price) values(?, ?, ?, ?, ?, ?)");
                preparedStatement.setString(1, mark);
                preparedStatement.setString(2, model);
                preparedStatement.setString(3, yearOfDate);
                preparedStatement.setDouble(4, capasity);
                preparedStatement.setString(5, color);
                preparedStatement.setDouble(6, price);

                int car = preparedStatement.executeUpdate();
                System.out.println(car + " new car were added");
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }
    private static void showTableCar() throws SQLException {

        Connection connection = getConnection();
        Statement statement = connection.createStatement();
        String myRSet = "SELECT * FROM cars";
        ResultSet resultSet = statement.executeQuery(myRSet);
        if(resultSet != null) {

            ResultSetMetaData metadata = resultSet.getMetaData();
            int columnCount = metadata.getColumnCount();

            System.out.println("\n");

            while (resultSet.next()) {
                for (int i = 1; i <= columnCount; i++)
                    System.out.print(resultSet.getString(i) + "\t");
                System.out.println();
            }
        }
        resultSet.close();
        statement.close();
        connection.close();

    }

    private static void showTableCustomers() throws SQLException {

        Connection connection = getConnection();
        Statement statement = connection.createStatement();
        String myRSet = "SELECT * FROM customers";
        ResultSet result = statement.executeQuery(myRSet);
        if(result != null) {

            ResultSetMetaData metadata = result.getMetaData();
            int columnCount = metadata.getColumnCount();

            System.out.println("\n");

            while (result.next()) {
                for (int i = 1; i <= columnCount; i++)
                    System.out.print(result.getString(i) + "\t");
                System.out.println();
            }
        }
        result.close();
        statement.close();
        connection.close();

    }


    private static void deleteCar(int id) throws SQLException {
        Connection connection = getConnection();

        if(connection != null) {
            PreparedStatement preparedStatement = null;
            try {
                preparedStatement = connection.prepareStatement("DELETE FROM cars WHERE id = ?;");
                preparedStatement.setInt(1, id);
                int car = preparedStatement.executeUpdate();
                System.out.println(car + " car deleted");
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}



