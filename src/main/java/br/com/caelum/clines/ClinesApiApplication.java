package br.com.caelum.clines;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
@Profile({"dev", "prod"})
public class ClinesApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClinesApiApplication.class, args);
    }

}
