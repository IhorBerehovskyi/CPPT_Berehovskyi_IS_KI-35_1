package ki_35.berehovskyi.lab4;

import java.io.*;

public class EnergySavingLampApp {

	public static void main(String[] args) throws FileNotFoundException{
		
		EnergySavingLamp lamp1 = new EnergySavingLamp();
		
		lamp1.getPower();
		
		lamp1.turnOnLamp();
		lamp1.printResource();
		lamp1.changeColor("blue");
		
		lamp1.turnOffLamp();
		lamp1.printResource();
		lamp1.changeColor("blue");
		
		lamp1.displayInfo();
		
/////////////////////////////////////////////////////////////////////////////////
		
		lamp1.turnOnLamp();
		lamp1.useEnergy();
		lamp1.accountReplenishment(50);
		lamp1.turnOnLamp();
		lamp1.useEnergy();
		lamp1.displayMoney();
		
		lamp1.dispose();

	}


}
