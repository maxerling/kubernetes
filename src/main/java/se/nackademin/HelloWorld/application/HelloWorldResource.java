package se.nackademin.HelloWorld.application;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldResource {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello, World!";
    }
}
