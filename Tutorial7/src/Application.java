import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		//Create scanner object.
		Scanner input = new Scanner(System.in);
		
		//Output the prompt.
		System.out.println("Enter a line of integer: ");
		
		//Wait for the user to enter a line of text.
		int line = input.nextInt();
		
		//Tell the user what they entered.
		System.out.println("You entered: " + line);
		

	}

}
