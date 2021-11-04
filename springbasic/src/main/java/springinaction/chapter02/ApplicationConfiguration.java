package springinaction.chapter02;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//@ComponentScan
@Import({CompactDiscConfiguration.class, CompactDiscPlayerConfiguration.class})
@Configuration
public class ApplicationConfiguration {
}
