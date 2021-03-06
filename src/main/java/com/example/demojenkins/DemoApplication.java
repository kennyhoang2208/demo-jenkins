package com.example.demojenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	/**
     * Hello world api sample
     * @return Hello World! string
     */
    @GetMapping("/hello/{username}")
    public String helloWorld(@PathVariable String username) {
        String name = getUserInfoByUsername(username);
        return "Hello World!!!! " + name;
    }

    private String getUserInfoByUsername(String username) {
        // TODO:: Implement
        return org.springframework.util.StringUtils.capitalize(username);
    }
}
