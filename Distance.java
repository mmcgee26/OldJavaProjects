import java.util.Scanner;
public class Distance {
	public static void main(String[] args){
		Scanner keyIn = new Scanner(System.in);
		
	double x1;
	double y1;
	double x2;
	double y2;
	double distance;
	System.out.print("Enter the x value of the first coordinate: ");
	x1 = keyIn.nextDouble();
	System.out.print("Enter the y value of the first coordinate: ");
	y1 = keyIn.nextDouble();
	System.out.print("Enter the x value of the second coordinate: ");
	x2 = keyIn.nextDouble();
	System.out.print("Enter the y value of the second coordinate: ");
	y2 = keyIn.nextDouble();
	double x3;
	double y3;
	x3 = Math.pow(x2-x1, 2);
	y3 = Math.pow(y2-y1, 2);
	
	distance = Math.sqrt(x3+y3);
	System.out.println("The distance between those points is " + distance );
	
	
	}

}
