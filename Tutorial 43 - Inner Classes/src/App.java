
public class App {
	
	public static void main (String[] args) {
		
		Robot robot = new Robot(7);//making new robot
		robot.start();//calling robot to start
		
//		Robot.Brain brain = robot.new Brain();
//		brain.think();
		
		Robot.Battery battery = new Robot.Battery();
		battery.charge();
						
	}

}
