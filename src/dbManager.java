import java.sql.*;

public class dbManager {
    private static final String Username = "admin";
    private static final String Password = "admin";
    private static final String databaseURL = "jdbc:mysql://localhost:3306/mydb";
    public static String user="";
    public static String pass="";
    public static String getUsername(){
        Connection connection = null;
        Statement statement = null;

        try {
            connection = DriverManager.getConnection(databaseURL,Username,Password);
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT username\n" +
                                                             "FROM userdata\n" +
                                                             "WHERE username = \"" + user + "\"");
            if (resultSet.next()) {
                String username = resultSet.getString("username");
                return username;
            } else {
                return null;
            }
        }catch (SQLException sqlEx){
            sqlEx.printStackTrace();
            System.exit(1);
        }finally {
            try {
                statement.close();
                connection.close();
            } catch (Exception e) {
                System.exit(1);
            }
        }
        return null;
    }
    public static String getPassword(){
        Connection connection = null;
        Statement statement = null;

        try {
            connection = DriverManager.getConnection(databaseURL,Username,Password);
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT password FROM userdata WHERE username = \""+user+"\" AND password = \""+pass+"\";");
            if (resultSet.next()) {
                String password = resultSet.getString("password");
                return password;
            } else {
                return null;
            }
        }catch (SQLException sqlEx){
            sqlEx.printStackTrace();
            System.exit(1);
        }finally {
            try {
                statement.close();
                connection.close();
            } catch (Exception e) {
                System.exit(1);
            }
        }
        return null;
    }
    public static void setCredentials(){
        Connection connection = null;
        Statement statement = null;

        try {
            connection = DriverManager.getConnection(databaseURL,Username,Password);
            statement = connection.createStatement();
            String insertUser = "insert into userdata (username, password) values(\""+user+"\", \""+pass+"\");";
            statement.executeUpdate(insertUser);
        }catch (SQLException sqlEx){
            sqlEx.printStackTrace();
            System.exit(1);
        }finally {
            try {
                statement.close();
                connection.close();
            } catch (Exception e) {
                System.exit(1);
            }
        }

    }
    }



