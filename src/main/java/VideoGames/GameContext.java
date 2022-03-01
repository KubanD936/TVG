package VideoGames;

import org.apache.catalina.startup.Tomcat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//This class is used to sort the csv file and for the ArrayList
//Name,Platform,Year_of_Release,Genre,Publisher,NA_Sales,EU_Sales,JP_Sales,Other_Sales,Global_Sales,Critic_Score,Critic_Count,User_Score,User_Count,Developer,Rating
public class GameContext {
    private static final String gameCSVFile = "Video_Games.csv";
    private static GameRepository gameRepository;
    private static GameService gameService;
    private static Tomcat server;
    private static GameController gameController;
    private static Connection connection;

    public static void build() {
        gameRepository = new GameRepository(gameCSVFile);
        gameService = new GameService(gameRepository);
        gameController = new GameController();
        server = new Tomcat();
        server.getConnector();
        server.addContext("", null);
        server.addServlet("", "gameServlet", gameController).addMapping("/games");
        try {
            connection = DriverManager.getConnection("jdbc:h2:mem:", "chinook", "chinook");
            connection.createStatement().execute("CREATE TABLE GAMES(name int primary key, platform varchar, year_of_release varchar, genre varchar, publisher varchar, na_sales varchar, eu_sales varchar, jp_sales varchar, other_sales varchar, global_sales varchar, critic_score varchar, critic_count varchar, user_score varchar, user_count varchar, developer varchar, rating varchar)");
            gameRepository.setConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static GameRepository getGameRepository() {
        return gameRepository;
    }

    public static GameService getGameService() {
        return gameService;
    }

    public static Tomcat getTomcat() {
        return server;
    }
}


