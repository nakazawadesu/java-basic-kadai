package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {

	String[] choice = {"グー", "チョキ", "パー"};

	// 自分のじゃんけんの手を入力する
	public String getMyChoice() {
		System.out.println("自分のじゃんけんの手を入力しましょう\r\n" +
						   	"グーはrockのrを入力しましょう\r\n" +
							"チョキはscissorsのsを入力しましょう\r\n" +
						   	"パーはpaperのpを入力しましょう");
		
		Scanner scanner = new Scanner(System.in);
		
		String myChoice = scanner.next();
		
		if(myChoice.equals("r") || myChoice.equals("s") || myChoice.equals("p")) {
			return myChoice;
		} else {
			System.out.println("無効な選択です");
			return getMyChoice();
		}
	}
		
	
	// 対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRandom() {
		
		int num = (int) Math.floor(Math.random() * choice.length); 
				
		String[] choice = {"r", "s", "p"};
		return choice[num];
	}
	
	// じゃんけんを行う
	public void playGame() {
		String myChoice = getMyChoice();
		String rivalChoice = getRandom();
		
		HashMap<String, String> handMap = new HashMap<String, String>();
		handMap.put("r", "グー");
		handMap.put("s", "チョキ");
		handMap.put("p", "パー");
		
		System.out.println("自分の手は" + handMap.get(myChoice));
		System.out.println("対戦相手の手は" + handMap.get(rivalChoice));
		
		if(myChoice.equals(rivalChoice)) {
			System.out.println("あいこです");
		} else if((myChoice.equals("r")&&rivalChoice.equals("s"))||(myChoice.equals("s")&&rivalChoice.equals("p"))||(myChoice.equals("p")&&rivalChoice.equals("r"))){
			System.out.println("自分の勝ちです");
		} else {
			System.out.println("自分の負けです");
		} 
	}

}
