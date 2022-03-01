package VideoGames;

import org.apache.catalina.LifecycleException;

public class App {
    public static void main(String[] args) {
        GameContext.build();

        // Serve on Tomcat server
        try {
            GameContext.getTomcat().start();
        } catch (LifecycleException e) {
            System.err.println("Embedded server failed to start!");
        }
    }
}