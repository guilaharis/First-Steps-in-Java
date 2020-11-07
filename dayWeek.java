//Write a program to print the days of the week based on the user digit 1-7 input. The message should be “The [user input digit]-
//st/nd/rd/th day of the week is [the day of the week]” Hint: Use switch-case.



import java.util.Scanner;

public class dayWeek {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter digit: ");
		int i = sc.nextInt();
		switch(i)
		{
		case 1:
		System.out.println("Monday");
		break;
		case 2:
		System.out.println("Tuesday");
		break;
		case 3:
		System.out.println("Wednesday");
		break;
		case 4:
		System.out.println("Thursday");
		break;
		case 5:
		System.out.println("Friday");
		break; 
		case 6:
		System.out.println("Saturday");
		break; 
		case 7: 
		System.out.println("Sunday");
		break;
		
		default:
		System.out.println("Default ");
		}

	}

}
