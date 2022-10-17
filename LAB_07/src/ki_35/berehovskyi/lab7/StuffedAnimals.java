package ki_35.berehovskyi.lab7;

public class StuffedAnimals implements Data {

	private String animalName;
	private int toysWeight;
	
	public StuffedAnimals(String animalName, int toysWeight){
		this.animalName = animalName;
		this.toysWeight = toysWeight;
	}
	
	public String getName()
    {
        return animalName;
    }

    public void setName(String animalName)
    {
    	this.animalName = animalName;
    }
	
    public int getWeight() {
		return toysWeight;
	}

	public int compareTo(Data p) {
		Integer s = toysWeight;
        return s.compareTo(p.getWeight());
	}

	public void print() {
		System.out.print("Animal's name: " + animalName + ", Weight of toys: " + toysWeight + ";\n");
	}

}
