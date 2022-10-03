package ki_35.berehovskyi.lab4;

import java.io.*;

public class EnergySavingLamp extends Lamp implements Ability {

	private double money;
	private final double price = 10.05;
	private int time;
	
	public EnergySavingLamp() throws FileNotFoundException {
		money = 30;
		time = 2;
	}
	
	public EnergySavingLamp(double money, int time) throws FileNotFoundException {
		this.money = money;
		this.time = time;
	}
	
	public void accountReplenishment(double money) {
		this.money = money;
	}

	
	
	@Override
	public void useEnergy() {
		if(isTurnedOn == true) {	
			money -= price*time;
		}
		
		if(money <= price) {
			System.out.println("U don't have a money for use the light");
			fout.println("U don't have a money for use the light");
			turnOffLamp();
		}
		
	}
	
	public void displayMoney() {
		System.out.println("U have left " + money + ",don't waste energy");
		fout.println("U have left " + money + ",don't waste energy");
	}
}