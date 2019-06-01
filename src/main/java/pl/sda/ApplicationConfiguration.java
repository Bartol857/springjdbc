package pl.sda;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("pl.sda")
public class ApplicationConfiguration {

    @Bean
    public DriverManagerDataSource dataSource(){
    DriverManagerDataSource ret = new DriverManagerDataSource();
    ret.setDriverClassName("org.h2.Driver");
    ret.setUsername("sa");
    ret.setPassword("");
    ret.setUrl("jdbc:h2:tcp://localhost/~/test");

    return ret;

    }
}
