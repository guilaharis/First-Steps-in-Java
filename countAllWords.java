//Write a Java method to count all words in a string.

public class countAllWords {

	public static void main(String[] args) {
		allWords("Hello world"); 
		System.out.println(allWords("Hello world"));
		
		allWords("Hello my friend"); 
		System.out.println(allWords("Hello my friend"));

	}

	public static int allWords (String string) {
		int count= 0; 
		char ch[]= new char[string.length()];     
        for(int i=0;i<string.length();i++)  
        {  
            ch[i]= string.charAt(i);  
            if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
                count++;  
        }  
        return count; 
	}
}
