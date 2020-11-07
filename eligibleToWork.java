//Write Java program to allow the user to input his/her age. Then the program will show if the person is eligible to work. A person
//who is eligible to work must be older than or equal to 16 years old

import java.util.Scanner;

public class eligibleToWork {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age: ");
		int i = sc.nextInt();
		if(i >= 16) {
			System.out.println("You are eligible to work");
		}
		else {
			System.out.println("You are not yet eligible to work");
		}

	}

}
