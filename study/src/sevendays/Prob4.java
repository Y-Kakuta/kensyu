package sevendays;

/**
 * 基本問題4
 */
public class Prob4 {

	/**
	 * メイン関数
	 * @param args
	 */
	public static void main(String[] args) {
		Prob4 prob4 = new Prob4();

		System.out.println("prob4-1");
		prob4.prob4_1();
		System.out.println("");

		System.out.println("prob4-2");
		prob4.prob4_2();
		System.out.println("");

		System.out.println("prob4-3");
		prob4.prob4_3();
		System.out.println("");

		System.out.println("prob4-4");
		prob4.prob4_4();
		System.out.println("");

		System.out.println("prob4-5");
		prob4.prob4_5();
		System.out.println("");

		System.out.println("prob4-6");
		prob4.prob4_6();
		System.out.println("");

		System.out.println("prob4-7");
		prob4.prob4_7();
		System.out.println("");

		System.out.println("prob4-8");
		prob4.prob4_8();
		System.out.println("");

		System.out.println("prob4-9");
		prob4.prob4_9();
		System.out.println("");

		System.out.println("prob4-10");
		prob4.prob4_10();
		System.out.println("");

		System.out.println("prob4-11");
		prob4.prob4_11();
		System.out.println("");

		System.out.println("prob4-12");
		prob4.prob4_12();
		System.out.println("");

		System.out.println("prob4-13");
		prob4.prob4_13();
		System.out.println("");

		System.out.println("prob4-14");
		prob4.prob4_14();
		System.out.println("");

		System.out.println("prob4-15");
		prob4.prob4_15();
		System.out.println("");

		System.out.println("prob4-16");
		prob4.prob4_16();
		System.out.println("");

		System.out.println("prob4-17");
		prob4.prob4_17();
		System.out.println("");

		System.out.println("prob4-18");
		prob4.prob4_18();
		System.out.println("");
	}

	/**
	 * prob4-1
	 */
	private void prob4_1(){
		int random = (int)(Math.random()*10) + 1; // 1から10までの乱数を発生させる
		System.out.println("乱数 : " + random);

		for (int i = 0; i < random; i++) {
			System.out.print("■");
		}
		System.out.println("");
	}

	/**
	 * prob4-2
	 */
	private void prob4_2(){
		int random = (int)(Math.random()*10) + 1; // 1から10までの乱数を発生させる
		System.out.println("乱数 : " + random);

		int i = 0;
		while (i < random) {
			System.out.print("■");
			i++;
		}
		System.out.println("");
	}

	/**
	 * prob4-3
	 */
	private void prob4_3(){
		int random = (int)(Math.random()*10) + 1; // 1から10までの乱数を発生させる
		System.out.println("乱数 : " + random);
		int i = 0;

		do {
			System.out.print("■");
			i++;
		} while (i < random);
		System.out.println("");
	}

	/**
	 * prob4-4
	 */
	private void prob4_4(){
		int a = 0;

		while (a < 4) {
			System.out.println("a = " + a);
			a++;
		}
	}

	/**
	 * prob4-5
	 */
	private void prob4_5(){
		for (int a = 0; a < 4; a++){
			System.out.println("a = " + a);
		}
	}

	/**
	 * prob4-6
	 */
	private void prob4_6(){
		int a = 3;
		while (-1 < a) {
			System.out.println("a = " + a);
			a--;
		}
	}

	/**
	 * prob4-7
	 */
	private void prob4_7(){
		for (int a = 3; -1 < a; a--){
			System.out.println("a = " + a);
		}
	}

	/**
	 * prob4-8
	 */
	private void prob4_8(){
		while (true) {
			int random = (int)(Math.random()*10) + 1; // 1から10までの乱数を発生させる
			System.out.println(random);
			if (random == 10) {
				break;
			}
		}
		System.out.println("終了します");
	}

	/**
	 * prob4-9
	 */
	private void prob4_9(){
		while (true) {
			int random = (int)(Math.random()*100) + 1; // 1から100までの乱数を発生させる
			System.out.println(random);
			if (random % 10 == 0) {
				break;
			}
		}
		System.out.println("終了します");
	}

	/**
	 * prob4-10
	 */
	private void prob4_10(){
		for (int i = 0; i < 5; i++){
			int random = (int)(Math.random()*100) + 1; // 1から100までの乱数を発生させる
			System.out.println(random);
		}
	}

	/**
	 * prob4-11
	 */
	private void prob4_11(){
		int max = 0;

		for (int i = 0; i < 5; i++){
			int random = (int)(Math.random()*100) + 1; // 1から100までの乱数を発生させる
			System.out.println(random);

			if (max < random){
				// randomが大きいとき、最大値を更新
				max = random;
			}
		}
		System.out.println("最大値 : " + max);
	}

	/**
	 * prob4-12
	 */
	private void prob4_12(){
		int min = 100;

		for (int i = 0; i < 5; i++){
			int random = (int)(Math.random()*100) + 1; // 1から100までの乱数を発生させる
			System.out.println(random);

			if (random < min){
				// randomが小さいとき、最小値を更新
				min = random;
			}
		}
		System.out.println("最小値 : " + min);
	}

	/**
	 * prob4-13
	 */
	private void prob4_13(){
		int random = (int)(Math.random()*10) + 1; // 1から10までの乱数を発生させる

		if (random >= 5) {
			// 5以上の場合
			for (int i = 0; i < random; i++){
				System.out.print("★");
			}
			System.out.println("");

		} else {
			// 5未満の場合
			System.out.println("乱数 : " + random);
		}
	}

	/**
	 * prob4-14
	 */
	private void prob4_14(){
		int random = (int)(Math.random()*10) + 1; // 1から10までの乱数を発生させる

		if (random % 2 == 0 ) {
			// 偶数の場合
			for (int i = 0; i < random; i++){
				System.out.print("★");
			}
		} else {
			// 奇数の場合
			for (int i = 0; i < random; i++){
				System.out.print("☆");
			}
		}
		System.out.println("");
	}

	/**
	 * prob4-15
	 */
	private void prob4_15(){
		for (int i = 1; i < 101; i++){

			// 数字の挿入
			if (i < 10) {
				// 桁数の調整
				System.out.print(" ");
			}
			if (i < 100) {
				// 桁数の調整
				System.out.print(" ");
			}
			System.out.print(i);

			// 数字の後ろの処理
			if (i % 10 == 0){
				// 10の倍数で改行
				System.out.println("");
			} else {
				System.out.print(" ");
			}
		}
	}

	/**
	 * prob4-16
	 */
	private void prob4_16(){

		// i * j の繰り返し
		for (int i = 1; i < 10; i++){
			for (int j = 1; j < 10; j++){
				// 掛け算の表示
				System.out.print( i + "*" + j + "=");

				// 計算結果の表示
				if (i * j < 10) {
					// 桁数の調整
					System.out.print(" ");
				}
				System.out.print((i * j) + " ");
			}
			System.out.println("");
		}
	}

	/**
	 * prob4-17
	 */
	private void prob4_17(){
		// 縦横の個数
		int rows = 10;

		// i:縦, j:横
		for (int i = 0; i < rows; i++){
			for (int j = 0; j < rows; j++){
				if (i < j) {
					System.out.print("□");
				} else {
					System.out.print("■");
				}
			}
			System.out.println("");
		}
	}

	/**
	 * prob4-18
	 */
	private void prob4_18(){
		// 縦横の個数
		int rows = 10;

		// i:縦, j:横
		for (int i = 0; i < rows; i++){
			for (int j = 0; j < rows; j++){
				if (i == j) {
					System.out.print("□");
				} else {
					System.out.print("■");
				}
			}
			System.out.println("");
		}
	}

}
