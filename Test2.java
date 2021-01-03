
public class Test2 {

	
	public static void main(String[] args) {
		Person Mary = new Person("Mary"); 
		Person John = new Person ("John");
		Person otherPerson = new Person ("Sam"); 
		
		Mary.language = "French"; 
		Mary.nationality = "Canadian"; 
		Mary.job = "Doctor"; 
		Mary.countryOfResidence = "Canada"; 
		
		John.language = "Italian"; 
		John.nationality = "American"; 
		John.job = "unemplyed"; 
		John.countryOfResidence = "USA"; 
		
		Mary.sayHello("French");
		John.sayHello("Italian");
		otherPerson.sayHello("Portuguese");
		
		Mary.celebrateEaster("Christian");
		John.celebrateEaster("Muslim");
		
		Mary.canTakeLoan("Doctor");
		John.canTakeLoan("unemplyed");

	}
	
	
	
}