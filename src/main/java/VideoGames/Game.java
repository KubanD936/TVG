package VideoGames;

//This class is used to sort the csv file and for the ArrayList
//Name,Platform,Year_of_Release,Genre,Publisher,NA_Sales,EU_Sales,JP_Sales,Other_Sales,Global_Sales,Critic_Score,Critic_Count,User_Score,User_Count,Developer,Rating
public class Game  {
    private String Name;
    private String Platform;
    private String Year_of_Release;
    private String Genre;
    private String Publisher;

    //generated constructor using , added new index values

    public Game(String name, String platform, String year_of_Release, String genre, String publisher) {

        Name = name;
        Platform = platform;
        Year_of_Release = year_of_Release;
        Genre = genre;
        Publisher = publisher;

    }
    //Prints out results with " " in between
    @Override
    public String toString() {
        return Name + " - " + Platform + " - " + Year_of_Release + " - " + Genre + " - " + Publisher;
    }
}


