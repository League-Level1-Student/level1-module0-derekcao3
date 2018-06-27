package extra;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot rob = null;
	public static void main(String[] args) {
		rob = new Robot();
		rob.moveTo(210,230);
		rob.setSpeed(10);
		rob.hide();
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			drawHouse(rand.nextInt(100)+50);
		}

		
	}
	public static void drawHouse(int height) {
		rob.setPenColor(Color.black);
		rob.setAngle(0);
		rob.penDown();
		rob.move(height);
		rob.setAngle(90);
		rob.move(100);
		rob.setAngle(180);
		rob.move(height);
		rob.setPenColor(0,150,0);
		rob.setAngle(90);
		rob.move(50);
	}
}
