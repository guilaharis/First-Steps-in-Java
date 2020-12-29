//Print elements of a given 2-d matrix with dynamic rows and columns taken from user input

import java.util.Scanner; 

public class rowsAndColumns2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows");
		int rows = sc.nextInt(); 
		System.out.println("Enter columns");
		int columns = sc.nextInt(); 
		int[][] array = new int [rows][columns]; 
		int counter = 1; 
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				array[i][j] = counter; 
				counter++; 
				System.out.println(array[i][j]);
			}
		}

	}

}
