package springinaction.chapter01;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@EnableAspectJAutoProxy
@Configuration
public class SpringInActionConfiguration {

    @Bean
    public Quest quest() {
        return new DragonQuest();
    }

    @Bean
    public Knight knight() {
        return new DragonSlayer(quest());
    }

    @Bean
    public Minstrel minstrel() {
        return new Minstrel(System.out);
    }

    @Bean
    public DataSource dataSource() {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setURL("jdbc:mysql://127.0.0.1:3306/jbasic");
        dataSource.setUser("root");
        dataSource.setPassword("root");
        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate() {
        return new JdbcTemplate(dataSource());
    }

    @Bean
    public UnitFinder unitFinder() {
        return new UnitFinder(jdbcTemplate());
    }
}
