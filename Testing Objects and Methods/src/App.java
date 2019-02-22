
class Person {

	String firstName;
	String middleName;
	String lastName;
	int age;
	String height;

	void speak() {
		System.out.println("Hello");

	}

}

class Hobbies {

	String college = "Missouri Baptist University";
	String sports = "soccer";
	int jerseyNumber = 23;
	String position = "central attacking midfielder";
	String team = "Real Madrid";

}

public class App {

	public static void main(String[] args) {
		
		//creating four different person objects
		Person person = new Person();
		Person person2 = new Person();
		Person person3 = new Person();
		Person person4 = new Person();
		
		//creating a new hobby object
		Hobbies hobbies = new Hobbies();
		
		person2.firstName = "Sarah";
		person2.lastName = "John";
		
		person3.firstName = "Frank";
		person3.lastName = "Johnson";
		
		person4.firstName = "Michael";
		person4.lastName = "Jordan";

		person.firstName = "Ryan";
		person.middleName = "Christopher";
		person.lastName = "Manse";
		person.age = 33;
		person.height = "5'10";

		System.out.println("Hello, my name is " + person.firstName + " " + person.middleName + " " + person.lastName
				+ ". I am " + person.age + " years old and am " + person.height + " inches tall.");
		System.out.println("I went to " + hobbies.college + " and there I played " + hobbies.sports + ". I was a "
				+ hobbies.position + " my jersey number was " + hobbies.jerseyNumber + ".  My favorite team is "
				+ hobbies.team + ".");

	}

}
