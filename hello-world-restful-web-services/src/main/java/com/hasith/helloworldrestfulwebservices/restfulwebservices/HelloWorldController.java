package com.hasith.helloworldrestfulwebservices.restfulwebservices;

import com.hasith.helloworldrestfulwebservices.restfulwebservices.helloworld.HelloWoldBean;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @GetMapping(path = "/hello-world")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping(path = "hello-world-bean")
    public HelloWoldBean helloWorldBean(){
        return new HelloWoldBean("This is message");
    }

}
