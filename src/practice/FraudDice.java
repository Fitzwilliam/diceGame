package practice;

public class FraudDice {
	private int level;
	
	public int makeNum(){
		int num;
		switch (this.level){
		case 0: return (int)(Math.random()*6+1);
		case 1: {
			do{
			num=normalMakeNum();
		}
		while(num>=5);
		return num;
		}
		case 2:{
			do{
				num=normalMakeNum();
			}
			while(num<=2);
			return num;
		}
		default :
			return 0;
		}
	}
	public int normalMakeNum(){
		return (int)(Math.random()*6+1);
	}
	public void setLevel(int level){
		this.level=level;
	}
	public int getLevel(){
		return this.level;
	}
}
