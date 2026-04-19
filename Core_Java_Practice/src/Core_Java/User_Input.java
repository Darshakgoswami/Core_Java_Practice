package Core_Java;

import java.util.Scanner;

public class User_Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a : ");
		int a = sc.nextInt();
		System.out.println("enter b : ");
		int b = sc.nextInt();
		int sum = a+b;
		System.out.println("sum is : "+sum);
	}

}
