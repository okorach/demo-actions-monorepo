package com.acme;

public class App {
    public String getGreeting() {
        return "Hello worldly.";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
