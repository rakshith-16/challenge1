package constructor;

public class Batch {
	String name;
	int male;
	int female;
	int strength;
	String trainer;
	 
public Batch(){
	this("appi", 30, 40, 50, "appi");
}

	

	public Batch(String name, int male, int female, int strength, String trainer) {
		
		this.name = name;
		this.male = male;
		this.female = female;
		this.strength = strength;
		this.trainer = trainer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Batch batch=new Batch("batch",50,50,50,"rakshith");
//System.out.println(batch.getTrainername());
	}
	public String getTrainername(){
		return this.trainer;
	}


}