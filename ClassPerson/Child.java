
public class Child extends Person{



	public Child(String personName) {
		super(personName);
		}

	public void sayHello(String language) {
		if(name == "Tomi")
		System.out.println("Mama");
	};
	
	public void celebrateEaster (String religion) {
		System.out.println("Happy bunny");
	}
	
	public void isAdult(String countryOfResidence) {
		System.out.println("It's a child");
	}
	
	public void canTakeLoan(String job) {
		System.out.println("Does not need a loan");
	}

	public void crying () {
		System.out.println("Ua ua");
	}
	
	public void learningWords () {
		System.out.println("cat, dog, pig");
	}
}

