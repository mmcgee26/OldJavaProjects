/*
 * Michael McGee
 * 12/1/16
 * PetStore program will allow user to create an array of their choosing (amount of names) and let them choose one of four options. if they choose 1:
 * they will enter a name and it will search for that name, displaying the corresponding pet and pet type. if they choose 2: They can search for a pet
 * name and program will display corresponding name and pet type. if they choose 3: they will enter a pet type and it will display the amount of pets of that type.
 */
import java.util.*;
public class PetStore {
	public static void main(String[] args){ //opening main
		
		int userChoice;
		Scanner keyIn = new Scanner(System.in);
		System.out.print("How many customers will be entered?: "); //user input
		userChoice = keyIn.nextInt();
		String[][] array = new String[userChoice][3];
		
			for(int j = 0; j < userChoice; j++){ //filling array with user input
				System.out.print("Enter name " + (j+1) + ": ");
				String userEntry = keyIn.next();
				array[j][0] = userEntry;
				
				System.out.print("Enter "+ userEntry + "'s pet: ");
				userEntry = keyIn.next();
				array[j][1] = userEntry;
				
				System.out.print("What kind of pet is " + userEntry + "? ");
				userEntry = keyIn.next();
				array[j][2] = userEntry;
				
			}
			System.out.println("(Listed as [Name][Pet Name][Pet Type])"); //printing results
			for(int i = 0; i < array.length; i++){
				for(int j = 0; j < array[i].length; j ++){
					System.out.print(array[i][j] + " ");
					
				}System.out.println();
			}
			System.out.println();
			System.out.println("Choose one of the following Options\n");
			System.out.println("1. Search For Customer\n2. Search for Pet\n3.Pet Type Counter\n4. Quit"); //asking for input for options
			int userChoice2 = 0;
			userChoice2 = keyIn.nextInt();
			
			while(userChoice2 != 4){
				int count = 0;
				if (userChoice2 == 1){  //option 1: searching for name
					System.out.print("Enter a Name you would like to search: ");
					String userName = keyIn.next();
					boolean nameFound = false;
					for(int i = 0; i < userChoice; i ++){
						
						if(userName .equals(array[i][0])){ 
							System.out.println(userName +" was found. \nPet: " + array[i][1] + "\nPet's Type: " + array[i][2]);
							 nameFound = true;
							break;
						}
					}
					if(nameFound == false)
						System.out.println("Unable to find User with that Name.\n");
				}
				
				
				if(userChoice2 == 2){ //option 2: pet name search
					System.out.print("Enter a Pet Name you would like to search: ");
					String petName = keyIn.next();
					boolean nameFound = false;
					for(int i = 0; i < userChoice; i ++){
						
						if(petName .equals(array[i][1])){
							System.out.println(petName +" was found. \nCustomer's Name: " + array[i][0] + "\nPet's Type: " + array[i][2]);
							 nameFound = true;
							break;
						}
					}
					if(nameFound == false)
						System.out.println("Unable to find Pet with that Name.\n");
				
				}
				if(userChoice2 == 3){ //option 3: pet type search
					System.out.print("Enter a Pet Type you would like to search: ");
					String petType = keyIn.next();
					boolean nameFound = false;
					for(int i = 0; i < userChoice; i ++){
						
						if(petType.equals(array[i][2]))
							count ++;
						
					}
					System.out.println("There are " + count + " " + petType + "."); //displaying results
				
				}
				System.out.print("Which would you like to do?"); //asking for loop or not
				userChoice2 = keyIn.nextInt();
			}
		}
	}

