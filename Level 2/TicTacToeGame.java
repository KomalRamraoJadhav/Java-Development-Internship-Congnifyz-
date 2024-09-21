import java.util.*;
public class TicTacToeGame {
    public static void main(String[] args) {
        char[][] playBoard = new char[3][3];
        for(int row =0; row < playBoard.length; row++){
            for (int col=0; col < playBoard[row].length;col++){
                playBoard[row][col] = ' ';
            }
        }
        char player ='X';
        boolean gameOver = false;
        Scanner sc = new Scanner(System.in);

        while(!gameOver){
            printBoard(playBoard);
            System.out.println("Player " + player + " enter:");
            int row = sc.nextInt();
            int col = sc.nextInt();
            System.out.println( );

            if(playBoard[row][col] == ' '){
                playBoard[row][col] = player;
                gameOver = haveWon(playBoard,player);

                if(gameOver){
                    System.out.println("Player "+ player + " won.");
                }else{
                    player = (player =='X')? '0' : 'X';
                }
            }else{
                System.out.println("Invalid Move.Try Again..");
            }
        }
        printBoard(playBoard);

    }

    public static boolean haveWon(char[][] playBoard,char player){
        for(int row =0; row<playBoard.length; row++){
            if(playBoard[row][0] == player && playBoard[row][1] == player && playBoard[row][2]==player){
                return true;
            }
        }
        for(int col =0; col<playBoard[0].length; col++){
            if(playBoard[0][col] == player && playBoard[1][col] == player && playBoard[2][col]==player){
                return true;
            }
        }
        for(int row =0; row < playBoard.length; row++){
            for (int col=0; col < playBoard[row].length;col++){
                if(playBoard[0][0] == player && playBoard[1][1] == player && playBoard[2][2]==player ||
                        playBoard[0][2] == player && playBoard[1][1] == player && playBoard[2][0]==player){
                    return true;
                }
            }

        }
        return false;
    }
    public static void printBoard(char[][] playBoard){
        for(int row =0; row < playBoard.length; row++){
            for (int col=0; col < playBoard[row].length;col++){
                System.out.print(playBoard[row][col] + " | ");
            }
            System.out.println( );
        }
    }
}
