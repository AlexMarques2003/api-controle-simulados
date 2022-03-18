package br.com.sas.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class ApiControleSimuladosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiControleSimuladosApplication.class, args);
	}

}
