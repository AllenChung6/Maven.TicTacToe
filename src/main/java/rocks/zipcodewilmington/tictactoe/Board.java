package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {

    Character[][] board;

    int row = 0;
    int col = 0;
    int xSpot;
    int oSpot;

    public Board(Character[][] matrix) {
        //Initialize board (array)
     this.board = matrix;

    }

    public Boolean isInFavorOfX() {
        //Traverse board and check if X is in spot
        for (row = 0; row < board.length; row++) {
            for (col = 0; col < board.length; col++) {
                if (board[row][col].equals('X')) {
                    xSpot++;
                } else if ((board[row][col].equals('Y'))) {
                    oSpot++;
                }
            }
        }
        if (xSpot > oSpot) {
            return true;
        }
        System.out.println(board);
        return false;
    }


    public Boolean isInFavorOfO() {
        for (row = 0; row < board.length; row++) {
            for (col = 0; col < board.length; col++) {
                if (board[1][0] == 'X' && (board[1][0] == board[1][1]) &&  (board[1][1] == board[1][2])) {
                   return true;
                } else if (board[2][0] == 'X' && (board[2][0] == board[2][1]) &&  (board[2][1] == board[2][2])) {
                    return true;
                } else if (board[3][0] == 'X' && (board[3][0] == board[3][1]) &&  (board[3][1] == board[3][2])) {
                    return true;
                }  else if (board[1][0] == 'X' && (board[1][0] == board[1][1]) &&  (board[1][1] == board[1][2])){
                    }
            }
        }
        //(board[1][0] == 'X' && (board[1][0] == board[1][1]) &&  (board[1][1] == board[1][2]))
        /*for (row = 0; row < board.length; row++) {
            for (col = 0; col < board.length; col++) {
                if (board[row][col].equals('X')) {
                    xSpot++;
                } else if ((board[row][col].equals('Y'))) {
                    oSpot++;
                }
            }
        }
        if (xSpot < oSpot) {
            return true;
        }
        System.out.println(board);
        return false;*/
        return false;
    }

    public Boolean isTie() {
        return null;
    }

    public String getWinner() {

    String winner= "The winner is";
        return winner;
    }
}
