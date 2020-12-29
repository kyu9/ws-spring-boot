package me.kyu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@Configuration
@ComponentScan
public class Example {

    @RequestMapping("/")
    String home(){
        return "Hello World";
    }

    public static void main(String[] args) {
        //cmd라인에서 넘어온 arg들을 spring-boot application이 사용할 수 있다
        //이렇게 넘겨주면 사용할 수 있다
        SpringApplication.run(Example.class, args);
    }
}
