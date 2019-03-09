package com.yt.gittest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

import javax.annotation.Resource;

@SpringBootApplication
@PropertySource(value = {"classpath:prop/jdbc.properties"})
@ImportResource("classpath:/xml/*")
public class GittestApplication {

    public static void main(String[] args) {
        SpringApplication.run(GittestApplication.class, args);
    }

}
