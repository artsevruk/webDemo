package com.example.demo;


import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

    private Client client;
    private ConsoleEventLogger eventLogger;

    public App(Client client, ConsoleEventLogger eventLogger) {
        this.client = client;
        this.eventLogger = eventLogger;
    }

    public Client getClient() {
        return client;
    }

    public ConsoleEventLogger getEventLogger() {
        return eventLogger;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setEventLogger(ConsoleEventLogger eventLogger) {
        this.eventLogger = eventLogger;
    }

    private void logEvent(String msg){
        String message = msg.replaceAll(client.getId(),client.getFullName());
        eventLogger.logEvent(message);
    }

    public static void main(String[] args) {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("Spring.xml");

        App app = (App) ctx.getBean("app");
        app.logEvent("Some event for user 1");
        app.logEvent("Some event for user 2");

    }
}
