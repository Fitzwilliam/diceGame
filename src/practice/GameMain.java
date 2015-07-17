package practice;

import java.util.Scanner;

public class GameMain {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		Judge judge = new Judge();
		String name1=scan.nextLine();
		judge.apply(name1);
		String name2=scan.nextLine();
		judge.fraoudApply(name2);
		judge.setNum(5);
		
		judge.start();
		judge.scoring();
	}
}
