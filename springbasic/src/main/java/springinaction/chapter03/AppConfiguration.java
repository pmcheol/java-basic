package springinaction.chapter03;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@PropertySource({"classpath:prop.properties"})
@ComponentScan
@Configuration
public class AppConfiguration {
}
