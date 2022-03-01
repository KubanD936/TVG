package VideoGames;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GameRepository {
    private List<Game> games;
    private Connection connection;

    public GameRepository(String csvFile) {
        games = new ArrayList<>();
        parseGames(loadCSV(csvFile));
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public List<Game> getGames() {
        return games;
    }

    public void save(Game game) {
        try {
            Statement statement = connection.createStatement();
            statement.execute("INSERT INTO GAMES VALUES(" + game.getName() + ", '" + game.getPublisher() + ",'"
                    + game.getYear_of_release() + ",'" + game.getGenre() + ",'"
                    + game.getPublisher() + ",'" + game.getNa_sales() + ",'"
                    + game.getEu_sales() + ",'" + game.getJp_sales() + ",'"
                    + game.getOther_sales() + ",'" + game.getGlobal_sales() + ",'"
                    + game.getCritic_score() + ",'" + game.getCritic_count() + ",'"
                    + game.getUser_score() + ",'" + game.getUser_count() + ",'"
                    + game.getDeveloper() + ",'" + game.getRating());
        } catch (SQLException e) {
            //add text for catch
            System.err.println("Could not execute");
        }
    }

    private BufferedReader loadCSV(String csvFile) {
        if (!csvFile.endsWith(".csv"))
            throw new IllegalArgumentException("Must be a CSV File!");
        // Reading CSV data, add statements for catch
        try {
            URI uri = Objects.requireNonNull(App.class.getClassLoader().getResource(csvFile)).toURI();
            Path filepath = Paths.get(Objects.requireNonNull(uri));
            return Files.newBufferedReader(filepath);
        } catch (URISyntaxException e) {
            System.err.println("could not find filepath");
        } catch (IOException e) {
            System.err.println("Couldn't load file!");
        }
        return null;
    }

    private void parseGames(BufferedReader br) {
        //read using OpenCSV library, don't forget to add text for catch
        CSVParser parser = new CSVParserBuilder().withSeparator(',').build();
        CSVReader reader = new CSVReaderBuilder(br).withCSVParser(parser).withSkipLines(1).build();
        List<String[]> lines = null;
        try {
            lines = reader.readAll();
            reader.close();
        } catch (IOException e) {
            System.err.println("Could not read csv");
        } catch (CsvException e) {
            System.err.println("Reader did not close properly");
        }
    }
}

