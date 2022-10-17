package ki_35.berehovskyi.lab7;

public class Pillows implements Data {

	
	private String brandName;
	private int pillowsWeight;
	
	public Pillows(String brandName, int pillowsWeight){
		this.brandName = brandName;
		this.pillowsWeight = pillowsWeight;
	}
	 
	public String getName()
    {
        return brandName;
    }

    public void setName(String brandName)
    {
    	this.brandName = brandName;
    }
	
    public int getWeight() {	
		return pillowsWeight;
	}
	
    public int compareTo(Data p)
    {
        Integer s = pillowsWeight;
        return s.compareTo(p.getWeight());
    }


	public void print() {
		System.out.print("Brand of pillow: " + brandName + ", Weight of pillow: " + pillowsWeight + ";\n");
	}

}
