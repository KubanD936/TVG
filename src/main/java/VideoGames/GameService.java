package VideoGames;

public class GameService {
    private GameRepository gameRepository;

    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public String searchByName(String searchQuery) {
        for (Game game : gameRepository.getGames()) {
            if (game.getName().equalsIgnoreCase(searchQuery))
                return game.getName();
        }
        return null;
    }

    public void saveGame(Game game) {
        gameRepository.save(game);
    }
}
