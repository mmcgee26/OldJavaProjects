package chapter3;
import java.util.Scanner;
public class Programmingproject1 {
	public static void main(String[] args){
Scanner keyIn = new Scanner(System.in);
int todaysDay;
int futureDay;

System.out.print("Enter today's day:");
todaysDay = keyIn.nextInt();
System.out.print("Enter the number of days elapsed since today:");
futureDay = keyIn.nextInt();

int futureDayOfWeek;
futureDayOfWeek = futureDay % 7;
int futureDayOfWeek2 = (futureDayOfWeek + todaysDay) % 7;
if (todaysDay == 0){
	System.out.print("Today is Sunday and the future day is ");
}
else if (todaysDay == 1){
	System.out.print("Today is Monday and the future day is ");
}
else if (todaysDay == 2){
	System.out.print("Today is Tuesday and the future day is ");
}
else if (todaysDay == 3){
	System.out.print("Today is Wednesday and the future day is ");
}
else if (todaysDay == 4){
	System.out.print("Today is Thursday and the future day is ");
}
else if (todaysDay == 5){
	System.out.print("Today is Friday and the future day is ");
}
else if (todaysDay == 6){
	System.out.print("Today is Saturday and the future day is ");
}
else {
	System.out.print("Today is an invalid starting day. Today's day must be 0-6. and the future day is ");
}
if (futureDayOfWeek2 == 0){
	System.out.print("Sunday");
}
if (futureDayOfWeek2 == 1){
	System.out.print("Monday");
	}
if (futureDayOfWeek2 == 2){
	System.out.print("Tuesday");
}
if (futureDayOfWeek2 == 3){
	System.out.print("Wednesday");
}
if (futureDayOfWeek2 == 4){
	System.out.print("Thursday");
}
if (futureDayOfWeek2 == 5){
	System.out.print("Friday");
}
if (futureDayOfWeek2 == 6){
	System.out.print("Saturday");
}


	

	}
}
