import java.util.Scanner;

public class SixthClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first side: ");
		int side1 = sc.nextInt();
		System.out.println("Enter second side: ");
		int side2 = sc.nextInt();
		System.out.println("Enter third side: ");
		int side3 = sc.nextInt();
		int sum = side1 + side2 + side3;
		System.out.println("The perimetre of the triangle is " + sum);


	}

}
