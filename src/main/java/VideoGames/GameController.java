package VideoGames;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
//DefaultServlet
public class GameController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String result = GameContext.getGameService().searchByName(name);
        resp.getWriter().println(result);
        String HTMLForm = "<HTML>\n" +
                "<Head>\n" +
                "<Title> Search Games\n" +
                "    <Title>\n" +
                "    <Head>\n" +
                "    <h1>Game Search<h1>\n" +
                "    <form action = 'game' method='get'>\n" +
                "    <input type ='name' name = 'searchName'\n" +
                "    <input type ='submit' value = 'Search'>\n" +
                "    \n" +
                "    <a href ='games'> See Full Games<a>\n" +
                "    <form>\n" +
                "    <Body>\n" +
                "    <Html>\n";
        resp.getWriter().println(HTMLForm);
        //if results return null in case file is not found
        if (result == null) {
            resp.getStatus();
            resp.getWriter().println("File Not Found");
            return;
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter(("name"));
        String platform = req.getParameter("platform");
        String year_of_release = req.getParameter("year_of_release");
        String genre = req.getParameter("genre");
        String publisher = req.getParameter("publisher");
        String na_sales = req.getParameter("na_sales");
        String eu_sales = req.getParameter("eu_sales");
        String jp_sales = req.getParameter("jp_sales");
        String other_sales = req.getParameter("other_sales");
        String global_sales = req.getParameter("global_sales");
        String critic_score = req.getParameter("critic_score");
        String critic_count = req.getParameter("critic_count");
        String user_score = req.getParameter("user_score");
        String user_count = req.getParameter("user_count");
        String developer = req.getParameter("developer");
        String rating = req.getParameter("rating");

        GameContext.getGameService().saveGame(new Game(name, platform, year_of_release, genre, publisher, na_sales , eu_sales ,
                jp_sales, other_sales, global_sales, critic_score, critic_count, user_score, user_count, developer, rating));
    }
}