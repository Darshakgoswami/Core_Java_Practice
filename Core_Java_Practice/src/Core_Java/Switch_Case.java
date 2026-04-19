package Core_Java;

import java.util.Scanner;

public class Switch_Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age");
		age = sc.nextInt();	
		switch (age) {
		case 10:
			System.out.println("child");
			break;
			
		case 15:
			System.out.println("school student");
			break;
			
		case 18:
			System.out.println("college student");

		default:
			System.out.println("proffesor");
			break;
		}
	}

}
