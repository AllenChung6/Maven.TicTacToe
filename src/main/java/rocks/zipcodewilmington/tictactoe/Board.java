package rocks.zipcodewilmington.tictactoe;

import java.util.Arrays;

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
        //Traverse board and check if there are Xs in three spots in a row
        for (row = 0; row < 3; row++) {
            for (col = 0; col < 3; col++) { //check if x has three and a row for all rows on board.
                if (board[0][0] == 'X' && (board[0][0] == board[0][1]) && (board[0][1] == board[0][2])) {
                    xSpot++;
                } else if (board[1][0] == 'X' && (board[1][0] == board[1][1]) && (board[1][1] == board[1][2])) {
                    xSpot++;
                } else if (board[2][0] == 'X' && (board[2][0] == board[2][1]) && (board[2][1] == board[2][2])) {
                    xSpot++;
                    ;        //check if x has three and a row for all columns
                } else if (board[0][0] == 'X' && (board[0][0] == board[1][0]) && (board[1][0] == board[2][0])) {
                    xSpot++;
                } else if (board[0][1] == 'X' && (board[0][1] == board[1][1]) && (board[1][1] == board[2][1])) {
                    xSpot++;
                } else if (board[0][2] == 'X' && (board[0][2] == board[1][2]) && (board[1][2] == board[2][2])) {
                    xSpot++;        //Check if x has three and a row for all diagonals
                } else if (board[0][0] == 'X' && (board[0][0] == board[1][1]) && (board[1][1] == board[2][2])) {
                    xSpot++;
                } else if (board[0][2] == 'X' && (board[0][2] == board[1][1]) && (board[1][1] == board[2][0])) {
                    xSpot++;
                }
            }
        }
        return xSpot > 0;
    }


    public Boolean isInFavorOfO() {
        for (row = 0; row < 3; row++) {
            for (col = 0; col < 3; col++) { //check if x has three and a row for all rows on board.
                if (board[0][0] == 'O' && (board[0][0] == board[0][1]) && (board[0][1] == board[0][2])) {
                    oSpot++;
                } else if (board[1][0] == 'O' && (board[1][0] == board[1][1]) && (board[1][1] == board[1][2])) {
                    oSpot++;
                } else if (board[2][0] == 'O' && (board[2][0] == board[2][1]) && (board[2][1] == board[2][2])) {
                    oSpot++;
                    ;        //check if x has three and a row for all columns
                } else if (board[0][0] == 'O' && (board[0][0] == board[1][0]) && (board[1][0] == board[2][0])) {
                    oSpot++;
                } else if (board[0][1] == 'O' && (board[0][1] == board[1][1]) && (board[1][1] == board[2][1])) {
                    oSpot++;
                } else if (board[0][2] == 'O' && (board[0][2] == board[1][2]) && (board[1][2] == board[2][2])) {
                    oSpot++;        //Check if x has three and a row for all diagonals
                } else if (board[0][0] == 'O' && (board[0][0] == board[1][1]) && (board[1][1] == board[2][2])) {
                    oSpot++;
                } else if (board[0][2] == 'O' && (board[0][2] == board[1][1]) && (board[1][1] == board[2][0])) {
                    oSpot++;
                }
            }
        }
        return oSpot > 0;
    }

    public Boolean isTie() {
        /*boolean winnerX = isInFavorOfX();
        boolean winnerO = isInFavorOfO();
        if (!(winnerX && winnerO))  {
            return false;
        }*/

        for (row = 0; row < 3; row++) {
            for (col = 0; col < 3; col++) { //check if x has three and a row for all rows on board.
                if (board[0][0] == 'X' && (board[0][0] == board[0][1]) && (board[0][1] == board[0][2])) {
                    xSpot++;
                } else if (board[1][0] == 'X' && (board[1][0] == board[1][1]) && (board[1][1] == board[1][2])) {
                    xSpot++;
                } else if (board[2][0] == 'X' && (board[2][0] == board[2][1]) && (board[2][1] == board[2][2])) {
                    xSpot++;
                    ;        //check if x has three and a row for all columns
                } else if (board[0][0] == 'X' && (board[0][0] == board[1][0]) && (board[1][0] == board[2][0])) {
                    xSpot++;
                } else if (board[0][1] == 'X' && (board[0][1] == board[1][1]) && (board[1][1] == board[2][1])) {
                    xSpot++;
                } else if (board[0][2] == 'X' && (board[0][2] == board[1][2]) && (board[1][2] == board[2][2])) {
                    xSpot++;        //Check if x has three and a row for all diagonals
                } else if (board[0][0] == 'X' && (board[0][0] == board[1][1]) && (board[1][1] == board[2][2])) {
                    xSpot++;
                } else if (board[0][2] == 'X' && (board[0][2] == board[1][1]) && (board[1][1] == board[2][0])) {
                    xSpot++;
                }
            }
        }




        for (row = 0; row < 3; row++) {
            for (col = 0; col < 3; col++) { //check if x has three and a row for all rows on board.
                if (board[0][0] == 'O' && (board[0][0] == board[0][1]) && (board[0][1] == board[0][2])) {
                    oSpot++;
                } else if (board[1][0] == 'O' && (board[1][0] == board[1][1]) && (board[1][1] == board[1][2])) {
                    oSpot++;
                } else if (board[2][0] == 'O' && (board[2][0] == board[2][1]) && (board[2][1] == board[2][2])) {
                    oSpot++;
                    ;        //check if x has three and a row for all columns
                } else if (board[0][0] == 'O' && (board[0][0] == board[1][0]) && (board[1][0] == board[2][0])) {
                    oSpot++;
                } else if (board[0][1] == 'O' && (board[0][1] == board[1][1]) && (board[1][1] == board[2][1])) {
                    oSpot++;
                } else if (board[0][2] == 'O' && (board[0][2] == board[1][2]) && (board[1][2] == board[2][2])) {
                    oSpot++;        //Check if x has three and a row for all diagonals
                } else if (board[0][0] == 'O' && (board[0][0] == board[1][1]) && (board[1][1] == board[2][2])) {
                    oSpot++;
                } else if (board[0][2] == 'O' && (board[0][2] == board[1][1]) && (board[1][1] == board[2][0])) {
                    oSpot++;
                }
            }
        }

        System.out.println(xSpot);
        System.out.println(oSpot);
        if (xSpot == oSpot) {
            return true;
        }
        return false;
    }

    public String getWinner() {
        String winner = "";
        if (isInFavorOfX()) {
            winner = "X";
        } else if (isInFavorOfO()){
            winner = "O";
        }
        return winner;
    }
    }
