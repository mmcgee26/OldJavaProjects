import java.util.Random;
import java.util.Scanner;
public class blackjack_Finished {
	static Scanner keyIn = new Scanner(System.in);
	static Random random = new Random();
	public static String displayInstructions(){ //method for instructions
		return "Intructions: You will be dealt 2 cards, as will the dealer"
			+ "\nIf you are unhappy with your hand and want to draw a card, you may do so. "
			+ "\nonce you are satisfied with you hand, the dealer will attempt to beat you. "
			+ "\nIf the dealer is closer to 21 than you, you lose. otherwise, you win.";
}
	public static String determineWinner(int userHand, int dealerHand){ //method for determining winner
		if(userHand > dealerHand && userHand <= 21 && dealerHand <=21)
		return "You win! Congrats!";
		else if(userHand < dealerHand && userHand <= 21 && dealerHand <= 21)
		return "Dealer Wins :(";
		else if(userHand < dealerHand && dealerHand > 21)
		return "You Win! Congrats!";
		else if(dealerHand > 21 && userHand < 21)
		return "You win! Congrats!";
		else if(dealerHand < 21 && userHand > 21)
		return "Dealer Wins :(";
		else
		return "Tie, better luck next time!";
		}
		
	public static String drawCardString(){ //method for drawing the name of a card
		int cardDrawn;
		String userCard;
		cardDrawn =  random.nextInt(12)+1;
		if (cardDrawn == 1){
			userCard = "Ace";
			}
			else if (cardDrawn == 2){
			userCard = "2";
			}
			else if (cardDrawn == 3){
			userCard = "3";
			}
			else if (cardDrawn == 4){
			userCard = "4";
			}
			else if (cardDrawn == 5){
			userCard = "5";
			}
			else if (cardDrawn == 6){
			userCard = "6";
			}
			else if (cardDrawn == 7){
			userCard = "7";
			}
			else if (cardDrawn == 8){
			userCard = "8";
			}
			else if (cardDrawn == 9){
			userCard = "9";
			}
			else if (cardDrawn == 10){
			userCard = "10";
			}
			else if (cardDrawn == 11){
			userCard = "Jack";
			}
			else if (cardDrawn == 12){
			userCard = "Queen";
			}
			else if (cardDrawn == 13){
			userCard = "King";
			}
			else{
			userCard = "null";
			}
		return userCard;
	}
	public static int drawCardValue(String userCard1){ //method for drawing the value of a card
		String cardDrawn2 = userCard1;
		int cardValue;
		if (cardDrawn2.equals("Ace")){
			cardValue = 1;
			}
			else if (cardDrawn2.equals("2")){
			cardValue = 2;
			}
			else if (cardDrawn2.equals("3")){
			
			cardValue = 3;
			}
			else if (cardDrawn2.equals("4")){
			cardValue = 4;
			}
			else if (cardDrawn2.equals("5")){
			cardValue = 5;
			}
			else if (cardDrawn2.equals("6")){
			cardValue = 6;
			}
			else if (cardDrawn2.equals("7")){
			cardValue = 7;
			}
			else if (cardDrawn2.equals("8")){
			cardValue = 8;
			}
			else if (cardDrawn2.equals("9")){
			cardValue = 9;
			}
			else if (cardDrawn2.equals("10")){
			cardValue = 10;		
			}
			else if (cardDrawn2.equals("Jack")){
			cardValue = 10;
			}
			else if (cardDrawn2.equals("Queen")){
			cardValue = 10;
			}
			else if (cardDrawn2.equals("King")){
			cardValue = 10;
			}
			else{
			cardValue = 0;
			}
		return cardValue;
	}
	public static void main(String[] args){ //opening main method
		System.out.println("Welcome to Blackjack\n" + displayInstructions()); //displaying instructions
		char playAgain = 'Y';
		while (playAgain =='Y' || playAgain == 'y'){
		System.out.println("User draws 2 cards:");
		int userHand;
		String userCard1;
		String userCard2;
		String userCard3;
		String userCard4;
		String userCard5;					//declaring variables
		int card1Value;
		int card2Value;
		int card3Value;
		int card4Value;
		int card5Value;
		userCard1 = drawCardString();
		card1Value = drawCardValue(userCard1); //drawing card
		System.out.println("User Card 1: " + userCard1);
		userCard2 = drawCardString();
		card2Value = drawCardValue(userCard2);
		System.out.println("User Card 2: " + userCard2);
		if (userCard1.equals("Ace")){
		System.out.print("You drew an ace. Would you like it to count as a 1, or a 11?"); //asking for input for ace value
		int userChoice = keyIn.nextInt();
		if (userChoice == 1)
		card1Value = 1;
		else
		card1Value = 11;
		}
		if (userCard2.equals("Ace")){
			System.out.print("You drew an ace. Would you like it to count as a 1, or a 11?");
			int userChoice2 = keyIn.nextInt();
			if (userChoice2 == 1)
			card2Value = 1;
			else
			card2Value = 11;
		
		}
		userHand = card1Value + card2Value; //determining hand value
		if(userHand == 21){
			System.out.println("You win! Congrats!");
			System.exit(0);
		}
		
		int dealerHand;
		String dealerCard1;
		String dealerCard2;
		String dealerCard3;
		String dealerCard4;
		String dealerCard5;			//declaring variables
		int dealercard1Value;
		int dealercard2Value;
		int dealercard3Value;
		int dealercard4Value;
		int dealercard5value;
		
		dealerCard1 = drawCardString();
		dealercard1Value = drawCardValue(dealerCard1);
		dealerCard2 = drawCardString();
		dealercard2Value = drawCardValue(dealerCard2);
		System.out.println("");
		System.out.println("Dealer draws two cards: ");
		System.out.println("Dealer Card 1: " + dealerCard1);
		System.out.println("Dealer Card 2: " + dealerCard2);
		if (dealerCard1.equals("Ace")){
		System.out.print("Dealer drew an ace. Would you like it to count as a 1, or a 11?");//asking for input for ace value
		int userChoice = keyIn.nextInt();
		if (userChoice == 1)
		dealercard1Value = 1;
		else
		dealercard1Value = 11;
		}
		if (dealerCard2.equals("Ace")){
			System.out.print("Dealer drew an ace. Would you like it to count as a 1, or a 11?(Chose the best option for the dealer)");//input for ace value
			int userChoice2 = keyIn.nextInt();
			if (userChoice2 == 1)
			dealercard2Value = 1;
			else
			dealercard2Value = 11;
		}
		dealerHand = dealercard1Value + dealercard2Value; //determining value of dealer hand
		if(dealerHand < 17){
			dealerCard3 = drawCardString();
			dealercard3Value = drawCardValue(dealerCard3);
			if (dealerCard3.equals("Ace")){
				System.out.print("Dealer drew an ace. Would you like it to count as a 1, or a 11?");//input for ace value
				int userChoice = keyIn.nextInt();
				if (userChoice == 1)
				dealercard1Value = 1;
				else
				dealercard1Value = 11;
				}
			System.out.println("Dealer was under 17, so they drew another card. They drew a " + dealerCard3); //dealer draws another card
			dealerHand += dealercard3Value;
		}
		System.out.println("Would you like to draw another card? 1 for yes and 2 for no: ");
		int userChoice = keyIn.nextInt();
		if(userChoice == 1){
			userCard3 = drawCardString();
			card3Value = drawCardValue(userCard3);
			if(userCard3.equals("Ace")){
				System.out.print("You drew an ace. Would you like it to count as a 1, or a 11?"); //ace input
				int userChoice2 = keyIn.nextInt();
				if (userChoice2 == 1)
				card3Value = 1;
				else
				card3Value = 11;
			}
			
			userHand += card3Value;
			System.out.println("User Card 1: " + userCard1);
			System.out.println("User Card 2: " + userCard2);
			System.out.println("User Card 3: " + userCard3);
			if(userHand > 21){
				System.out.println("You lose!(Went over 21) Better luck next time!"); //break over 21
				System.exit(0);
			}
			System.out.println("Would you like to draw another card? 1 for yes and 2 for no: ");
			int userChoice2 = keyIn.nextInt();
			if(userChoice2 == 1){
				userCard4 = drawCardString();
				card4Value = drawCardValue(userCard4);
				if(userCard4.equals("Ace")){
					System.out.print("You drew an ace. Would you like it to count as a 1, or a 11?"); //ace input
					int userChoice3 = keyIn.nextInt();
					if (userChoice3 == 1)
					card4Value = 1;
					else
					card4Value = 11;
				}
			
				userHand += card4Value;
				System.out.println("User Card 1: " + userCard1);
				System.out.println("User Card 2: " + userCard2);
				System.out.println("User Card 3: " + userCard3);
				System.out.println("User Card 4: " + userCard4);
				if(userHand > 21){
					System.out.println("You lose!(Went over 21) Better luck next time!");
					System.exit(0);
				}
				System.out.println("Would you like to draw another card? 1 for yes and 2 for no: "); //asking for draw or not
				int userChoice4 = keyIn.nextInt();
				if(userChoice4 == 1){
					userCard5 = drawCardString();
					card5Value = drawCardValue(userCard5);
					if(userCard5.equals("Ace")){
						System.out.print("You drew an ace. Would you like it to count as a 1, or a 11?"); //ace input
						int userChoice3 = keyIn.nextInt();
						if (userChoice3 == 1)
						card5Value = 1;
						else
						card5Value = 11;
					}
					userHand += card5Value;
					System.out.println("User Card 1: " + userCard1);
					System.out.println("User Card 2: " + userCard2);
					System.out.println("User Card 3: " + userCard3);
					System.out.println("User Card 4: " + userCard4);
					System.out.println("User Card 5: " + userCard5);
				
					
					if(userHand > 21){
						System.out.println("You lose!(Went over 21) Better luck next time!"); //break over 21
						System.exit(0);
					}
				}
					}
		}
					System.out.println(determineWinner(userHand, dealerHand)); //showing winner
					
				System.out.print("Would you like to play again? Y for yes, N for no: "); //user input for playing again
				playAgain = keyIn.next().charAt(0); //determining if loop will re-cycle
				}
				
			
			
		
		
	}
	}

		
		
		
		

				
		




