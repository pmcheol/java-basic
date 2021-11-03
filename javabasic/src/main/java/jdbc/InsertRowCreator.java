package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRowCreator {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        try {
            connection = StatementSelector.MysqlDriverConnector.connect();
            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            ResultSet resultSet = statement.executeQuery("select * from user");

            resultSet.moveToInsertRow();
            resultSet.updateInt(1, 21);
            resultSet.updateString(2, "creator");
            resultSet.insertRow();

            resultSet.beforeFirst();
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
}
