

public class Game{
    List<Move> moves;
    GameState gameState;


    public Game LoadGame(String gameLevel){

        // Load the game from the file
        if(gameLevel == "Easy"){
            return new EasyBoard();
        }
        else if(gameLevel == "Medium"){
            return new Board("Medium");
        }
        else if(gameLevel == "Hard"){
            return new Board("Hard");
        }
        else{
            return throw new IllegalArgumentException("Invalid game level");
        }

    }
}