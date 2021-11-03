package springinaction.chapter01;

import org.springframework.jdbc.core.JdbcOperations;

public class UnitFinder {
    public JdbcOperations jdbcOperations;

    public UnitFinder(JdbcOperations jdbcOperations) {
        this.jdbcOperations = jdbcOperations;
    }

    public Unit getUser(long id) {
        return jdbcOperations.queryForObject("select * from user where id=?",
                (rs, rowNum) -> new Unit(rs.getLong(1), rs.getString(2)), id);
    }
}
