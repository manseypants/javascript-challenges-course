
public class Application {

	public static void main(String[] args) {
	
		
		//Inefficient
		String info = "";
		
		info += "My name is Bob.";
		info += " ";
		info += "I am a builder.";
		
		System.out.println(info);
		
		//Efficient
		
		StringBuilder sb = new StringBuilder("");
		
		sb.append("My name is Sue.");
		sb.append(" ");
		sb.append("I am a lion tamer.");
		
		System.out.println(sb.toString());
		
		StringBuilder rm = new StringBuilder();
		
		rm.append("Hello, my name is Ryan.");
		rm.append(" ");
		rm.append("I love to eat nachos.");
		
		System.out.println(rm);
		
		StringBuilder ab = new StringBuilder();
		
		ab.append("Hello, my name is Ali.")
		.append(" ")
		.append("I am a school teacher ")
		.append("at Hoeke Middle School.");
		
		System.out.println(ab);
		
		for(int i=0; i<=20; i++) {
			
			System.out.printf("%2d: some text here.\n", i);
			
		}
		
		System.out.printf("Total value: %.2f\n", 5.6);
		System.out.printf("Total value: %5.2f\n", 500.6234);
		

	}

}
