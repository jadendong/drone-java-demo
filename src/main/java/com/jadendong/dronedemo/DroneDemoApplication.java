package com.jadendong.dronedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jaden
 */
@SpringBootApplication
@RestController
public class DroneDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DroneDemoApplication.class, args);
    }

    @RequestMapping("/")
    public String helloWorld() {
        return "hello World !";
    }

}
