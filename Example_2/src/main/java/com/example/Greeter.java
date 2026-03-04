package com.example;

public class Greeter {
    // This method takes a name as input and returns a greeting message.
    public String greet(String name) {
        return "Hello, " + name + "!";
    }

    // This method takes a name as input and returns a loud greeting message.
    public String greetLoud(String name) {
        return "HELLO, " + name.toUpperCase() + "!";
    }

    // This method takes a name as input and returns a formal greeting message.
    public String greetFormal(String name) {
        return "Good day, " + name + ".";
    }
}
