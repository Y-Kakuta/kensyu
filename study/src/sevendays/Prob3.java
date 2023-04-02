package sevendays;

/**
 * 基本問題3
 */
public class Prob3 {

	/**
	 * メイン関数
	 * @param args
	 */
	public static void main(String[] args) {
		Prob3 prob3 = new Prob3();

		System.out.println("prob3-1");
		prob3.prob3_1();
		System.out.println("");

		System.out.println("prob3-2");
		prob3.prob3_2();
		System.out.println("");

		System.out.println("prob3-3");
		prob3.prob3_3();
		System.out.println("");

		System.out.println("prob3-4");
		prob3.prob3_4();
		System.out.println("");

		System.out.println("prob3-5");
		prob3.prob3_5();
		System.out.println("");

		System.out.println("prob3-6");
		prob3.prob3_6();
		System.out.println("");

		System.out.println("prob3-7");
		prob3.prob3_7();
		System.out.println("");

		System.out.println("prob3-8");
		prob3.prob3_8();
		System.out.println("");

		System.out.println("prob3-9");
		prob3.prob3_9();
		System.out.println("");

		System.out.println("prob3-10");
		prob3.prob3_10();
		System.out.println("");

		System.out.println("prob3-11");
		prob3.prob3_11();
		System.out.println("");

		System.out.println("prob3-12");
		prob3.prob3_12();
		System.out.println("");

		System.out.println("prob3-13");
		prob3.prob3_13();
		System.out.println("");

		System.out.println("prob3-14");
		prob3.prob3_14();
		System.out.println("");

		System.out.println("prob3-15");
		prob3.prob3_15();
		System.out.println("");

		System.out.println("prob3-16");
		prob3.prob3_16();
		System.out.println("");

		System.out.println("prob3-17");
		prob3.prob3_17();
		System.out.println("");

		System.out.println("prob3-18");
		prob3.prob3_18();
		System.out.println("");
	}

	/**
	 * prob3-1
	 */
	private void prob3_1(){
		int random = (int)(Math.random()*10) + 1; // 1から10までの乱数を発生させる
		System.out.println("乱数 : " + random);

		if (random >= 5) {
			System.out.println("5以上です");
		}
	}

	/**
	 * prob3-2
	 */
	private void prob3_2(){
		int random = (int)(Math.random()*10) + 1; // 1から10までの乱数を発生させる
		System.out.println("乱数 : " + random);

		if (random != 1) {
			System.out.println("1ではありません");
		}
	}

	/**
	 * prob3-3
	 */
	private void prob3_3(){
		int random = (int)(Math.random()*100) + 1; // 1から100までの乱数を発生させる
		System.out.println("乱数 : " + random);

		if (random < 50) {
			System.out.println("50未満です");
		}
	}

	/**
	 * prob3-4
	 */
	private void prob3_4(){
		int random = (int)(Math.random()*100) + 1; // 1から100までの乱数を発生させる
		System.out.println("乱数 : " + random);

		if (random <= 10 || random <= 90) {
			System.out.println("10以下か90以上の値です");
		}
	}

	/**
	 * prob3-5
	 */
	private void prob3_5(){
		int random = (int)(Math.random()*100) + 1; // 1から100までの乱数を発生させる
		System.out.println("乱数 : " + random);

		if (20 <= random && random < 80) {
			System.out.println("20以上80未満です");
		}
	}

	/**
	 * prob3-6
	 */
	private void prob3_6(){
		int num = (int)(Math.random()*6)+1;    //  1から6までの乱数を発生させる
        System.out.println("数値 : " + num);

        if (num >= 3) {
        	System.out.println("3以上です。");

		}
	}

	/**
	 * prob3-7
	 */
	private void prob3_7(){
		int random = (int)(Math.random()*10) + 1; // 1から10までの乱数を発生させる
		System.out.println("乱数 : " + random);

		if (random >= 5) {
			System.out.println("5以上です");
		} else {
			System.out.println("5未満です");
		}
	}

	/**
	 * prob3-8
	 */
	private void prob3_8(){
		int random = (int)(Math.random()*10) + 1; // 1から10までの乱数を発生させる
		System.out.println("乱数 : " + random);

		if (random != 1) {
			System.out.println("1ではありません");
		} else {
			System.out.println("5です");
		}
	}

	/**
	 * prob3-9
	 */
	private void prob3_9(){
		int random = (int)(Math.random()*100) + 1; // 1から100までの乱数を発生させる
		System.out.println("乱数 : " + random);

		if (random < 50) {
			System.out.println("50未満です");
		} else {
			System.out.println("50以上です");
		}
	}

	/**
	 * prob3-10
	 */
	private void prob3_10(){
		int random = (int)(Math.random()*100) + 1; // 1から100までの乱数を発生させる
		System.out.println("乱数 : " + random);

		if (random <= 10 || random <= 90) {
			System.out.println("10以下か90以上の値です");
		} else {
			System.out.println("10より大きく90未満です");
		}
	}

	/**
	 * prob3-11
	 */
	private void prob3_11(){
		int random = (int)(Math.random()*100) + 1; // 1から100までの乱数を発生させる
		System.out.println("乱数 : " + random);

		if (20 <= random && random < 80) {
			System.out.println("20以上80未満です");
		} else {
			System.out.println("20未満か90以上です");
		}
	}

	/**
	 * prob3-12
	 */
	private void prob3_12(){
		int random = (int)(Math.random()*21) - 10; // -10から10までの乱数を発生させる
		System.out.println("乱数 : " + random);

		if (random < 0) {
			System.out.println("負の値です");
		} else if (0 < random) {
			System.out.println("正の値です");
		} else {
			System.out.println("0です");
		}
	}

	/**
	 * prob3-13
	 */
	private void prob3_13(){
		int random = (int)(Math.random()*3) + 1; // 1から3までの乱数を発生させる
		System.out.println("乱数 : " + random);

		switch (random) {
		case 1:
			System.out.println("グー");
			break;
		case 2:
			System.out.println("チョキ");
			break;
		case 3:
			System.out.println("パー");
			break;
		}
	}

	/**
	 * prob3-14
	 */
	private void prob3_14(){
		int a = (int)(Math.random()*10) + 1; // 1から10までの乱数を発生させる
		int b = (int)(Math.random()*10) + 1; // 1から10までの乱数を発生させる
		System.out.println("a : " + a);
		System.out.println("b : " + b);

		if (a > b) {
			System.out.println("aの方が大きいです");
		} else if (a < b) {
			System.out.println("bの方が大きいです");
		} else {
			System.out.println("等しいです");
		}
	}

	/**
	 * prob3-15
	 */
	private void prob3_15(){
		int random = (int)(Math.random()*100) + 1; // 1から100までの乱数を発生させる
		System.out.println("点数 : " + random);

		if (80 <= random) {
			System.out.println("優");
		} else if (70 <= random) {
			System.out.println("良");
		} else if (60 <= random) {
			System.out.println("可");
		} else {
			System.out.println("不可");
		}
	}

	/**
	 * prob3-16
	 */
	private void prob3_16(){
		int random = (int)(Math.random()*100) + 1; // 1から100までの乱数を発生させる
		System.out.println("乱数 : " + random);

		if (random % 6 == 0) {
			System.out.println("2と3の公倍数です");
		} else if (random % 2 == 0) {
			System.out.println("2の公倍数です");
		} else if (random % 3 == 0) {
			System.out.println("3の公倍数です");
		}
	}

	/**
	 * prob3-17
	 */
	private void prob3_17(){
		int random = (int)(Math.random()*100) + 1; // 1から100までの乱数を発生させる
		System.out.println("乱数 : " + random);

		if (random % 2 == 0) {
			if (random <= 50){
				System.out.println("50以下の偶数です");
			} else {
				System.out.println("偶数です");
			}
		} else if (random <= 50) {
			System.out.println("50以下です");
		}
	}

	/**
	 * prob3-18
	 */
	private void prob3_18(){
		int random = (int)(Math.random()*46) - 10; // -10から35までの乱数を発生させる
		System.out.println("摂氏  " + random + " 度");

		if (30 <= random) {
			System.out.println("真夏日です");
		} else if (25 <= random) {
			System.out.println("夏日です");
		} else if (random < 0){
			System.out.println("真冬日です");
		}
	}

}
