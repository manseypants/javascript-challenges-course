
public class Calculation {
	
	double side;
	double volume;
	
	//volume calculation
	public void volume() {
		
		volume = side*side*side;
	}

	public static void main(String[] args) {
		
		Calculation cube = new Calculation();
		cube.side = 15;
		cube.volume();
		System.out.println(cube.volume);
		
	}

}
