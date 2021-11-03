package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import static jdbc.StatementSelector.MysqlDriverConnector;

public class ResultSetUpdater {
    public static void main(String[] args) throws Exception {
        Connection connect = null;
        try {
            connect = MysqlDriverConnector.connect();
            Statement statement = connect.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            ResultSet resultSet = statement.executeQuery("select id, name from user");
            while (resultSet.next()) {
                resultSet.updateString(2, "new-name");
                resultSet.updateRow();
                System.out.println("resultSet.getString(2) = " + resultSet.getString(2));
            }

        } catch (Exception e) {

        } finally {
            if (connect != null)
                connect.close();
        }
    }
}
