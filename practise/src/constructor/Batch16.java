package constructor;

public class Batch16 extends Batch {
public  Batch16(int strength,int female,int male){
	super("batch",20,22,5,"megha");
	
}
public static void main(String[] args) {
	Batch16 b1=new Batch16(20,15,5);
	System.out.println(b1.getTrainername());
}
}