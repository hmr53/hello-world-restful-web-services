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

    @GetMapping(path = "/hello/path-variable-demo-1/{user}")
    public HelloWoldBean pathVariableDemo(@PathVariable String user){
        return new HelloWoldBean(String.format("Hello : %s",user));
    }

    @GetMapping(path = "/hello/path-variable-demo-2/{user}")
    public HelloWoldBean pathVariableDemo2(@PathVariable("user") String user){
        return new HelloWoldBean(String.format("Hello : %s",user));
    }

}
