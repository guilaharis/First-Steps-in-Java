//Write a program which advices the user where to go to a vacation based on the type of the vacation and the budget. There
//should be two options – Beach, Mountain. If the user put a different value then the program should print a message that there is
//no information about this type of vacation. Budgets are considered per day per person. If the budget per day for Beach type
//vacation is smaller than 50 then the program should advise Bulgaria as a destination, otherwise Outside Bulgaria. If the budget
//per day for Mountain type vacation is smaller than 30 then the program should advise Bulgaria as a destination, otherwise
//Outside Bulgaria.

import java.util.Scanner;

public class vacation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("For your vacation choose 1 for beach or 2 for mountain: ");
		int typeOfVacation = sc.nextInt();
	
		
		if(typeOfVacation == 1) {
			System.out.println("What is your budget per day per person?");
			double budget = sc.nextDouble();
			if(budget <=50) {
				System.out.println("You can go to Bulgaria");
			}
			else {
				System.out.println("You can travel the world");
			}
			
		}
		
		if(typeOfVacation == 2) {
			System.out.println("What is your budget per day per person?");
			double budget = sc.nextDouble();
			if(budget <=30) {
				System.out.println("You can go to Bulgaria");
			}
			else {
				System.out.println("You can travel the world");
			}
			
		}
		else if (typeOfVacation != 1 && typeOfVacation != 2) {
			System.out.println("There is no information about this type of vacation");
		}
		

	}

}
