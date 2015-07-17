package practice;

public class FraudPlayer {
	Player opp;
	FraudDice dice=new FraudDice();
	private String name;
	private int score;

	
	public FraudPlayer(String name){
		this.name=name;
		dice.setLevel(0);
	}
	public void setOpp(Player opp){
		this.opp=opp;
	}
	
	public void rollDice(){
		score+=dice.makeNum();
	}
	public void adjustLevel(){
		if(opp.getScore()>this.score){
			dice.setLevel(2);
		}
		else if(opp.getScore()+6<=this.score){
			dice.setLevel(1);
		}
		else
			dice.setLevel(0);
	}
	

	public String getName(){
		return name;
	}
	public int getScore(){
		return score;
	}
	public String getDiceLevel(){
		int level=dice.getLevel();
		switch (level){
			case 0:
				return "[NORMAL]";
			case 1:
				return "[WEAK]";
			case 2:
				return "[STRONG]";
				default : 
					return "";
		}
	}
}
