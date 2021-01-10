/*Create class Person which has the following attributes: name, sex, religion, language spoken, job, nationality, EGN, date of birth,
age, country of residence. The name, language, nationality and job can be fully accessed from other classes. The sex, religion and
EGN can be set only once outside. The date of birth attribute is composed during the creation of an object based on the EGN, the
age also. The Person class should have methods – sayHello(), celebrateEaster(), isAdult(), canTakeLoan() with the relevant
parameters if any. sayHello() should print Hello on the relevant language, by default is English, celebrateEaster should print if the
concrete person celebrates Easter based on their religion, isAdult should take in consideration the country of residence,
canTakeLoan is based on the job.*/

public class Person {
	
public String name; 
public String language; 
public String nationality; 
public String job; 
private String sex; 
private String religion; 
private int EGN; 
private int dateOfBirth; 
private int age;
public String countryOfResidence; 

public Person(String personName) {
	this.name = personName;  
}

public void setSex(String name) {
	this.name = sex; 
	if (name == "Mary") {
		sex = "female"; 
	}
	if (name == "John") {
		sex = "male"; 
	}
    
}

public void setReligion(String name) {
	this.name = religion; 
	if (name == "Mary") {
		religion = "Christian"; 
	}
	if (name == "John") {
		religion = "Muslim"; 
	}
}

public void setEGN(String name) {
	this.name = String.valueOf(EGN);
	if (name == "Mary") {
		EGN = 20050111; 
	}
	if (name == "John") {
		EGN = 20000111; 
	}
}

/*??? The date of birth attribute is composed during the creation of an object based on the EGN, the
age also*/


public void sayHello(String language) {
	if (language == "French") {
		System.out.println("Salut");
	}
	if (language == "Italian") {
		System.out.println("Ciao");
	}
	if (language != "French" && language != "Italian") {
		System.out.println("Hello");
	}
}; 

public void celebrateEaster(String religion) {
	if (religion == "Christian") {
		System.out.println("Celebrates Easter");
	}
	if (religion == "Muslim") {
		System.out.println("Does not celebrate Easter");
	}
}; 

   public void isAdult(String countryOfResidence) {
	if (countryOfResidence == "Canada") {
		System.out.println("Mary is adult");
	}
	if (countryOfResidence == "USA") {
		System.out.println("John is adult");
	}
}; 

public void canTakeLoan(String job) {
	if (job == "unemplyed") {
		System.out.println("Cannot take loan");
	}
	if (job != "unemplyed") {
		System.out.println("Can take loan");
	}
}; 
}
