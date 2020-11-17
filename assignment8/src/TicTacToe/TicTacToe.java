package TicTacToe;

import java.util.*;
import java.util.Scanner;


public class TicTacToe {


    public static void main(String[] args) {
        char[][] gameBoard = {
                {'1', '|', '2', '|', '3'},
                {'-', '+', '-', '+', '-'},
                {'4', '|', '5', '|', '6'},
                {'-', '+', '-', '+', '-'},
                {'7', '|', '8', '|', '9'},
        };

        printGameBoard(gameBoard);

        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your placement (1-9): ");
            int playerPos = scan.nextInt();
            placePiece(gameBoard, playerPos, "player");
            printGameBoard(gameBoard);
            checkWinner(gameBoard, 'X');
            Random random = new Random();
            int cpuPos = random.nextInt(9);
            placePiece(gameBoard, cpuPos,"cpu");
            printGameBoard(gameBoard);
            checkWinner(gameBoard,'O');
        }
    }

    public static void printGameBoard(char[][] gameBoard) {
        for(int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[0].length; j++) {
                System.out.print(gameBoard[i][j]);
                if(j == gameBoard[0].length - 1){
                    System.out.println();
                }
            }
        }
    }

    public static void placePiece(char[][] gameBoard, int pos, String user) {

        char symbol = ' ';

        if (user.equals("player")) {
            symbol = 'X';
        } else if (user.equals("cpu")) {
            symbol = 'O';
        }

        a:for (int row = 0; row < gameBoard.length; row++) {
            for (int column = 0; column < gameBoard[0].length; column++) {
                if ((char) (pos + 48) == gameBoard[row][column]) {
                    gameBoard[row][column] = symbol;
                    break a;
                }
            }
        }

    }

    public static boolean checkWinner(char[][] gameBoard, char symbol) {
        String s3 = "" + symbol + symbol + symbol;
        String sum1,sum2,sum3,sum4,sum5,sum6,sum7,sum8;
        //row
        sum1 = "" + gameBoard[0][0] + gameBoard[0][2] + gameBoard[0][4];
        sum2 = "" + gameBoard[2][0] + gameBoard[2][2] + gameBoard[2][4];
        sum3 = "" + gameBoard[4][0] + gameBoard[4][2] + gameBoard[4][4];
        //column
        sum4 = "" + gameBoard[0][0] + gameBoard[2][0] + gameBoard[4][0];
        sum5 = "" + gameBoard[0][2] + gameBoard[2][2] + gameBoard[4][2];
        sum6 = "" + gameBoard[0][4] + gameBoard[2][4] + gameBoard[4][4];
        //diagonal
        sum7 = "" + gameBoard[0][0] + gameBoard[2][2] + gameBoard[4][4];
        sum8 = "" + gameBoard[0][4] + gameBoard[2][2] + gameBoard[4][0];

        if(sum1.equals(s3) || sum2.equals(s3) || sum3.equals(s3) || sum4.equals(s3) || sum5.equals(s3)
                || sum6.equals(s3) || sum7.equals(s3) || sum8.equals(s3)){
            if('X' == symbol){
                System.out.println("Congratulations you won!");
            }else if('O' == symbol){
                System.out.println("CPU wins! Sorry:(");
            }
            return false;
        }else if(gameBoard[0][0]!='1' && gameBoard[0][2]!='2' && gameBoard[0][4]!='3' && gameBoard[2][0]!='4' && gameBoard[2][2]!='5'
        && gameBoard[2][4]!='6' && gameBoard[4][0]!='7' && gameBoard[4][2]!='8' && gameBoard[4][4]!='9'){
            System.out.println("CAT!");
            return false;
        }else{
            return true;
        }
    }

}

