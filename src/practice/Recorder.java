package practice;

public class Recorder {
	
	public void speak(Player player,FraudPlayer fplayer){
		String flevel=fplayer.getDiceLevel();
		fplayer.adjustLevel();
		System.out.println(player.getName()+player.getScore()+fplayer.getName()+fplayer.getScore()+flevel);
	}
}
