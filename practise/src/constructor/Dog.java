package constructor;

public class Dog extends Animal {
	public Dog(String eat,String rest,String sleep,String move){
		super(eat,rest,move,sleep);
	}
	public void dogname(){
		System.out.println("dog name is puppy");
	}
	public void eat(){
		System.out.println("dog eats our home food daily");
		
	}
	public void sleep(){
		System.out.println("dog sleep in our home");
	}
	public void rest(){
		System.out.println("it takes rest under our garden tree");
	}

}
