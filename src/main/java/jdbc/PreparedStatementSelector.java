package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementSelector {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        PreparedStatement ps = null;

        try {
            connection = StatementSelector.MysqlDriverConnector.connect();
            ps = connection.prepareStatement("select * from user where id > ?");
            ps.setInt(1, 3);

            ResultSet resultSet = ps.executeQuery();
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
