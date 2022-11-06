package day5;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any No :");
		int num = scanner.nextInt();
		for (int d = 2; d < num; d+=1) {
			while(num%d==0) {
				num=num/d;
				System.out.println(d);
			}
		}
	}

}
