package sevendays;

/**
 * 基本問題5
 */
public class Prob5 {

	/**
	 * メイン関数
	 * @param args
	 */
	public static void main(String[] args) {
		Prob5 prob5 = new Prob5();

		System.out.println("prob5-1");
		prob5.prob5_1();
		System.out.println("");

		System.out.println("prob5-2");
		prob5.prob5_2();
		System.out.println("");

		System.out.println("prob5-3");
		prob5.prob5_3();
		System.out.println("");

		System.out.println("prob5-4");
		prob5.prob5_4();
		System.out.println("");

		System.out.println("prob5-5");
		prob5.prob5_5();
		System.out.println("");

		System.out.println("prob5-6");
		prob5.prob5_6();
		System.out.println("");

		System.out.println("prob5-7");
		prob5.prob5_7();
		System.out.println("");

		System.out.println("prob5-8");
		prob5.prob5_8();
		System.out.println("");

		System.out.println("prob5-9");
		prob5.prob5_9();
		System.out.println("");

		System.out.println("prob5-10");
		prob5.prob5_10();
		System.out.println("");

		System.out.println("prob5-11");
		prob5.prob5_11();
		System.out.println("");

		System.out.println("prob5-12");
		prob5.prob5_12();
		System.out.println("");

		System.out.println("prob5-13");
		prob5.prob5_13();
		System.out.println("");
	}

	/**
	 * prob5-1
	 */
	private void prob5_1(){
		int[] a = new int[7];

		for (int i = 0; i < a.length; i++){
			a[i] = (int)(Math.random()*10) + 1; // 1から10までの乱数を発生させる
			System.out.println("a[" + i + "]=" + a[i]);
		}
	}

	/**
	 * prob5-2
	 */
	private void prob5_2(){
		double[] d = {0.2, -5.1, 3.2, 1.8};
		for (int i = 0; i < d.length; i++){
			System.out.println("d[" + i + "]=" + d[i]);
		}
	}

	/**
	 * prob5-3
	 */
	private void prob5_3(){
		int[] data = new int[10];

		for (int i = 0; i < data.length; i++){
			data[i] = (int)(Math.random()*100) + 1; // 1から100までの乱数を発生させる
			System.out.print(data[i] + " ");
		}
		System.out.println("");

		// 奇数の出力
		System.out.print("奇数 : ");
		for (int i = 0; i < data.length; i++){
			if (data[i] % 2 == 1) {
				System.out.print(data[i] + " ");
			}
		}
		System.out.println("");

		// 偶数の出力
		System.out.print("偶数 : ");
		for (int i = 0; i < data.length; i++){
			if (data[i] % 2 == 0) {
				System.out.print(data[i] + " ");
			}
		}
		System.out.println("");
	}

	/**
	 * prob5-4
	 */
	private void prob5_4(){
		int[] data = new int[10];

		for (int i = 0; i < data.length; i++){
			data[i] = (int)(Math.random()*100) + 1; // 1から100までの乱数を発生させる
			System.out.print(data[i] + " ");
		}
		System.out.println("");

		// 50以上の出力
		System.out.print("50以上の数 : ");
		for (int i = 0; i < data.length; i++){
			if (data[i] >= 50) {
				System.out.print(data[i] + " ");
			}
		}
		System.out.println("");

		// 50未満の出力
		System.out.print("50未満の数 : ");
		for (int i = 0; i < data.length; i++){
			if (data[i] < 50) {
				System.out.print(data[i] + " ");
			}
		}
		System.out.println("");
	}

	/**
	 * prob5-5
	 */
	private void prob5_5(){
		int[] data = new int[10];

		for (int i = 0; i < data.length; i++){
			data[i] = (int)(Math.random()*10) + 1; // 1から10までの乱数を発生させる
			System.out.print(data[i] + " ");
		}
		System.out.println("");

		// 3の倍数の出力
		System.out.print("3の倍数 : ");
		for (int i = 0; i < data.length; i++){
			if (data[i] % 3 == 0) {
				System.out.print(data[i] + " ");
			}
		}
		System.out.println("");

		// 3の倍数以外の出力
		System.out.print("3の倍数以外 : ");
		for (int i = 0; i < data.length; i++){
			if (data[i] % 3 != 0) {
				System.out.print(data[i] + " ");
			}
		}
		System.out.println("");
	}

	/**
	 * prob5-6
	 */
	private void prob5_6(){
		int[] data = new int[10];
		int min = 10;
		int max = 0;
		double sum = 0;

		for (int i = 0; i < data.length; i++){
			data[i] = (int)(Math.random()*10) + 1; // 1から10までの乱数を発生させる
			System.out.print(data[i] + " ");

			// データの更新
			if (data[i] < min) {
				min = data[i];
			}
			if (max < data[i]){
				max = data[i];
			}
			sum += data[i];
		}
		System.out.println("");

		System.out.println("最大値 : " + max);
		System.out.println("最小値 : " + min);
		System.out.println("平均値 : " + (sum / data.length));
	}

	/**
	 * prob5-7
	 */
	private void prob5_7(){
		int[] data = new int[5];
		double sum = 0;

		for (int i = 0; i < data.length; i++){
			data[i] = (int)(Math.random()*10) + 1; // 1から10までの乱数を発生させる
			System.out.print(data[i] + " ");

			// データの更新
			sum += data[i];
		}
		System.out.println("");

		System.out.println("合計値 : " + sum);
		double ave = sum / data.length;
		System.out.println("平均値 : " + ave);

		// 平均より大きい数の検索
		System.out.print("平均値より大きい数 : ");
		for (int i = 0; i < data.length; i++){
			if (ave < data[i]) {
				System.out.print(data[i] + " ");
			}
		}
		System.out.println("");

		// 平均より小さい数の検索
		System.out.print("平均値より小さい数 : ");
		for (int i = 0; i < data.length; i++){
			if (data[i] < ave) {
				System.out.print(data[i] + " ");
			}
		}
		System.out.println("");
	}

	/**
	 * prob5-8
	 */
	private void prob5_8(){
		int[] data = new int[5];
		// 個数
		int plus = 0;
		int minus = 0;
		int zero = 0;

		for (int i = 0; i < data.length; i++){
			data[i] = (int)(Math.random()*21) - 10; // -10から10までの乱数を発生させる
			System.out.print(data[i] + " ");
			if (data[i] < 0) {
				minus++;
			} else if (0 < data[i]){
				plus++;
			} else {
				zero++;
			}
		}
		System.out.println("");

		System.out.println("0より大きい数 : " + plus + "個");
		System.out.println("0より小さい数 : " + minus + "個");
		System.out.println("0の個数 : " + zero + "個");

	}

	/**
	 * prob5-9
	 */
	private void prob5_9(){
		int[] data = new int[10];

		for (int i = 0; i < data.length; i++){
			data[i] = (int)(Math.random()*100) + 1; // 1から100までの乱数を発生させる
			System.out.print(data[i] + " ");
		}
		System.out.println("");

		// 50以上の出力
		System.out.print("50以上の数 : ");
		for (int i = 0; i < data.length; i++){
			if (data[i] >= 50) {
				System.out.print(data[i] + " ");
			}
		}
		System.out.println("");

		// 50未満の出力
		System.out.print("50未満の数 : ");
		for (int i = 0; i < data.length; i++){
			if (data[i] < 50) {
				System.out.print(data[i] + " ");
			}
		}
		System.out.println("");
	}

	/**
	 * prob5-10
	 */
	private void prob5_10(){
		int[] data = new int[7];

		for (int i = 0; i < data.length; i++){
			data[i] = (int)(Math.random()*10) + 1; // 1から10までの乱数を発生させる
			System.out.print(data[i] + " ");
		}
		System.out.println("");

		// *を出力
		for (int i = 0; i < data.length; i++){
			for (int j = 0; j < data[i]; j++){
				System.out.print("*");
			}
			System.out.println("");
		}

	}

	/**
	 * prob5-11
	 */
	private void prob5_11(){
		int[] data = new int[5];

		for (int i = 0; i < data.length; i++){
			data[i] = (int)(Math.random()*100) + 1; // 1から100までの乱数を発生させる
			System.out.print(data[i] + " ");
		}
		System.out.println("");

		// 0以上60未満の出力
		System.out.print("0以上60未満 : ");
		for (int i = 0; i < data.length; i++){
			if (0 <= data[i] && data[i] < 60) {
				System.out.print(data[i] + " ");
			}
		}
		System.out.println("");

		// 60以上80未満の出力
		System.out.print("60以上80未満 : ");
		for (int i = 0; i < data.length; i++){
			if (60 <= data[i] && data[i] < 80) {
				System.out.print(data[i] + " ");
			}
		}
		System.out.println("");

		// 80以上の出力
		System.out.print("80以上 : ");
		for (int i = 0; i < data.length; i++){
			if (80 <= data[i]) {
				System.out.print(data[i] + " ");
			}
		}
		System.out.println("");
	}

	/**
	 * prob5-12
	 */
	private void prob5_12(){
		int[][] data = new int[3][3];

		for (int i = 0; i < data.length; i++){
			for (int j = 0; j < data[i].length; j++){
				data[i][j] = (int)(Math.random()*10); // 0から9までの乱数を発生させる
				System.out.print(data[i][j] + " ");
			}
			System.out.println("");
		}
	}

	/**
	 * prob5-13
	 */
	private void prob5_13(){
		int[][] data = new int[3][3];
		int max = 0;
		int min = 9;

		for (int i = 0; i < data.length; i++){
			for (int j = 0; j < data[i].length; j++){
				data[i][j] = (int)(Math.random()*10); // 0から9までの乱数を発生させる
				System.out.print(data[i][j] + " ");

				// データの更新
				if (max < data[i][j]) {
					max = data[i][j];
				}
				if (data[i][j] < min) {
					min = data[i][j];
				}
			}
			System.out.println("");
		}
		System.out.println("最大値 : " + max);
		System.out.println("最小値 : " + min);
	}

}
