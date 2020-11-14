
public class smallestNumber {

	public static void main(String[] args) {
	int number = small(4, 8, 0); 
	System.out.println(number);

	}

	public static int small (int a, int b, int c) {
		int smallestNumber = 0; 
		if(a < b && a < c) {
			smallestNumber = a; 
		}
		if (b < a && b < c) {
			smallestNumber = b; 
		}
		if (c < a && c < b) {
			smallestNumber = c; 
		}
		return smallestNumber; 
	}
}
