//Name: Kush Patel
//Date: 11/14/22 
//Assignment: Lab11


import java.util.Scanner;

public class TicTacToe 
{
    Scanner sc = new Scanner(System.in);
    private static char[][] board = new char[3][3];
    public static void main(String[] args) 
    {
        initBoard();
        System.out.println("Let's play tic tac toe. Initial the board ... ");
        displayBoard();
        
        // start your code from here...
        while(win()==false)
        {
            Xmove();
            displayBoard();
            Omove();
            displayBoard();
            if(tie())
            {
               System.out.println("The game resulted in a tie!");
               break;
            }
        }
   }
   
   
   public static void initBoard()
   {
   	// fills up the board with blanks
      for ( int r=0; r<3; r++ )
         for ( int c=0; c<3; c++)
            board[r][c] = ' ';
   }


   public static void displayBoard()
   {
      System.out.println();
      System.out.println("  0  " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
      System.out.println("    ---+---+---");
      System.out.println("  1  " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
      System.out.println("    ---+---+---");
      System.out.println("  2  " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
      System.out.println("     0   1   2 ");
      System.out.println();
   }
   
   // please fill the details of method Xmove...
   public static void Xmove() 
   {
      Scanner sc = new Scanner(System.in);
      int row = 0;
      int column = 0;
      System.out.println("Player 'X', choose your location: (row, column)");
      row = sc.nextInt();
      column = sc.nextInt();
      board[row][column] = 'X';
   }
   
   // please fill the details of method Omove...
   public static void Omove() 
   {
      Scanner sc = new Scanner(System.in);
      int row = 0;
      int column = 0;
      System.out.println("Player 'O', choose your location: (row, column)");
      row = sc.nextInt();
      column = sc.nextInt();
      board[row][column] = 'O';
   }
   
   // please fill the details of method tie...
   public static boolean tie() 
   {
      boolean filled = false;
      for (int r=0; r<3; r++ )
      {
         for (int c=0; c<3; c++)
         {
            if(board[r][c]== ' ')
            {
               filled = false;
            }
            else
            {
               filled = true;
            }
          } 
       } 
      if(win()==false && filled==true)
      {
         return true;
      }
      return false;
   }
   
   
   public static boolean win() 
   {
   
      for ( int c = 0; c < 3; c++) 
      {
         if (board[c][0] == board[c][1] && board[c][1] == board[c][2] && board[c][0] == 'O') 
         {
            System.out.println("player O wins!");
            return true;
         }          
         if (board[c][0] == board[c][1] && board[c][1] == board[c][2] && board[c][0] == 'X') 
         {
            System.out.println("player X wins!");
            return true;
         }    
      }


      
      // check each column
      for ( int c = 0; c < 3; c++) 
      {
         if (board[0][c] == board[1][c] && board[1][c] == board[2][c] && board[0][c] == 'O') 
         {
            System.out.println("player O wins!");
            return true;
         }          
         if (board[0][c] == board[1][c] && board[1][c] == board[2][c] && board[0][c] == 'X') 
         {
            System.out.println("player X wins!");
            return true;
         }    
      }
      
      // check from top left to bottom right
      if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] == 'O') 
      {
         System.out.println("player O wins!");
         return true;
      }          
      if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] == 'X') 
      {
         System.out.println("player X wins!");
         return true;
      } 
      
      
      // check from top right to bottom left
      if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] == 'O') 
      {
         System.out.println("player O wins!");
         return true;
      }          
      if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] == 'X') 
      {
         System.out.println("player X wins!");
         return true;
      }
      
      return false;
      
   }

}