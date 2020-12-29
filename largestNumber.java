//Find the largest number from a given array and print it in a console. Hint: use for loop

public class largestNumber {

	public static void main(String[] args) {
		int arr[]={2,11,45,9};
		int largestNumber = 0; 
		for(int i=0; i<1; i++){ 
			if (arr[0] < arr[1]) {
				largestNumber = arr[1]; 
			}
			else largestNumber = arr [0]; 
			if (arr[1] < arr[2]) {
				largestNumber = arr[2]; 	
			}
			else largestNumber = arr[1]; 
			if (arr[2] < arr[3]) {
				largestNumber = arr[3]; 
			}
			else largestNumber = arr[2]; 
		System.out.println(largestNumber);
		}
		
	}

}
