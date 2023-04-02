package sevendays;

/**
 * 基本問題3
 */
public class Prob8 {

	/**
	 * メイン関数
	 * @param args
	 */
	public static void main(String[] args) {
		Prob8 prob8 = new Prob8();

		System.out.println("prob8-1");
		prob8.prob8_1();
		System.out.println("");

		System.out.println("prob8-2");
		prob8.prob8_2();
		System.out.println("");

		System.out.println("prob8-3");
		prob8.prob8_3();
		System.out.println("");

		System.out.println("prob8-4");
		prob8.prob8_4();
		System.out.println("");

		System.out.println("prob8-5");
		prob8.prob8_5();
		System.out.println("");

		System.out.println("prob8-6");
		prob8.prob8_6();
		System.out.println("");

		System.out.println("prob8-7");
		prob8.prob8_7();
		System.out.println("");

		System.out.println("prob8-8");
		prob8.prob8_8();
		System.out.println("");

		System.out.println("prob8-9");
		prob8.prob8_9();
		System.out.println("");

		System.out.println("prob8-10");
		prob8.prob8_10();
		System.out.println("");

		System.out.println("prob8-11");
		prob8.prob8_11();
		System.out.println("");

		System.out.println("prob8-12");
		prob8.prob8_12();
		System.out.println("");

		System.out.println("prob8-13");
		prob8.prob8_13();
		System.out.println("");

		System.out.println("prob8-14");
		prob8.prob8_14();
		System.out.println("");

		System.out.println("prob8-15");
		prob8.prob8_15();
		System.out.println("");

		System.out.println("prob8-16");
		prob8.prob8_16();
		System.out.println("");

		System.out.println("prob8-17");
		prob8.prob8_17();
		System.out.println("");

		System.out.println("prob8-18");
		prob8.prob8_18();
		System.out.println("");
	}

	/**
	 * prob8-1
	 */
	private void prob8_1(){
		int count = 0;
		for (int a = 1; a < 100; a++){
			for (int b = 1; b < 100; b++){
				for (int c = 1; c < 100; c++){
					if (a*a + b*b == c*c) {
						count++;
						System.out.println("a=" + a + ",b=" + b + ",c=" + c);
					}
				}
			}
		}
		System.out.println("個数 : " + count + "個");
	}

	/**
	 * prob8-2
	 */
	private void prob8_2(){
		int count = 0;
		for (int a = 1; a < 100; a++){
			for (int b = a; b < 100; b++){
				for (int c = b; c < 100; c++){
					if (a*a + b*b == c*c) {
						count++;
						System.out.println("a=" + a + ",b=" + b + ",c=" + c);
					}
				}
			}
		}
		System.out.println("個数 : " + count + "個");
	}

	/**
	 * prob8-3
	 */
	private void prob8_3(){
		int num = 6;

		int ans = 1;
		for (int i = num; 0 < i; i--){
			ans *= i;
		}
		System.out.println(num + "! = " + ans);
	}

	/**
	 * prob8-4
	 */
	private void prob8_4(){
		int random = (int)(Math.random()*1000) + 1; // 1から1000までの乱数を発生させる
		System.out.println("乱数 : " + random);
		int col = 0;
		do {
			col++;
			random /= 10;
		} while (random != 0);
		System.out.println(col + "桁");
	}

	/**
	 * prob8-5
	 */
	private void prob8_5(){
		for (int i = 1; i < 101; i++){
			if (i % 3 == 0) {
				// 3で割り切れる場合
				System.out.print(i + " ");
			} else if (30 <= i && i < 40) {
				// 30~39の場合
				System.out.print(i + " ");
			} else if (i - (i/10*10) == 3) {
				// 1の位が3の場合
				System.out.print(i + " ");
			}
		}
		System.out.println("");
	}

	/**
	 * prob8-6
	 */
	private void prob8_6(){
		int u1 = (int)(Math.random()*10) + 1; // 1から10までの乱数を発生させる
		int u2 = (int)(Math.random()*10) + 1; // 1から10までの乱数を発生させる
		int d1 = (int)(Math.random()*9) + 2; // 2から10までの乱数を発生させる
		int d2 = (int)(Math.random()*9) + 2; // 2から10までの乱数を発生させる

		int calUp = u1 * d2 + u2 * d1; // 分子
		int calDown = d1 * d2; // 分母
		int n = 0; // 整数部分

		// 整数部分の計算
		while (calUp >= calDown){
			n++;
			calUp -= calDown;
		}

		// 約分の処理
		for (int i = calDown; 1 < i; i--){
			while (calUp % i == 0 && calDown % i == 0){
				calDown /= i;
				calUp /= i;
			}
		}

		// 出力部分
		System.out.print(u1 + "/" + d1 + " + " + u2 + "/" + d2 + " = ");
		if (n != 0) {
			System.out.print(n);
			if (calUp != 0){
				System.out.print(".");
			}
		}
		if (calUp != 0){
			System.out.print(calUp + "/" + calDown);
		}
		System.out.println("");

	}

	/**
	 * prob8-7
	 */
	private void prob8_7(){
		int u1 = (int)(Math.random()*10) + 1; // 1から10までの乱数を発生させる
		int u2 = (int)(Math.random()*10) + 1; // 1から10までの乱数を発生させる
		int n1 = 0;
		int d1 = (int)(Math.random()*10) + 1; // 1から10までの乱数を発生させる
		int d2 = (int)(Math.random()*10) + 1; // 1から10までの乱数を発生させる
		int n2 = 0;

		int calUp = u1 * d2 + u2 * d1; // 分子
		int calDown = d1 * d2; // 分母
		int n = 0; // 整数部分

		// 整数部分の計算
		while (calUp >= calDown){
			n++;
			calUp -= calDown;
		}

		// 約分の処理
		for (int i = calDown; 1 < i; i--){
			while (calUp % i == 0 && calDown % i == 0){
				calDown /= i;
				calUp /= i;
			}
		}

		// 出力前の整数の整理
		while (u1 >= d1){
			n1++;
			u1 -= d1;
		}
		while (u2 >= d2){
			n2++;
			u2 -= d2;
		}

		// 出力部分
		// 最初の分数
		if (n1 != 0) {
			System.out.print(n1);
			if (u1 != 0){
				System.out.print(".");
			}
		}
		if (u1 != 0){
			System.out.print(u1 + "/" + d1);
		}

		System.out.print(" + ");

		// 次の分数
		if (n2 != 0) {
			System.out.print(n2);
			if (u2 != 0){
				System.out.print(".");
			}
		}
		if (u2 != 0){
			System.out.print(u2 + "/" + d2);
		}

		System.out.print(" = ");

		// 計算後の分数
		if (n != 0) {
			System.out.print(n);
			if (calUp != 0){
				System.out.print(".");
			}
		}
		if (calUp != 0){
			System.out.print(calUp + "/" + calDown);
		}
		System.out.println("");
	}

	/**
	 * prob8-8
	 */
	private void prob8_8(){
		int random = (int)(Math.random()*1000) + 1; // 1から1000までの乱数を発生させる
		System.out.println("乱数 : " + random);

		System.out.print("約数 : ");
		for (int i = 1; i <= random; i++) {
			if (random % i == 0) {
				System.out.print(i + " ");
			}

		}
		System.out.println("");
	}

	/**
	 * prob8-9
	 */
	private void prob8_9(){
		System.out.println("完全数");
		for (int num = 1; num < 10001; num++){
			int sum = 0;
			for (int i = 1; i<= num; i++){
				if (num % i == 0 && num != i) {
					sum += i;
				}
			}
			if (sum == num) {
				System.out.println(sum);
			}
		}
	}

	/**
	 * prob8-10 数値の分類
	 */
	private void prob8_10(){
		int[] a = new int[10];
		int cntOdd = 0;
		int cntEven = 0;
		for (int i = 0; i < a.length; i++){
			a[i] = (int)(Math.random()*100) + 1; // 1から100までの乱数を発生させる
			System.out.print(a[i] + " ");
			if (a[i] % 2 == 0) {
				cntEven++;
			} else {
				cntOdd++;
			}
		}
		System.out.println("");

		// 配列の宣言
		int[] odd = new int[cntOdd];
		int[] even = new int[cntEven];
		int indOdd = 0;
		int indEven = 0;

		// 配列の作成
		for (int i = 0; i < a.length; i++){
			if (a[i] % 2 == 0) {
				even[indEven] = a[i];
				indEven++;
			} else {
				odd[indOdd] = a[i];
				indOdd++;
			}
		}

		// 配列の出力
		System.out.print("偶数 : ");
		for (int i = 0; i < even.length; i++){
			System.out.print(even[i] + " ");
		}
		System.out.println("");
		System.out.print("奇数 : ");
		for (int i = 0; i < odd.length; i++){
			System.out.print(odd[i] + " ");
		}
		System.out.println("");
	}

	/**
	 * prob8-11 フィボナッチ数列
	 */
	private void prob8_11(){
		int a1 = 1;
		int a2 = 1;
		int cal = a1 + a2;
		int count = 3;

		System.out.print(a1 + " " + a2 + " " + cal + " ");
		while (count < 40){
			// 計算の対象を繰り上げる
			a1 = a2;
			a2 = cal;
			cal = a1 + a2;
			System.out.print(cal + " ");
			count++;
		}
		System.out.println("");

	}

	/**
	 * prob8-12 トリボナッチ数列
	 */
	private void prob8_12(){
		int a1 = 1;
		int a2 = 1;
		int a3 = 2;
		int cal = a1 + a2 + a3;
		int count = 4;

		System.out.print(a1 + " " + a2 + " " + a3 + " " + cal + " ");
		while (count < 30){
			// 計算の対象を繰り上げる
			a1 = a2;
			a2 = a3;
			a3 = cal;
			cal = a1 + a2 + a3;
			System.out.print(cal + " ");
			count++;
		}
		System.out.println("");
	}

	/**
	 * prob8-13 集合
	 */
	private void prob8_13(){
		int[] a = new int[10];
		System.out.print("配列1 : ");
		for (int i = 0; i < a.length; i++){
			a[i] = (int)(Math.random()*10) + 1; // 1から10までの乱数を発生させる
			System.out.print(a[i] + " ");
		}
		System.out.println("");

		int[] b = new int[10];
		System.out.print("配列2 : ");
		for (int i = 0; i < b.length; i++){
			b[i] = (int)(Math.random()*10) + 1; // 1から10までの乱数を発生させる
			System.out.print(b[i] + " ");
		}
		System.out.println("");

		// 共通の値を検索
		System.out.print("共通の数 : ");
		for (int i = 1; i < 11; i++){
			boolean checkA = false;
			boolean checkB = false;
			// aの確認
			for (int j = 0; j < a.length; j++){
				if (a[j] == i) {
					checkA = true;
					break;
				}
			}
			// bの確認
			for (int j = 0; j < b.length; j++){
				if (b[j] == i) {
					checkB = true;
					break;
				}
			}
			if (checkA && checkB) {
				System.out.print(i + " ");
			}
		}
		System.out.println("");

		// どちらかに入っているの値を検索
		System.out.print("どちらかに入っている数 : ");
		for (int i = 1; i < 11; i++){
			boolean checkA = false;
			// aの確認
			for (int j = 0; j < a.length; j++){
				if (a[j] == i) {
					checkA = true;
					System.out.print(i + " ");
					break;
				}
			}
			if (!checkA) {
				// aになかった場合、bの確認
				for (int j = 0; j < b.length; j++){
					if (b[j] == i) {
						System.out.print(i + " ");
						break;
					}
				}
			}
		}
		System.out.println("");
	}

	/**
	 * prob8-14 エラトステネスのふるい
	 */
	private void prob8_14(){
		// 最初の配列を作成
		int[] num = new int[99];
		for (int i = 0; i < num.length; i++){
			num[i] = i + 2;
		}

		while (num.length != 0){
			System.out.print(num[0] + " ");

			// 配列に残ってて、iの倍数ではないものをカウントする
			int count = 0;
			for (int j = 0; j < num.length; j++){
				if (num[j] % num[0] != 0) {
					count++;
				}
			}

			// カウント結果を使って新しい配列を作成する
			int[] numNew = new int[count];
			count = 0;
			for (int j = 0; j < num.length; j++){
				if (num[j] % num[0] != 0) {
					numNew[count] = num[j];
					count++;
				}
			}

			// 配列とmaxを現在のものにして次の処理に移行する
			num = numNew;
		}
		System.out.println("");

	}

	/**
	 * prob8-15 素因数分解
	 */
	private void prob8_15(){
		int random = (int)(Math.random()*100) + 1; // 2から100までの乱数を発生させる
		System.out.print(random + " = ");
		for (int i = 2; i <= random; i++){
			while (random % i == 0) {
				random /= i;
				System.out.print(i);
				if (random != 1) {
					System.out.print(" * ");
				}
			}
		}
		System.out.println("");
	}

	/**
	 * prob8-16 並び替え
	 */
	private void prob8_16(){
		int[] a = new int[10];
		for (int i = 0; i < a.length; i++){
			a[i] = (int)(Math.random()*100) + 1; // 1から100までの乱数を発生させる
		}

		// 並び替え
		for (int i= 0; i < a.length - 1; i++){
			int maxN = 0;
			int maxI = 0;
			for (int j = i ; j < a.length; j++){
				if (a[j] > maxN) {
					maxN = a[j];
					maxI = j;
				}
			}
			int sub = a[i];
			a[i] = a[maxI];
			a[maxI] = sub;
		}

		// 出力
		for (int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");
		}
		System.out.println("");
	}

	/**
	 * prob8-17 友愛数
	 */
	private void prob8_17(){
		for (int num = 1; num < 10001; num++){
			// 約数の和の計算
			int sum = 0;
			for (int i = 1; i<= num; i++){
				if (num % i == 0 && num != i) {
					sum += i;
				}
			}

			// 上の結果の約数の合計を求める
			if (sum != num) {
				int sum2 = 0;
				for (int i = 1; i<= sum; i++){
					if (sum % i == 0 && sum != i) {
						sum2 += i;
					}
				}

				if (sum2 == num) {
					System.out.println(num + "と" + sum);
					num = sum;
				}
			}
		}
	}

	/**
	 * prob8-18 ロッカー問題
	 */
	private void prob8_18(){
		int[] a = new int[50];
		for (int i = 0; i < a.length; i++){
			a[i] = 1; // 閉じている
		}

		// 開け閉めの処理
		for (int i = 0; i < a.length; i++){
			for (int j = 0; j < a.length; j++){
				if ((j+1) % (i+1) ==0){
					a[j] *= -1;
				}
			}
		}

		// 開けのカウント
		int c = 0;
		for (int i = 0; i < a.length; i++){
			if (a[i] == -1) {
				c++;
			}
		}
		System.out.println(c + "個開いている");
	}

}
