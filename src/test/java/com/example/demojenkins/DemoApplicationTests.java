package com.example.demojenkins;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;


import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.core.Is.is;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
	}

	@LocalServerPort
    private int port;

    @Test
    public void helloWorld() {
        String username = "test";
        String expected = "Hello World!!! Test";

        when()
            .get(String.format("http://localhost:%s/hello/%s", port, username))
            .then()
            .statusCode(is(200))
            .body(containsString(expected));
    }

}
