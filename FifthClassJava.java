import java.util.Scanner;

public class FifthClassJava {

	public static void main(String[] args) {
	//1. Write a program which calculates if a triangle can be built by 3 given angles. The
		//angles are taken from the user input. There are two possible outputs – if the triangle
		//can’t be built based on the angle values or the triangle can be built based on the
		//angle values. If the triangle is possible the output should contain also the type of the
		//triangle – acute (остроъгълен), right-angled (правоъгълен), obtuse (тъпоъгълен),
		//equilateral (равностранен), isosceles (равнобедрен), multifaceted (разностранен).
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter angle1: ");
		int angle1 = sc.nextInt();
		System.out.println("Enter angle2: ");
		int angle2 = sc.nextInt();
		System.out.println("Enter angle3: ");
		int angle3 = sc.nextInt();
		int sum = angle1 + angle2 + angle3;
		if(sum <= 180)  {
			System.out.println("You've just made a triangle!");
		}
	    if(sum != 180) {
		System.out.println("Sorry, try again to make a triangle");
		}
		
		
	}

}
