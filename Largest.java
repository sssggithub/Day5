package day5;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter three number: ");
		Scanner z=new Scanner(System.in);
		int a=z.nextInt();
		System.out.println("First number:"+a);
		int b=z.nextInt();
		System.out.println("Second number:"+b);
		int c=z.nextInt();
        System.out.println("Third number:"+c);
	if(a>b&&a>c) {
		System.out.println("A is The largest number:"+a);
	}
		else if(b>a&&b>c) {
			System.out.println("B Is The largest number:"+b);
		}
		else  {
			System.out.println("C Is The largest number:"+c);
		}
	}

}
