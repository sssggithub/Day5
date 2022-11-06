package day5;

import java.util.Scanner;

public class Vowel_or_Consonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter Character:");
		Scanner s=new Scanner(System.in);
		char ch = s.next().charAt(0);
		if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'){
		   System.out.println("Given character is an vowel");
		}else{
		   System.out.println("Given character is a consonant");
		}
	}

}
