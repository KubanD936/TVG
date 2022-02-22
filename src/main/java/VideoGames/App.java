package VideoGames;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.util.ArrayList;
import java.util.Objects;

public class App {
    public static void main(String[] args) throws IOException {
        //Reads the csv
        InputStreamReader reader =  new InputStreamReader(Objects.requireNonNull(App.class.getResourceAsStream("/Video_Games.csv")));
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\K\\GitHub\\TVG\\src\\main\\resources\\Video_Games.csv"));

        ArrayList<Game> games = new ArrayList<>();
        //While loop used to read line while not equal to null
        String currentLine;
        while ((currentLine = br.readLine()) != null)
        {
            //Split csv using ","
            String[] detailed = currentLine.split(",");
            String name = detailed[0];
            String platform = detailed[1];
            String year_of_Release = detailed[2];
            String genre = detailed[3];
            String publisher = detailed[4];

            games.add(new Game(name, platform, year_of_Release, genre, publisher));
        }
        //Print out results
        System.out.println(games);
    }
}
