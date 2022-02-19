package VideoGames;

//This class is used to sort the csv file and for the ArrayList

public class Game  {
    private String Name;

    private String Platform;

    //generated constructor using IDE

    public Game(String name, String platform) {
        Name = name;
        Platform = platform;
    }
    //Prints out results with " " in between
    @Override
    public String toString() {
        return Name + " " + Platform;
    }
}


