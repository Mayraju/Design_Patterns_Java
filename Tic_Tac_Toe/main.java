public class Main{
    public static void main(String[] args){
        Tic-Tac-Toe game = new Tic-Tac-Toe();
        game.initializeGame();
        System.out.println("Tic-Tac-Toe game is ready to play!");
        System.out.println("game winner is "+game.startGame());        game.start();
    }
}