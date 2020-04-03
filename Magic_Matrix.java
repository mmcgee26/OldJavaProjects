/*
 * Michael McGee
 * 11/15/16
 * Magic square program will generate matrices until one satisfies the requirements to be a magic square
 * Pseudocode:
 * Program opens, explains what a magic square is
 * User starts program, array is created.
 * the method "fillMatrix" puts unique random ints into the matrix
 * array goes through all 7 methods to check all the requirements of a magic square.
 * each and every array is displayed along with the sum of rows, sum of columns, and sum of diagonols as well as a count of arrays created
 * once a magic square is created, the loop stops, and the program asks the user if they would like to go again.
 * if not, the program displays "goodbye" and exits.
 */

import java.util.Random; //importing stuff
import java.util.Scanner;
public class Magic_Matrix
    {
		public static int sumRows(int[][] a){
			if((a[0][0] + a[0][1] + a[0][2])==15 && (a[1][0] + a[1][1] + a[1][2])==15 && (a[2][0] + a[2][1] + a[2][2])==15) //finding sum of rows
				return 15;
			else return -1;
		}
		public static int sumColumns(int[][] a){
		if((a[0][0] + a[1][0] + a[2][0])==15 && (a[0][1] + a[1][1] + a[2][1])==15 && (a[0][2] + a[1][2] + a[2][2])==15) //finding sum of comments
			return 15;
		else return -1;
		}
		public static int sumDiaganols(int[][] a){
			if((a[0][0] + a[1][1] + a[2][2]) == 15 && (a[2][0] + a[1][1] + a[0][2] == 15)) //finding sum of diagonals
				return 15;
			else return -1;
		}
		public static void displayMagicSquare(int[][] a){ //displaying magic square
			for(int i=0;i<a.length;i++)
            {
                for(int j=0;j<a.length;j++)
                    {
                        System.out.print(a[i][j]+ "\t");
                    }
             System.out.println();
            }
			
		}
		public static void fillMatrix(int[][] a){ //filling matrix with unique random ints
			Random rand = new Random();
			for (int i = 0; i < a.length; i++){
				for(int k = 0; k < a[i].length; k ++){ 
					int num = rand.nextInt(9)+1;
					do{
					 num = rand.nextInt(9)+1;
					}while(isUnique(a, num) == false);
						a[i][k] = num;
					
				}
            	      }
		}
            	
		public static boolean isUnique(int[][] a, int targetValue) { //checking if values are unique
			for(int i = 0; i < a.length; i++)
				for(int j = 0; j < a[0].length; j++)
					if(a[i][j] == targetValue) return false;
			return true;
			
		}
			
		
		public static boolean isMagicSquare(int[][] a){ //checking if matrix is magic square
			if(sumRows(a) == 15 && sumColumns(a) == 15 && sumDiaganols(a) == 15)
				return true;
			else return false;
		}
        public static void main(String args[])
        {
        System.out.print("A Magic Square is a matrix in which all rows, \ncolumns, and diagonals, when summing its integer elements, \nare equal. Enter 1 to begin the search!");
       
            Scanner keyIn = new Scanner(System.in); //declaring variables
            Random rand = new Random();
            int userChoice = keyIn.nextInt();
            while (userChoice == 1){
            
            System.out.println("\nCreating a Matrix of Size 3x3: ");
            int n = 3;

 
            int array[][]=new int[n][n]; // Creating the Matrix
            fillMatrix(array); //filling matrix
            
            /* Printing the Magic matrix */
            System.out.println("The Matrix of size "+n+"x"+n+" is:");
            
            	displayMagicSquare(array);
            	System.out.println("Sum of Rows: " + sumRows(array));
            	System.out.println("Sum of Columns: " + sumColumns(array));
            	System.out.println("Sum of Diagonals: " + sumDiaganols(array));
            	System.out.println("Is Magic Square? = " + isMagicSquare(array)); //displaying first matrix
            	int count = 1;
                

            while(isMagicSquare(array) == false){ //checking if true or false, then displaying until true
            array=new int[n][n];
            fillMatrix(array);
            displayMagicSquare(array);
        	System.out.println("Sum of Rows: " + sumRows(array));
        	System.out.println("Sum of Columns: " + sumColumns(array));
        	System.out.println("Sum of Diagonals: " + sumDiaganols(array));
        	System.out.println("Is Magic Square? = " + isMagicSquare(array));
        	count++;
        	System.out.println("Matrices Created: "+ count);
            }
            
           System.out.println();
            System.out.print("Would you like to go again? Enter 1 if you would like to play again: "); //asking to play again
            
            userChoice = keyIn.nextInt();
            if(userChoice != 1){
            	System.out.println("Thanks for playing! Goodbye!"); //goodbye message
            }
        }
         }
        }
    