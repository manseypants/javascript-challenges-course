import java.util.ArrayList;

//Parent Class
class Machine {

	@Override
	public String toString() {
		return "I am a machine";
	}

	public void start() {
		System.out.println("Machine starting.");
}

//Child Class
class Camera extends Machine {
	@Override
	public String toString() {
		return "I am a camera";
	}
	
	public void snap() {
		System.out.println("Snap");
	}


}

}

public class App {

	public static void main(String[] args) {

		ArrayList<Machine> list1 = new ArrayList<Machine>();

		list1.add(new Machine());
		list1.add(new Machine());
		
		ArrayList<Camera> list2 = new ArrayList<Camera>();

		list2.add(new Camera());
		list2.add(new Camera());

		showList(list1);
		showList(list2);

	}

	public static void showList(ArrayList<? super Camera> list) {
		for (Machine value : list) {
			System.out.println(value);
			value.start();
		}
		

	}

}

