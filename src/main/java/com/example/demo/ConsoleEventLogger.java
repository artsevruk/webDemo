package com.example.demo;

public class ConsoleEventLogger implements EventLogger{

    public void logEvent(String msg)
    {
        System.out.printf(msg);
    }
}
