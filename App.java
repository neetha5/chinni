package com.example.app;

public class App {

    public static void main(String[] args) {
        String name = "CI/CD Pipeline";

        if (name != null && !name.isEmpty()) {
            String message = greet(name);
            System.out.println(message);
        } else {
            System.out.println("Name is empty!");
        }
    }

    public static String greet(String name) {
        return "Hello, " + name + "! Welcome to Maven CI/CD Demo.";
    }
}
