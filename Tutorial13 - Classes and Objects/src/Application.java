
class Person {

	String name;
	int age;

	void speak() {

		for (int i = 0; i < 3; i++) {

			System.out.println("My name is " + name + " and I am " + age + " years old.");

		}
	}
	
	void sayhello() {
		
		System.out.println("Hello there!");
	}

}

public class Application {

	public static void main(String[] args) {

		Person person1 = new Person();

		person1.name = "Ryan Manse";
		person1.age = 33;
		person1.speak();
		person1.sayhello();

		Person person2 = new Person();
		person2.name = "Alexandra Bluth";
		person2.age = 28;
		person2.speak();
		person2.sayhello();

	}

}
