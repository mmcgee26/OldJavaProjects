/*
 * Program name: SnackPrices
 * Michael McGee
 * 9/29/2016
 * Lab section 2
 * Purpose: To help a user make a selection regarding snacks and their prices.
 * Pseudocode: display options for user, user makes selection, user decides quantity. User types in souvenir and randomly generates price is assigned
 * caculate total and add sales tax.
 */
import java.util.Random;
import java.util.*;
public class SnackPrices {
	public static void main(String [] args) { //main method open
		Scanner keyIn = new Scanner(System.in); // scanner created
		System.out.println("You're on a roat trip and stopped at a gas station to buy some snacks. \nHere are your options :");
		double chipsPrice = 1.25;
		double priceChocolate = 1.00;
		double priceCookies = 1.75;
		double pricePeanut = 1.50;
		double priceNuts = 2.25;
		int userSelection; //declaring variables
		int userQuantity;
		String userSouvenir;
		double totalPrice1;
		double snackCost;
		double randomNumber; //declaring more variables
		System.out.println(" ");
		System.out.println("1. Chips - $1.25 \n2. Chocolate Bar - $1.00 \n3. Cookies - $1.75 \n4. Peanut Butter Crackers - $1.50 \n5. Assorted Nuts "); //displaying options
		System.out.println(" "); //displaying options
		System.out.println("Please make a selection: ");//asking for selection
		userSelection = keyIn.nextInt();
		
		if (userSelection == 1) {
				System.out.println("You chose to buy Chips at $1.25 each."); //if for A
				System.out.println(" ");
				snackCost = chipsPrice;
			}
		else if (userSelection == 2) {
			System.out.println("You chose to buy Chocolate Bar(s) at $1.00 each."); //if for B
			System.out.println(" ");
			snackCost = priceChocolate;
		}
		else if (userSelection == 3) {
			System.out.println("You chose to buy cookies at $1.00 each."); // if for C
			System.out.println(" ");
			snackCost = priceCookies;
		}
		else if (userSelection == 4) {
			System.out.println("You chose to buy Peanut Butter Crackers at $1.50 each."); // if for D
			System.out.println(" ");
			snackCost = pricePeanut;
		}
		else if (userSelection == 5) {
			System.out.println("You chose to buy Assorted Nuts at $2.25 each."); // if for E
			System.out.println(" ");
			snackCost = priceNuts;
		}
		else {
			System.out.print("You have entered an invalid respose. please enter an integer 1-5"); //else statement
			snackCost = 0;
			System.exit(0);
		}
		System.out.println("How many would you like to buy? "); //asking for quantity
		userQuantity = keyIn.nextInt();
		totalPrice1 = snackCost * userQuantity; //initializing variable
		System.out.println("Your total price is: $" + totalPrice1);
		System.out.println(" ");
		System.out.println("Or it would have been... \nIf you hadn't gotten distracted and found a souvenir. \nWhat did you buy? (enter what you bought) ");
		userSouvenir = keyIn.next();
		Random rnd = new Random();
		int low = 5; //low range
		int high = 15; //high range
		randomNumber = rnd.nextInt(high-low) + low; //generating a random number between 5-15
		System.out.println("You bought a " + userSouvenir + " for $" + randomNumber);
		System.out.println(" ");
		double totalPrice2 = (totalPrice1 + randomNumber) * 1.07; //initializing totalPrice2
		System.out.print("Your total price, including a 7% sales tax, is now: $" + totalPrice2/100*100); //displaying results
		
	}
}
