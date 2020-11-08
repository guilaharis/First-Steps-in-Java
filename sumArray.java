//Write program to print sum of a given array elements


public class sumArray {

	public static void main(String[] args) {
	//String [] chocolates = {"Milka", "Nestle", "Lindt"}; 
	//for (int i = 0; i < chocolates.length; i++) {
	//System.out.println(chocolates[i]);
		
	//}

		int [] array = {1, 2, 3, 4}; 
		int sum = 0; 
		for (int i = 0; i < array.length; i++) {
			sum = sum + array [i]; 
		}
		System.out.println(sum);
	}

}
