package day5;

import java.util.Scanner;

public class Quotient_and_Remainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int quotient = 0, reminder = 0;
		System.out.print("Enter first number : ");
		int num1 = scanner.nextInt();
		System.out.print("Enter second number : ");
		int num2 = scanner.nextInt();

		quotient = num1 / num2;
		reminder = num1 % num2;
		System.out.println("Quotient : " + quotient);
		System.out.println("Remainder : " + reminder);
	}

}
