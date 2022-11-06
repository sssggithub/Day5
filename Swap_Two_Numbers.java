package day5;

import java.util.Scanner;

public class Swap_Two_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number For x: ");
		Scanner sw=new Scanner(System.in);
		int x=sw.nextInt();
		System.out.println("Enter number For y: ");
		int y=sw.nextInt();
		int z;
		System.out.println("Enter number:" +x+ " " +y);
		z=x;
		x=y;
		y=z;
		System.out.println("Swap number:" +x+ " " +y);
	}

}
