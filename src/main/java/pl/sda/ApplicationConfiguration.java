package pl.sda;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("pl.sda")
@PropertySource("db.properties")
public class ApplicationConfiguration {

    @Value("${db.driverClassName}")
    private String dbDriverClassName;

    @Value("${db.url}")
    private String dbUrl;

    @Value("${db.username}")
    private String dbUsername;

    @Value("${db.password}")
    private String dbPassword;

    @Bean
    public DriverManagerDataSource dataSource(){
    DriverManagerDataSource ret = new DriverManagerDataSource();
    ret.setDriverClassName(dbDriverClassName);
    ret.setUsername(dbUsername);
    ret.setPassword(dbPassword);
    ret.setUrl(dbUrl);

    return ret;

    }
}
