package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementBatchCommit {
    public static void main(String[] args) throws SQLException {
        Connection connect = null;
        try {
            connect = StatementSelector.MysqlDriverConnector.connect();
            connect.setAutoCommit(false);

            Statement statement = connect.createStatement();
            statement.addBatch("insert into user (name, phone) values ('tester1', '0011')");
            statement.addBatch("insert into user (name, phone) values ('tester2', '0012')");
            statement.addBatch("insert into user (name, phone) values ('tester2', '0013')");

            int[] executeBatchCount = statement.executeBatch();
            for (int count : executeBatchCount) {
                System.out.println("count = " + count);
            }
            connect.commit();

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            if (connect != null)
                connect.close();
        }
    }
}
