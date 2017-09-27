package com.example.demo;

public class App {

    private Client client;
    private ConsoleEventLogger eventLogger;

    public App() {
        this.client = new Client();
        this.eventLogger = new ConsoleEventLogger();
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

        App app = new App();


        app.logEvent("Some event for user 1");

    }
}
