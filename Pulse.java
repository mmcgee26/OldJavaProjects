/* program: Pulse.java
 * Michael McGee
 * 9/11/2016
 * The purpose of this program is to find the training range
 * of a person's pulse based on their user input.
 * The program will take the user's input, and display
 * and output showing their recommended training pulse range.
 */

import java.util.Scanner;

public class Pulse {
	public static void main(String[] args){
		//opens main method, program is now ready to be written.
	
		Scanner keyIn = new Scanner(System.in);
		//opens scanner for use
		
	int age;
	//declaring variable "age" as an integer
	int ageDifference;
	//declaring variable "ageDifference" as an int
	//this is the variable for 220-age
	double lowRange;
	//declaring variable "lowRange" as a double
	double highRange;
	//declaring variable "highRange" as a double
	
System.out.print("Enter a value for your age:");
	age = keyIn.nextInt();
	//asking user for input regarding their age
	
	ageDifference = 220 - age;
	//initializing ageDifference (giving it a value)
	
	lowRange = ageDifference * 0.72;
	//initializing lowRange
	
	highRange = ageDifference * 0.87;
	//initializing highRange
	
System.out.print("The low range of your training zone is " + lowRange + " and the High range is " + highRange);

	
		
		
	}
}
