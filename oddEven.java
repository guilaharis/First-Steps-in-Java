
//Write a Java method to display the middle character of a string.
//Note:
//a) If the length of the string is even there will be two middle characters.
//b) If the length of the string is odd there will be one middle character.

public class oddEven {

	public static void main(String[] args) {
		 middleCharacter ("hello"); 
		 System.out.println(middleCharacter ("hello"));
		 
		 middleCharacter ("banana"); 
		 System.out.println(middleCharacter ("banana"));
	}
	
	public static String middleCharacter (String str) {
		int position; 
		int length; 
		if (str.length() % 2 == 0) {
			position = str.length() / 2 - 1;
            length = 2;
		}
		else
        {
            position = str.length() / 2;
            length = 1;
        }
	
	return str.substring(position, position + length);
		
	}
}
	
	


