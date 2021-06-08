import java.sql.*;
public class JDBC {

    public static void main(String[] args) throws SQLException {
        addCar("MB","w211","2011-02-02",2.4,"white",123.4);
        showTableCar();
        showTableCustomers();
        showTableCarstore();
        updateCustomer("Beka","nazarov@gmail.com");
        deleteCustomer("Nurik");

    }

    private static Connection getConnection() throws SQLException {

        final String username = "Erzhan2";
        final String password = "fixer";
        final String url = "jdbc:mysql://localhost:3306/week4";
        Connection connection=DriverManager.getConnection(url, username, password);;


        try {
            connection  = DriverManager.getConnection(url, username, password);
        } catch (SQLException  e) {
            e.printStackTrace();
        }
        return connection;
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
    private static void showTableCarstore() throws SQLException {

        Connection connection = getConnection();
        Statement statement = connection.createStatement();
        String myRSet = "SELECT * FROM carstore";
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
    private static void deleteCustomer(String name) throws SQLException {
        Connection connection = getConnection();
        if (connection != null) {
            PreparedStatement preparedStatement = null;
            try {
                preparedStatement = connection.prepareStatement("DELETE from customers where name =?");
                preparedStatement.setString(1, name);
                int rows = preparedStatement.executeUpdate();
                System.out.println("rows deleted " + rows);
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    if(preparedStatement != null)
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
    private static void addCar( String mark, String model, String yearOfDate, double capasity, String color, double price) throws SQLException {
        Connection connection = getConnection();

        if(connection != null) {
            PreparedStatement preparedStatement = null;
            try {
                preparedStatement = connection.prepareStatement("insert into cars (mark, model, yearOfDate, capasity, color, price) values(?, ?, ?, ?, ?, ?)");
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
    private static void updateCustomer(String name, String email) throws SQLException {
        Connection connection = getConnection();
        if (connection != null) {
            PreparedStatement preparedStatement = null;
            try {
                preparedStatement = connection.prepareStatement("UPDATE customers SET name = ? WHERE email = ?");

                preparedStatement.setString(1, name);
                preparedStatement.setString(2, email);
                int rows = preparedStatement.executeUpdate();
                System.out.println("rows updated " + rows);
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    if(preparedStatement != null)
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