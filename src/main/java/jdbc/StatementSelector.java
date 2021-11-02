package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StatementSelector {
    public static void main(String[] args) throws Exception {
        Connection connection = null;
        try {
            connection = MysqlDriverConnector.connect();
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select id, name from user");
            while (resultSet.next()) {
                System.out.println("resultSet.getString(2) = " + resultSet.getString(2));
            }

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            if (connection != null)
                connection.close();
        }
    }

    public static class MysqlDriverConnector {
        public static Connection connect() throws Exception {
            //build.gradle
            //compile mysql:mysql-connector-java
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            return DriverManager.getConnection("jdbc:mysql://127.0.0.1/jbasic", "root", "root");
        }
    }
}
