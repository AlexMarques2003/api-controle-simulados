package br.com.sas.api.config;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Getter
@Setter
@ToString
@Configuration
@ConfigurationProperties("spring.datasource")
@SuppressWarnings("unused")
public class DBConfiguration {

    private String driverClassName;
    private String url;
    private String userName;
    private String password;

    @Profile("test")
    @Bean
    public String testDataBaseConnection(){
        System.out.println("DB connection for DEV - H2 - Test");
        System.out.println(driverClassName);
        System.out.println(url);
        return "DB Connection to H2 - Test instance";
    }

    @Profile("prod")
    @Bean
    public String productionDataBaseConnection(){
        System.out.println("DB connection for PROD - Mysql - Production");
        System.out.println(driverClassName);
        System.out.println(url);
        return "DB Connection to Mysql - Prod instance";
    }
}
