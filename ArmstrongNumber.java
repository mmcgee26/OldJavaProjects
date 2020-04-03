/*
 * Michael McGee
 * 9/28/16
 * Program to take user input and determine whether the number is an Armstrong number or not.
 */
import java.util.Scanner; //importing scanner
import java.util.Random; //importing random 
public class ArmstrongNumber { //opening class
	public static void main(String[] args)  {  //main method open
	  	   int b=0,a,temp,userNumber; //declaring variables
	  	   
	  	   
 Scanner keyIn = new Scanner(System.in); //scanner open
	System.out.print("Enter 1 to use your own number, or 2 for a random number: "); //asking for user imput regarding imput or random number
	  int inputOrRandom = keyIn.nextInt(); //declaring variable for above statement
	  
	  if (inputOrRandom == 1){ 
	System.out.print("Enter a number between 0-9999 to check if it is an armstrong number: ");
	    userNumber = keyIn.nextInt(); //taking user input regarding number
	    temp=userNumber;  
	    while(userNumber > 0 && userNumber < 9999)  
	    {  
	    a=userNumber%10;  
	    userNumber=userNumber/10;  
	    b=b+(a*a*a);  
	    }
	    if (userNumber < 0 || userNumber > 9999) {
	    	System.out.println("The number you entered was not between 0-9999");
	    	System.out.print("Goodbye!");
	    	System.exit(0);
	    }
	    if(temp==b) { //checking armstrong number
	    System.out.println(temp + " is an armstrong number");
	    System.out.print("Goodbye!"); } 
	    else  {
	        System.out.println(temp + " is not an armstrong number");
	        System.out.print("Goodbye!"); //displaying result
	   }  
	  }
	  else { 
		  Random r = new Random(); //opening random
		  int low = 0;
		  int high = 9999;
		  int randomValue = r.nextInt(high-low) + low; //declaring variables
		  temp=randomValue;  
		    while(randomValue>0)  
		    {  
		    a=randomValue%10;  
		    randomValue=randomValue/10;  
		    b=b+(a*a*a);  
		    }  
		    if(temp==b) {  // checking random number
		    	System.out.println(temp+ " is an armstrong number"); 
		    	System.out.print("Goodbye!");
		    }
		    else  {
		        System.out.println(temp + " is not an armstrong number");
		        System.out.print("Goodbye!"); //displaying result
		    }
	  }
	  }
	}
	


