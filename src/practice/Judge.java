package practice;

import java.util.ArrayList;

public class Judge {
	ArrayList list = new ArrayList();
	Recorder speaker = new Recorder();
	private int num;
	
	public void setNum(int num){
		this.num=num;
	}
	
	public void apply(String name){
		Player player = new Player(name);
		list.add(player);
	}
	public void fraoudApply(String name){
		FraudPlayer fplayer = new FraudPlayer(name);
		list.add(fplayer);
		fplayer.setOpp(((Player)list.get(0)));
	}
	public void speak(Recorder speaker){
		speaker.speak((Player)(list.get(0)),(FraudPlayer)(list.get(1)));
	}
	public void scoring(){

		String winner = ((Player) list.get(0)).getScore() > ((FraudPlayer) list.get(1)).getScore()? ((Player) list.get(0)).getName() : ((FraudPlayer) list.get(1)).getName() ;
		System.out.println(winner+"ÀÇ ½Â¸®.");
	}
	
	public void start(){
		int i=0;
		for(i=0;i<this.num;i++){
			((Player)(list.get(0))).rollDice();
			((FraudPlayer)(list.get(1))).rollDice();
			speaker.speak((Player)(list.get(0)),(FraudPlayer)(list.get(1)));
		}
	}

}
