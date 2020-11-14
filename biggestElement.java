//Find biggest element of an array and print it in the console

public class biggestElement {

	public static void main(String[] args) {
		//int[] array = {1, 4, 5, 8, 10, 17}; 
		//for (int i = 0; i < 1; i++) {
			//if(array [0]> array [1]) { 
			//continue;
		//}
		//else if (array [1] > array [2]) {
			//continue;}
		//else if (array [2] > array [3]) {
			//continue;
		//}
		//else if (array[3] > array[4]) {
			//continue;
		//}
		//else if (array[4] > array [5]) {
			//continue;
		//}
		
		//}
		
			//System.out.println(array[5]);
	

			int[] array = {1, 4, 5, 8, 10, 17};	
			int biggestNumber = 0; 
			if(array[0] > array[1]) {
				biggestNumber = array[0]; 
			}
			else {
				biggestNumber = array[1]; 
			}
			if(array[1] > array[2]) {
				biggestNumber = array[1]; 
			}
			else {
				biggestNumber = array[2]; 
			}
			if(array[2] > array[3]) {
				biggestNumber = array[2]; 
			}
			else {
				biggestNumber = array[3]; 
			}
			if(array[3] > array[4]) {
				biggestNumber = array[3]; 
			}
			else {
				biggestNumber = array[4]; 
			}
			if(array[4] > array[5]) {
				biggestNumber = array[4]; 
			}
			else {
				biggestNumber = array[5]; 
			}
			
			
			
			System.out.println(biggestNumber);
		

	}

}
