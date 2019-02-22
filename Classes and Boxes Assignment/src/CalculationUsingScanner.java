import java.util.Scanner;

class Volume {
	
	Scanner input = new Scanner(System.in);
	
	int side = input.nextInt();
	int volume = side*side*side;
	
}
public class CalculationUsingScanner {

	public static void main(String[] args) {
		
		System.out.print("Input first number to calculate volume:");
		
		UserInput userInput = new UserInput();

		System.out.println(userInput.volume);
		
	}

}
