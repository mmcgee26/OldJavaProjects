/*
 * Michael McGee
 * 12/5/2016
 * Library program will allow user to choose from a list of 5 options. Option 1 will allow user to enter an ID and buy a book based on the input. 
 * option 2 does the same thing but in a binary way. option 3 sorts a random array with the bubble sort algorithm, while option 4 sorts a random array with the selection sort algorithm.
 * option 5 exits the program.
 */
import java.util.*;
public class Library { //opening class
	static Random rand = new Random();//creating random
	static Scanner keyIn = new Scanner(System.in);//creating scanner
	public static void display(String[] array1, int[] array2, double[] array3){ //opening main
		System.out.println("Book ID Book Title                                   Cost\n");
		for(int i = 0; i<array1.length; i++){ //printing information
			System.out.println(array2[i] + "    " + array1[i] + "   $" + array3[i]);
			System.out.println("");
		}
	}
	public static void linearSearch(String[] array1, int[] array2, double[] array3){ //linear search method
		System.out.print("Enter the Book ID you would like to purchase from the list above: ");
		int userID = keyIn.nextInt();
		for(int i = 0; i < array2.length; i++){
			if(userID == array2[i]){
				System.out.println("ID: " + userID + "\nBook Title: " + array1[i] + " \nCost: " + array3[i] + "\n");//printing results
				double cost = array3[i];
				System.out.print("How many would you like to buy? ");
		int userBuy = keyIn.nextInt();
		System.out.println("\nTotal Cost: " + userBuy*cost);
			}		
		}
	}
	
		public static void binarySearch(String[] array1, int[] array2, double[] array3){ //binary search method
	        int low = 0;
	        int high = 9;
	        Scanner keyIn = new Scanner(System.in);
	        int choice;
	        System.out.println("Please enter the book ID you wish to purchase from the list above: ");
	        choice = keyIn.nextInt();
	        System.out.println("How many copies you wish to purchase: ");
	        int amount = keyIn.nextInt();
	        
	        while(high >= low){
	            int middle = (low + high) / 2;
	            if (array2[middle] == choice){
	                    System.out.println("Book ID: " + array2[middle]);
	                    System.out.println("Book Title: " + array1[middle]);
	                    System.out.println("Number of books bought: " + amount);
	                    System.out.println("Total Cost: $" + array3[middle] * amount); //printing results
	                    break;
	            }
	            else if (array2[middle] < choice){
	                low = middle + 1;
	            }
	            else if (array2[middle] > choice){
	                high = middle - 1;
	            }
	        }
	    }
	
		
		public static void bubbleSort()
		{
		int[] array = new int[962]; //if I put anything higher than 962 for the array size, it will not print anything but spaces. Im not sure why, this problem seems to be specificto my computer.
		for(int i = 0; i < array.length; i++){
			array[i] = rand.nextInt(500)+1;
		}
		
		System.out.println("Unsorted Array: ");
		for(int k = 0; k < array.length; k++){
			System.out.print(array[k] + " ");
		}
		System.out.println();
		     int j;
		     boolean flag = true;   // set flag to true to begin first pass
		     int temp;   //holding variable

		     while ( flag )
		     {
		            flag= false;    //set flag to false awaiting a possible swap
		            for( j=0;  j < array.length -1;  j++ )
		            {
		                   if ( array[ j ] < array[j+1] )   // change to > for ascending sort
		                   {
		                           temp = array[ j ];                //swap elements
		                           array[ j ] = array[ j+1 ];
		                           array[ j+1 ] = temp;
		                           flag = true;              //shows a swap occurred  
		                  } 
		            } 
		      } 
		 System.out.println("Sorted Array: ");
		 	for(int i = 0; i < array.length; i++){
				System.out.print(array[i] + " ");
		 	}
		 	System.out.println();
		} 
		public static void selectionSort(){
			int[] array = new int[962]; //if I put anything higher than 962 for the array size, it will not print anything but spaces. Im not sure why, this problem seems to be specificto my computer.
			for(int i = 0; i < array.length; i++){
				array[i] = rand.nextInt(500)+1;
			}
			System.out.println("Unsorted Array: ");
			for(int k = 0; k < array.length; k++){ //printing unsorted array
				System.out.print(array[k] + " ");
			}
			     int i, j, first, temp;  
			     for ( i = array.length - 1; i > 0; i -- )  
			     {
			          first = 0;   //initialize to subscript of first element
			          for(j = 1; j <= i; j ++)   //locate smallest element between positions 1 and i.
			          {
			               if( array[ j ] < array[ first ] )         
			                 first = j;
			          }
			          temp = array[ first ];   //swap smallest found with element in position i.
			          array[ first ] = array[ i ];
			          array[ i ] = temp; 
			      }   
			     System.out.println("Sorted Array: ");
				 	for(int h = 0; h < array.length; h++){ //printing results
						System.out.print(array[h] + " ");
				 	}
				 	System.out.println();
			}
		
	
	public static void main(String[] args){//opening main
		
		int userChoice = 0;
		
		
		String[] bookTitle	=	{"Starting out with Java                    ",	"Java Programming                          ",	"Software Structures                       ", "Design and Analysis of Algorithms         ",	"Computer Graphics                         ",	"Artificial Intelligence: A Modern Approach",	"Probability and Statistics                ",	"Cognitive Science                         ",	"Modern Information Retrieval              ",	"Speech and Language Processing            "};	
		
		int[]	bookID =	{1212,	1211,	1333,	1456,	1567,	1642,	1699,	1755,	1800,	1999};	//bookid array
		
		double[]	bookPrice =	{112.32,	73.25,	54.00,	67.32,	135.00,	173.22,	120.00,	42.25,	32.11, 123.75};	//book price array
		
		display(bookTitle, bookID, bookPrice);
		 System.out.println("Welcome to McGee's Bookstore! What would you like to do? \n1.) Linear Search\n2.) Binary Search\n3.) Bubble Sort\n4.) Selection Sort\n5.) Quit"); //asking for input
		userChoice = keyIn.nextInt();
		if (userChoice == 5){
			System.out.print("Goodbye!"); //goodbye message
			System.exit(0);
		}
		while (userChoice != 5){
		
		if(userChoice == 1){
			linearSearch(bookTitle, bookID, bookPrice); //option 1
		}
		if(userChoice == 2)
			binarySearch(bookTitle, bookID, bookPrice); //option 2
		if(userChoice == 3)
			bubbleSort(); //option 3
		if(userChoice == 4)
			selectionSort(); //option 4
			
		System.out.print("What would you like to do?"); //asking to loop again
		userChoice = keyIn.nextInt();
		if (userChoice == 5){
			System.out.print("Goodbye!"); //goodbye message
			System.exit(0);
		}
	}

}
}//end class
