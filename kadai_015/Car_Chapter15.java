package kadai_015;

public class Car_Chapter15 {
	
	// 車クラス
	private int gear  = 1;  // ギア数
	private int speed = 10; // 速度
	
	// メソッドの作成
	// ギアの値より速度を変える
	public void gearChange(int afterGear) {
		this.gear = afterGear;
		this.speed = switch(gear) {
		case 1 -> 10;
		case 2 -> 20;
		case 3 -> 30;
		case 4 -> 40;
		case 5 -> 50;
		default -> 10;
		};
	}
	
	// ギアチェンジ後の速度を表示する
	public void run() {
		System.out.println("ギアは" + gear + "です");
		System.out.println("速度は時速" + speed + "km");
	}

}
