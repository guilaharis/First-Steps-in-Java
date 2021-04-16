/*Create class Person which has the following attributes: name, sex, religion, language spoken, job, nationality, EGN, date of birth,
age, country of residence. The name, language, nationality and job can be fully accessed from other classes. The sex, religion and
EGN can be set only once outside. The date of birth attribute is composed during the creation of an object based on the EGN, the
age also. The Person class should have methods – sayHello(), celebrateEaster(), isAdult(), canTakeLoan() with the relevant
parameters if any. sayHello() should print Hello on the relevant language, by default is English, celebrateEaster should print if the
concrete person celebrates Easter based on their religion, isAdult should take in consideration the country of residence,
canTakeLoan is based on the job.*/

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
		
		Child baby = new Child ("Tomi"); 
		baby.sayHello("Indian");
		baby.celebrateEaster("Christian");
		baby.isAdult("India");
		baby.canTakeLoan("bunny");
		Child kid = new Child ("Lori"); 
		kid.learningWords();
		kid.crying();
		
		Bulgarian woman = new Bulgarian ("Maria"); 
		woman.sayHello("Bulgarian");
		woman.celebrateEaster("Christian");
		woman.isAdult("Bulgaria");
		woman.canTakeLoan("student");
		Bulgarian girl = new Bulgarian ("Elena"); 
		girl.peeNarodniPesni();
		
		
		Italian man = new Italian ("Toto"); 
		man.sayHello("Italian");
		man.celebrateEaster("Christian");
		man.isAdult("Italy");
		man.canTakeLoan("Teacher");
		Italian boy = new Italian ("Marcelo"); 
		boy.singsOpera();
		

	}
	
	
	
}