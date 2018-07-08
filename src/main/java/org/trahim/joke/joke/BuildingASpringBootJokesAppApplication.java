package org.trahim.joke.joke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml")
public class BuildingASpringBootJokesAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(BuildingASpringBootJokesAppApplication.class, args);
    }
}
