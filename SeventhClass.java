import java.util.Scanner;

public class SeventhClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter height: ");
		double height = sc.nextInt();
		System.out.println("Enter base: ");
		double base = sc.nextInt();
		double area = (height * base) / 2;
		System.out.println("The area of the triangle is: " + area);

	}

}
