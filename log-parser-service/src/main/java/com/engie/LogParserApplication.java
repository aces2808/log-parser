package com.engie;

import com.engie.tractebel.log.configuration.LogConfiguration;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@ImportAutoConfiguration(value = LogConfiguration.class)
public class LogParserApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(LogParserApplication.class, args);
    }

    public void run(String... strings) throws Exception {

    }
}
