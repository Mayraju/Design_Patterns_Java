public class GameContext{
    GameStrategy gameStrategy;

    public void setGameStrategy(GameStrategy gameStrategy){
        this.gameStrategy = gameStrategy;
    }

    public void startGame(){
        gameStrategy.playGame();
    }
}