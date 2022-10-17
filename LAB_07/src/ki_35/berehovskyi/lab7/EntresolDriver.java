package ki_35.berehovskyi.lab7;

public class EntresolDriver {

	public static void main(String[] args) {
		
			Entresol <? super Data> entresol = new Entresol <Data>();
			entresol.AddData(new Pillows("Brinkhaus", 850));
			entresol.AddData(new StuffedAnimals("Teddy Bear" , 669));
	        entresol.AddData(new StuffedAnimals("Unicorn Boo" , 200));
	        entresol.AddData(new Pillows("WELLPUR" , 420));

	        Data res = entresol.findMin();
	        System.out.print("The lightest item in the entresol is: \n");
	        res.print();

	}

}
