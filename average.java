//Write a Java method to compute the average of three numbers.

public class average {

	public static void main(String[] args) {
		double average = threeNumbers(2, 3, 4); 
		System.out.println(average);

	}
public static double threeNumbers(double a, double b, double c) {
	double three = (a + b + c) / 3; 
	return three; 
	
}
	
}
