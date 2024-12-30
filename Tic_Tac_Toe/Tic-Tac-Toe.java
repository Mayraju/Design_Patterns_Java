public class Tic_Tac_Toe {
    Deque<Player> players;
    Board gameBoard;

    public void initializeGame() {
        players = new LinkedList<>();
        PlayingPieceX crossPiece = new PlayingPieceX();
        Player player1 = new Player("Player 1", crossPiece);

        PlayingPieceO circlePiece = new PlayingPieceO();
        Player player2 = new Player("Player 2", circlePiece);
        players.add(player1);
        players.add(player2);
        gameBoard = new Board(3);
    }

    public String startGame(){
        boolean noWinner = true;
        while(noWinner){
            Player currentPlayer = players.removeFirst();
            gameBoard.printBoard();
            List<Pair<Integer, Integer>> freeSpaces =gameBoard.getFreCells();
            if(freeSpaces.isEmpty()){
                noWinner = false;
                continue;
            }
            System.out.print("Player: "+ currentPlayer.name+ "Enter row,column: ");
            Scanner inputScanner = new Scanner(System.in);
            String s = inputScanner.nextLine();
            String[] values = s.split(",");
            int inpurRow = Integer.parseInt(values[0]);
            int inputColumn = Integer.parseInt(values[1]);

            boolean pieceAddedSuccessfully = gameBoard.addPiece(inpurRow, inputColumn, currentPlayer.playingPiece); 
            if(!pieceAddedSuccessfully){
                System.out.println("Invalid move, try again");
                players.addFirst(currentPlayer);
                continue;
            }
            players.addLast(currentPlayer);
            boolean winner = isThereWinner(inpurRow, inputColumn, currentPlayer.playingPiece.pieceType); 
            if(winner){
                return currentPlayer.name;
            } 
        }
        return "Tie";
    }

    public boolean isThereWinner(int row,int col,PieceType pieceType){
        boolean rowMatch = true;
        boolean colMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;
        for(int i = 0; i<gameBoard.size; i++){
            if(gameBoard.board[row][i] == null ||gameBoard.board[row][i].pieceType != pieceType){
                rowMatch = false;
            }
            if( gameBoard.board[i][col]==null ||gameBoard.board[i][col].pieceType != pieceType){
                colMatch = false;
            }
        }

        for(int i=0,j=0;i<gameBoard.size;i++,j++){
            if(gameBoard.board[i][j] == null ||gameBoard.board[i][j].pieceType != pieceType){
                diagonalMatch = false;
            }
        }
        for(int i=0,j=gameBoard.size-1;i<gameBoard.size;i++,j--){
            if(gameBoard.board[i][j] == null ||gameBoard.board[i][j].pieceType != pieceType){
                antiDiagonalMatch = false;
            }
        }

        return rowMatch || colMatch || diagonalMatch || antiDiagonalMatch;
    }
}