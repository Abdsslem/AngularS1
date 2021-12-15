package com.example.prof;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.example.prof.entities.Prof;

@SpringBootApplication
public class ProfSpecialiteApplication implements CommandLineRunner {
   
	@Autowired
    private RepositoryRestConfiguration repositoryRestConfiguration;
    
	public static void main(String[] args) {
		SpringApplication.run(ProfSpecialiteApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
	repositoryRestConfiguration.exposeIdsFor(Prof.class);
	}
}
