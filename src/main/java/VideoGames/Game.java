package VideoGames;

public class Game {
    //name, platform, year_of_release, genre, publisher,
    // na_sales , eu_sales , jp_sales, other_sales, global_sales, critic_score,
    // critic_count, user_score, user_count, developer, rating
    private String name;
    private String platform;
    private String year_of_release;
    private String genre;
    private String publisher;
    private String na_sales;
    private String eu_sales;
    private String jp_sales;
    private String other_sales;
    private String global_sales;
    private String critic_score;
    private String critic_count;
    private String user_score;
    private String user_count;
    private String developer;
    private String rating;

    public Game() {

    }

    public Game(String name, String platform, String year_of_release, String genre, String publisher, String na_sales, String eu_sales, String jp_sales, String other_sales, String global_sales, String critic_score, String critic_count, String user_score, String user_count, String developer, String rating) {
        this.name = name;
        this.platform = platform;
        this.year_of_release = year_of_release;
        this.genre = genre;
        this.publisher = publisher;
        this.na_sales = na_sales;
        this.eu_sales = eu_sales;
        this.jp_sales = jp_sales;
        this.other_sales = other_sales;
        this.global_sales = global_sales;
        this.critic_score = critic_score;
        this.critic_count = critic_count;
        this.user_score = user_score;
        this.user_count = user_count;
        this.developer = developer;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getYear_of_release() {
        return year_of_release;
    }

    public void setYear_of_release(String year_of_release) {
        this.year_of_release = year_of_release;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getNa_sales() {
        return na_sales;
    }

    public void setNa_sales(String na_sales) {
        this.na_sales = na_sales;
    }

    public String getEu_sales() {
        return eu_sales;
    }

    public void setEu_sales(String eu_sales) {
        this.eu_sales = eu_sales;
    }

    public String getJp_sales() {
        return jp_sales;
    }

    public void setJp_sales(String jp_sales) {
        this.jp_sales = jp_sales;
    }

    public String getOther_sales() {
        return other_sales;
    }

    public void setOther_sales(String other_sales) {
        this.other_sales = other_sales;
    }

    public String getGlobal_sales() {
        return global_sales;
    }

    public void setGlobal_sales(String global_sales) {
        this.global_sales = global_sales;
    }

    public String getCritic_score() {
        return critic_score;
    }

    public void setCritic_score(String critic_score) {
        this.critic_score = critic_score;
    }

    public String getCritic_count() {
        return critic_count;
    }

    public void setCritic_count(String critic_count) {
        this.critic_count = critic_count;
    }

    public String getUser_score() {
        return user_score;
    }

    public void setUser_score(String user_score) {
        this.user_score = user_score;
    }

    public String getUser_count() {
        return user_count;
    }

    public void setUser_count(String user_count) {
        this.user_count = user_count;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Game{" +
                "name='" + name + '\'' +
                ", platform='" + platform + '\'' +
                ", year_of_release='" + year_of_release + '\'' +
                ", genre='" + genre + '\'' +
                ", publisher='" + publisher + '\'' +
                ", na_sales='" + na_sales + '\'' +
                ", eu_sales='" + eu_sales + '\'' +
                ", jp_sales='" + jp_sales + '\'' +
                ", other_sales='" + other_sales + '\'' +
                ", global_sales='" + global_sales + '\'' +
                ", critic_score='" + critic_score + '\'' +
                ", critic_count='" + critic_count + '\'' +
                ", user_score='" + user_score + '\'' +
                ", user_count='" + user_count + '\'' +
                ", developer='" + developer + '\'' +
                ", rating='" + rating + '\'' +
                '}';
    }
}