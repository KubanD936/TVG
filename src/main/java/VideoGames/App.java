package VideoGames;

import org.apache.catalina.LifecycleException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.util.ArrayList;
import java.util.Objects;

public class App {
    public static void main(String[] args) {
        Game.build();

        // Serve on Tomcat server
        try {
            Game.getTomcat().start();
        } catch (LifecycleException e) {
            System.err.println("Embedded server failed to start!");
        }
    }
}