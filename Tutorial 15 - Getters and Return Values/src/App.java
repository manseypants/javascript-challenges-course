class Person{
	String name;
	int age;
	
	//Use a method to retrieve some data or calculate something. 
	void speak() {
		
		System.out.println("My name is " + name);
		
	}
	
	//This works because the "age" is nested in the "Person" class.
	int calculateYearsToRetirement() {
		
		int yearsLeft = 65 - age;

		return yearsLeft;
		
	}
	
	//Making a method of "getName" so we can get the name via a method versus using the main class. 
	int getAge() {
		
		return age;
		
	}
	
	String getName() {
		
		return name;
		
	}
}

//Anything dealing with the class "person" means that you can pull from any action within it after you declare the person "Person person = new Person();"
public class App {

	public static void main(String[] args) {
		
		//Creating new "person" object
		Person person1 = new Person();
		
		//Calling the attributes of the person object we named "person1"
		person1.name = "Joe";
		person1.age = 25;
		
		//Calling the method "speak" within the "person" class which returns the body of the method void speak()
		person1.speak();
		
		//Calling the method "calculateYearsToRetirement" via the person1 object made with the person class and naming it years.
		int years = person1.calculateYearsToRetirement();
		
		//Printing out our "years" variable
		System.out.println(years);
		
		//Assigning "getAge" to age from the POJO person1 which is a person object
		int age = person1.getAge();
		
		//" getname "
		String name = person1.getName();
		
		System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
		

	}

}
