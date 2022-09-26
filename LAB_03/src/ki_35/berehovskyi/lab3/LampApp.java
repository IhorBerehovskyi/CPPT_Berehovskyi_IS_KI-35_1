package ki_35.berehovskyi.lab3;
import java.io.*;

/**
 * 
 * @author Ihor Berehovskyi
 *
 */

public class LampApp {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Lamp lamp1 = new Lamp();
		
		lamp1.getPower();
		
		lamp1.turnOnLamp();
		lamp1.printResource();
		lamp1.changeColor("blue");
		
		lamp1.turnOffLamp();
		lamp1.printResource();
		lamp1.changeColor("blue");
		
		lamp1.displayInfo();
		
		
		
		lamp1.dispose();
		
	}

}
