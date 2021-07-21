package constructor;

public class Animal {
	private String eat;
	private String rest;
	private String move;
	private String sleep;
	
	
	public String getEat() {
		return eat;
	}
	public void setEat(String eat) {
		this.eat = eat;
	}
	public String getRest() {
		return rest;
	}
	public void setRest(String rest) {
		this.rest = rest;
	}
	public String getMove() {
		return move;
	}
	public void setMove(String move) {
		this.move = move;
	}
	public String getSleep() {
		return sleep;
	}
	public void setSleep(String sleep) {
		this.sleep = sleep;
	}
	public Animal(String eat,String rest,String move, String sleep){
		this.eat=eat;
		this.sleep=sleep;
		this.move=move;
		this.rest=rest;
	}
	 
	

}
