package com.hasith.helloworldrestfulwebservices.restfulwebservices.helloworld;

public class HelloWoldBean {
    private String message;

    public HelloWoldBean() {
    }

    public HelloWoldBean(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
