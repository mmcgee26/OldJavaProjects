/* program: Payment.java
 * Michael McGee
 * 9/11/2016
 * purpose: to take a user's import regarding a loan
 * and display loan amount, monthly interest rate,
 * number of payments, amount paid back, and interest paid
 * 
 */

import java.util.Scanner;

public class Payment {
	public static void main(String[] args){
		//main method is open

Scanner keyIn = new Scanner(System.in);
//scanner is ready
		
int loanAmount;
double annualInterest;
double monthlyInterest;
double monthlyPayment;
int numberOfPayments;
double amountPaid;
double interestPaid;
//declared variables

System.out.print("Enter a value for the Loan Amount: ");
loanAmount = keyIn.nextInt();
//asking user for loan amount

System.out.print("Enter a Value for Annual Interest Rate as a whole number: ");
annualInterest = keyIn.nextDouble();
//asking user for annual interest rate

System.out.print("Enter a value for the number of Payments: ");
numberOfPayments = keyIn.nextInt();
//asking user for number of payments

monthlyInterest = annualInterest / 12;
//initializing monthlyInterest

double base;
double exp;
double answer;
//defining variables for exponents

base = (1+ monthlyInterest);
exp = numberOfPayments;
answer = Math.pow(base,  exp);
//using math.pow to solve the exponent

monthlyPayment = (monthlyInterest * answer)/(answer - 1) * loanAmount;
//initializing monthlyPayment, getting a value for it

amountPaid = monthlyPayment * numberOfPayments;
//initializing amountPaid

interestPaid = amountPaid - loanAmount;
//initializing interestPaid

System.out.println("Loan Amount:       $ " + loanAmount);
//displaying loan amount

System.out.println("Monthly Interest Rate:        " + monthlyInterest + "%");
//displaying monthly interest rate

System.out.println("Number of Payments:           " + numberOfPayments);
//displaying number of payments

System.out.println("Amount Paid Back:             $" + amountPaid);
//displaying amount paid back

System.out.println("Interest Paid:                $" + interestPaid);
//displaying interest paid

	}
}
