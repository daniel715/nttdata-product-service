package com.nttdata.proyecto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class Proyecto1Application {

    public static void main(String[] args) {
        SpringApplication.run(Proyecto1Application.class, args);
    }

}
