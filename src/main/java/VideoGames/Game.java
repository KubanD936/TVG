package VideoGames;

//This class is used to sort the csv file and for the ArrayList

public class Game  {
    private String Name;

    private String Platform;

    private String Year_of_Release;

    private String Genre;

    //generated constructor using IDE

    public Game(String name, String platform, String year_of_Release, String genre) {
        Name = name;
        Platform = platform;
        Year_of_Release = year_of_Release;
        Genre = genre;
    }
    //Prints out results with " " in between
    @Override
    public String toString() {
        return Name + " - " + Platform + " - " + Year_of_Release + " - " + Genre;
    }
}


