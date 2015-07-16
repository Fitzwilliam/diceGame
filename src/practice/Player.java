package practice;

public class Player {
	private String name;
	private int score=0;
	public Player(){}
	public Player(String name) {this.name= name;}
	public void setName(String name){
		this.name=name;
	}
	public void rollDice(){
		score+=Dice.makeNum();
	}
	public int getScore(){
		return this.score;
	}
	public String getName(){
		return name;
	}
	

}
