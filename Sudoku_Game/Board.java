public class Board{
    int n = 9;
    int m = 9;
    int[][] board = new int[n][m];
    public Board(){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                board[i][j] = 0;
            }
        }
    }

    public int[][] getBoard(){
        return board;
    }
}