import java.util.Scanner;
public class ZodiacSign {
public static void main(String[] args){
	Scanner keyIn = new Scanner(System.in);
	int month;
	int date;
	//variables declared, method and scanner are open.
	System.out.print("Enter a month (Jan = 1, Feb = 2...Dec = 12):");
	month = keyIn.nextInt();
	System.out.print("Enter a date (1-31):");
	date = keyIn.nextInt();
	//asking for user input
	
	if ((month == 1 && date >=20) || (month == 2 && date <= 18)){
	System.out.print("Your Zodiac sign is Aquarius, one cool fact about that sign is"
			+ " they are supposedly compatible with Leo");
	}
	else if ((month == 2 && date >= 19) || (month == 3 && date <= 20)){
		System.out.print("Your Zodiac sign is Pisces. One cool fact about that is"
				+ "Pisces are supposedly compatible with Virgo");
	}
	else if ((month == 3 && date >= 21) || (month == 4 && date <= 19)){
		System.out.print("Your Zodiac sign is Aries. One cool thing about that is Aries are supposedly compatible with Libra");		
	}
	else if ((month == 4 && date >= 20)|| (month == 5 && date <= 20)) {
		System.out.print("Your Zodiac sign is Taurus. One cool fact about that is Taurus are supposedly compatible with Scorpio");
	}
	else if ((month == 5 && date >= 21) || (month == 6 && date <= 20)){
		System.out.print("Your Zodiac sign is Gemini. One cool fact about that is Gemini is supposedly compatible with Sagittarius");
	}
	else if ((month == 6 && date >= 21) || (month == 7 && date <= 22)){
		System.out.print("Your Zodiac sign is Cancer. One cool thing about that is Cancer is supposedly compatible with Capricorn");
	}
	else if ((month == 7 && date >= 23) || (month == 8 && date <= 22)){
		System.out.print("Your Zodiac sign is Leo, One cool thing about that is Leo is supposedly compatible with Aquarius.");
	}
	else if ((month == 8 && date >= 23) || (month == 9 && date <= 22)){
		System.out.print("Your Zodiac sign is Virgo. One cool thing about that is Virgo is supposedly compatible with Pisces.");
	}
	else if ((month == 9 && date >= 23) || (month == 10 && date <= 22)){
		System.out.print("Your Zodiac sign is Libra. One cool thing about that is Libra is supposedly compatible with Aries.");
	}
	else if ((month == 10 && date >= 23) || (month == 11 && date <= 21)){
		System.out.print("Your Zodiac sign is Scorpio. One cool thing about that is Scorpio is supposedly compatible with Taurus");
	}
	else if ((month == 11 && date >= 22) || (month == 12 && date <= 21)){
		System.out.print("Your Zodiac sign is Sagittarius. One cool thing about that is Sagittarius is supposedly compatible with Gemini");
	}
	else if ((month == 12 && date >= 22) || (month == 1 && date <= 19)){
		System.out.print("Your Zodiac sign is Capricorn. One cool thing about that is Capricorn are supposedly comaptible with Cancer");
		
	}
}

}