package com.gocik.careers.app;

import com.gocik.careers.controller.ApplicationController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//@EnableJpaRepositories(basePackages = "netcredit.repository")
//@EntityScan("netcredit.*")
@EnableTransactionManagement
@SpringBootApplication
@ComponentScan(basePackageClasses = ApplicationController.class)
public class Application {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);

        System.out.println("HERE::");

    }

}
