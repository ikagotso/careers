package com.gocik.careers.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableJpaRepositories(basePackages = "com.gocik.careers.*")
@EntityScan("com.gocik.careers.*")
@EnableTransactionManagement
@SpringBootApplication
@ComponentScan(basePackages = "com.gocik.careers.*")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println("APP STARTED::");

    }

}
