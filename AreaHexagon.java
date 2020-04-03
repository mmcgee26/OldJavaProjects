import java.util.Scanner;
public class AreaHexagon {
	public static void main(String [] args){
	Scanner keyIn = new Scanner(System.in);
		
		double s;
	
	System.out.print("Enter the side: ");

		s = keyIn.nextDouble();
		double area;
		double area1;
		area1 = (6 * (Math.pow(s, 2)));
		double area2;
		area2 = (4 * 0.5773502692);
		area = area1 / area2;
		double area4 = Math.round(area * 100.0) / 100.0;
		
		System.out.println("The area of the hexagon is " + area4);
	}

}