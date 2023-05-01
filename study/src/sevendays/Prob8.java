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
		// カウント数
		int count = 0;

		// a,b,cを100パターン確認する
		for (int a = 1; a <= 100; a++){
			for (int b = 1; b <= 100; b++){
				for (int c = 1; c <= 100; c++){

					// 成立する場合
					if (a*a + b*b == c*c) {
						count++;
						System.out.println("a=" + a + ",b=" + b + ",c=" + c);
					}
				}
			}
		}

		// 結果の出力
		System.out.println("個数 : " + count + "個");
	}

	/**
	 * prob8-2
	 */
	private void prob8_2(){
		// カウント数
		int count = 0;

		// a <= b <= c になるように繰り返しを実行する
		for (int a = 1; a < 100; a++){
			for (int b = a; b < 100; b++){
				for (int c = b; c < 100; c++){

					// 成立する場合
					if (a*a + b*b == c*c) {
						count++;
						System.out.println("a=" + a + ",b=" + b + ",c=" + c);
					}
				}
			}
		}

		// 結果の出力
		System.out.println("個数 : " + count + "個");
	}

	/**
	 * prob8-3
	 */
	private void prob8_3(){

		// numの階乗を求める
		int num = 6;

		int ans = 1;
		// numを1つずつ下げて掛け算していく
		for (int i = num; 0 < i; i--){
			ans *= i;
		}

		// 結果の出力
		System.out.println(num + "! = " + ans);
	}

	/**
	 * prob8-4
	 */
	private void prob8_4(){

		// 乱数の生成
		int random = (int)(Math.random()*1000) + 1; // 1から1000までの乱数を発生させる
		System.out.println("乱数 : " + random);

		int col = 0;
		do {
			// 桁数の追加
			col++;
			// 乱数の桁数を下げる
			random /= 10;
		} while (random != 0); // 0になるまで繰り返す

		// 結果の出力
		System.out.println(col + "桁");
	}

	/**
	 * prob8-5
	 */
	private void prob8_5(){
		// 繰り返しの開始
		for (int i = 1; i < 101; i++){
			if (i % 3 == 0) {
				// 3で割り切れる場合
				System.out.print(i + " ");
			} else if (30 <= i && i < 40) {
				// 30~39の場合
				System.out.print(i + " ");
			} else if (i % 10 == 3) {
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
		// 1つめの分子(up)
		int u1 = (int)(Math.random()*10) + 1; // 1から10までの乱数を発生させる
		// 2つめの分子(up)
		int u2 = (int)(Math.random()*10) + 1; // 1から10までの乱数を発生させる
		// 1つめの分母(down)
		int d1 = (int)(Math.random()*9) + 2; // 2から10までの乱数を発生させる
		// 2つめの分母(down)
		int d2 = (int)(Math.random()*9) + 2; // 2から10までの乱数を発生させる

		// u1/d1 + u2/d2 の計算結果
		// 分子の計算
		int calUp = u1 * d2 + u2 * d1;
		// 分母の計算
		int calDown = d1 * d2;

		// 整数の確認
		int n = 0; // 整数部分
		while (calUp >= calDown){
			// 分子が大きい場合、整数に繰り上げ処理
			n++;
			calUp -= calDown;
		}

		// 約分の処理
		// 2以上分母の数未満の数で割り切れるか確認する
		for (int i = calDown; 1 < i; i--){
			while (calUp % i == 0 && calDown % i == 0){
				// どちらも割れる場合、約分する
				calDown /= i;
				calUp /= i;
			}
		}

		// 出力部分
		System.out.print(u1 + "/" + d1 + " + " + u2 + "/" + d2 + " = ");
		if (n != 0) {
			// 1以上の場合
			System.out.print(n);
			if (calUp != 0){
				// 分数が残る場合
				System.out.print(".");
			}
		}
		if (calUp != 0){
			// 分数のみの場合
			System.out.print(calUp + "/" + calDown);
		}
		System.out.println("");

	}

	/**
	 * prob8-7
	 */
	private void prob8_7(){
		// 1つめの分子(up)
		int u1 = (int)(Math.random()*10) + 1; // 1から10までの乱数を発生させる
		// 2つめの分子(up)
		int u2 = (int)(Math.random()*10) + 1; // 1から10までの乱数を発生させる
		// 1つめの分母(down)
		int d1 = (int)(Math.random()*9) + 2; // 2から10までの乱数を発生させる
		// 2つめの分母(down)
		int d2 = (int)(Math.random()*9) + 2; // 2から10までの乱数を発生させる

		// u1/d1 + u2/d2 の計算結果
		// 分子の計算
		int calUp = u1 * d2 + u2 * d1;
		// 分母の計算
		int calDown = d1 * d2;

		// 整数部分の計算
		int n1 = 0; // 1つめの整数部分
		int n2 = 0; // 2つめの整数部分
		int n = 0; // 計算後の整数部分
		while (u1 >= d1){
			n1++;
			u1 -= d1;
		}
		while (u2 >= d2){
			n2++;
			u2 -= d2;
		}
		while (calUp >= calDown){
			n++;
			calUp -= calDown;
		}

		// 約分の処理
		// 2以上分母の数未満の数で割り切れるか確認する
		for (int i = calDown; 1 < i; i--){
			while (calUp % i == 0 && calDown % i == 0){
				// どちらも割れる場合、約分する
				calDown /= i;
				calUp /= i;
			}
		}

		// 出力部分

		// 最初の分数
		if (n1 != 0) {
			// 1以上の場合
			System.out.print(n1);
			if (u1 != 0){
				// 分数が残る場合
				System.out.print(".");
			}
		}
		if (u1 != 0){
			// 分数のみの場合
			System.out.print(u1 + "/" + d1);
		}

		System.out.print(" + ");

		// 次の分数
		if (n2 != 0) {
			// 1以上の場合
			System.out.print(n2);
			if (u2 != 0){
				// 分数が残る場合
				System.out.print(".");
			}
		}
		if (u2 != 0){
			// 分数のみの場合
			System.out.print(u2 + "/" + d2);
		}

		System.out.print(" = ");

		// 計算後の分数
		if (n != 0) {
			// 1以上の場合
			System.out.print(n);
			if (calUp != 0){
				// 分数が残る場合
				System.out.print(".");
			}
		}
		if (calUp != 0){
			// 分数のみの場合
			System.out.print(calUp + "/" + calDown);
		}
		System.out.println("");
	}

	/**
	 * prob8-8
	 */
	private void prob8_8(){
		// 乱数の発生
		int random = (int)(Math.random()*1000) + 1; // 1から1000までの乱数を発生させる
		System.out.println("乱数 : " + random);

		// 1以上random未満の数で繰り返す
		System.out.print("約数 : ");
		for (int i = 1; i <= random; i++) {

			if (random % i == 0) {
				// 割り切れる場合
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
		// 1以上10000以下の整数を確認する
		for (int num = 1; num < 10001; num++){

			// 合計値
			int sum = 0;

			// 自分以下の約数を検索する
			for (int i = 1; i<= num; i++){
				if (num % i == 0 && num != i) {
					// 約数の場合、加算する
					sum += i;
				}
			}

			if (sum == num) {
				// 合計と、自分が一致する場合
				System.out.println(sum);
			}
		}
	}

	/**
	 * prob8-10 数値の分類
	 */
	private void prob8_10(){

		// 奇数の数
		int cntOdd = 0;
		// 偶数の数
		int cntEven = 0;

		// 配列の宣言
		int[] a = new int[10];
		for (int i = 0; i < a.length; i++){
			a[i] = (int)(Math.random()*100) + 1; // 1から100までの乱数を発生させる
			System.out.print(a[i] + " ");

			if (a[i] % 2 == 0) {
				// 偶数の場合
				cntEven++;
			} else {
				// 奇数の場合
				cntOdd++;
			}
		}
		System.out.println("");

		// 奇数の数の配列を宣言する
		int[] odd = new int[cntOdd];
		// 偶数の数の配列を宣言する
		int[] even = new int[cntEven];

		// 次に入れる配列の場所
		int indOdd = 0;
		int indEven = 0;

		// 配列の作成
		for (int i = 0; i < a.length; i++){
			if (a[i] % 2 == 0) {
				// 偶数の配列に追加
				even[indEven] = a[i];
				// 偶数の配列の参照番号を更新
				indEven++;
			} else {
				// 奇数の配列に追加
				odd[indOdd] = a[i];
				// 奇数の配列の参照番号を更新
				indOdd++;
			}
		}

		// 偶数の出力
		System.out.print("偶数 : ");
		for (int i = 0; i < even.length; i++){
			System.out.print(even[i] + " ");
		}
		System.out.println("");

		// 奇数の出力
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
		// 初期の数字
		int a1 = 1;
		int a2 = 1;
		// 初期の数字での計算結果
		int cal = a1 + a2;
		// 計算済みの個数
		int count = 3;

		// 現状の出力
		System.out.print(a1 + " " + a2 + " " + cal + " ");

		// 40個まで繰り返す
		while (count < 40){
			// 計算の対象を1つ隣に繰り上げる
			a1 = a2;
			a2 = cal;
			cal = a1 + a2;

			// 計算後の数字を出力する
			System.out.print(cal + " ");

			// カウントの更新
			count++;
		}
		System.out.println("");

	}

	/**
	 * prob8-12 トリボナッチ数列
	 */
	private void prob8_12(){
		// 初期の数字
		int a1 = 1;
		int a2 = 1;
		int a3 = 2;
		int cal = a1 + a2 + a3;
		int count = 4;

		// 初期の出力
		System.out.print(a1 + " " + a2 + " " + a3 + " " + cal + " ");

		// 30個まで繰り返し
		while (count < 30){
			// 計算の対象を1つ隣に繰り上げる
			a1 = a2;
			a2 = a3;
			a3 = cal;
			cal = a1 + a2 + a3;

			// 計算後の数字を出力する
			System.out.print(cal + " ");

			// カウントの更新
			count++;
		}
		System.out.println("");
	}

	/**
	 * prob8-13 集合
	 */
	private void prob8_13(){

		// 配列aの生成
		int[] a = new int[10];
		System.out.print("配列1 : ");
		for (int i = 0; i < a.length; i++){
			a[i] = (int)(Math.random()*10) + 1; // 1から10までの乱数を発生させる
			System.out.print(a[i] + " ");
		}
		System.out.println("");

		// 配列bの生成
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
			// 配列aに入っているか
			boolean checkA = false;
			// 配列bに入っているか
			boolean checkB = false;

			// aの確認
			for (int j = 0; j < a.length; j++){
				if (a[j] == i) {
					// 入っている場合
					checkA = true;
					break;
				}
			}

			// bの確認
			for (int j = 0; j < b.length; j++){
				if (b[j] == i) {
					// 入っている場合
					checkB = true;
					break;
				}
			}

			if (checkA && checkB) {
				// どちらにも入っている場合、出力する
				System.out.print(i + " ");
			}
		}
		System.out.println("");

		// どちらかに入っている値を検索
		System.out.print("どちらかに入っている数 : ");
		for (int i = 1; i < 11; i++){
			// 配列aに入っているか
			boolean checkA = false;

			// aの確認
			for (int j = 0; j < a.length; j++){
				if (a[j] == i) {
					// aに入っている場合
					checkA = true;
					System.out.print(i + " ");
					break;
				}
			}

			if (!checkA) {
				// aになかった場合、bの確認
				for (int j = 0; j < b.length; j++){
					if (b[j] == i) {
						// bに入っている場合
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

		// 配列がなくなるまで繰り返す
		while (num.length != 0){
			// 現状で一番小さい素数を出力する
			System.out.print(num[0] + " ");

			// 次の処理で残る個数
			int count = 0;

			// 現状の配列を繰り返す
			for (int j = 0; j < num.length; j++){
				if (num[j] % num[0] != 0) {
					// 今の小さい数で割れない数の場合、カウントする
					count++;
				}
			}

			// 次の処理で使う配列を生成する
			int[] numNew = new int[count];
			// numNewの配列番号
			count = 0;

			// 現状の配列を繰り返す
			for (int j = 0; j < num.length; j++){
				if (num[j] % num[0] != 0) {
					// 割れない数の場合
					// 次の処理の配列に追加する
					numNew[count] = num[j];
					// 配列番号を隣に移動させる
					count++;
				}
			}

			// 注目する配列を更新する
			num = numNew;
		}
		System.out.println("");

	}

	/**
	 * prob8-15 素因数分解
	 */
	private void prob8_15(){
		// 数字を発生させる
		int random = (int)(Math.random()*100) + 1; // 2から100までの乱数を発生させる
		System.out.print(random + " = ");

		// 小さい数字から繰り返す
		for (int i = 2; i <= random; i++){

			// 割り切れる場合
			while (random % i == 0) {
				// 割り算処理をする
				random /= i;

				// 計算過程を出力する
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

		// 配列を生成する
		int[] a = new int[10];
		for (int i = 0; i < a.length; i++){
			a[i] = (int)(Math.random()*100) + 1; // 1から100までの乱数を発生させる
		}

		// 左から順番に埋める数字を検索する
		for (int i= 0; i < a.length - 1; i++){

			// i番目より後ろの中で最大の数
			int maxN = 0;
			// maxNを持つ配列番号
			int maxI = 0;

			// i番目より後ろの数を検索する
			for (int j = i ; j < a.length; j++){
				if (a[j] > maxN) {
					// 最大値を更新する
					maxN = a[j];
					maxI = j;
				}
			}

			// i番目の数字とmaxI番目の数字を入れ替える
			int sub = a[i];
			a[i] = a[maxI];
			a[maxI] = sub;
		}

		// 結果の出力
		for (int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");
		}
		System.out.println("");
	}

	/**
	 * prob8-17 友愛数
	 */
	private void prob8_17(){
		// 1から10000まで繰り返し
		for (int num = 1; num < 10001; num++){

			// 自分以外の約数の和の計算
			int sum = 0;
			for (int i = 1; i<= num; i++){
				if (num % i == 0 && num != i) {
					sum += i;
				}
			}

			// 完全数ではない場合、上の結果の約数の合計を求める
			if (sum != num) {
				// 自分以外の約数の和の計算
				int sum2 = 0;
				for (int i = 1; i<= sum; i++){
					if (sum % i == 0 && sum != i) {
						sum2 += i;
					}
				}

				// 友愛数の条件を満たす場合
				if (sum2 == num) {
					System.out.println(num + "と" + sum);
					// 次に調査する数の更新
					num = sum;
				}
			}
		}
	}

	/**
	 * prob8-18 ロッカー問題
	 */
	private void prob8_18(){

		// 初期状態の生成
		int[] a = new int[50]; // a[i] = {-1:開いている} / {1:閉じている}
		for (int i = 0; i < a.length; i++){
			a[i] = 1; // 閉じている
		}

		// 開け閉めの処理
		for (int i = 0; i < a.length; i++){
			for (int j = 0; j < a.length; j++){
				if ((j+1) % (i+1) ==0){
					// 割り切れる場合、ロッカーの状態を反転させる
					a[j] *= -1;
				}
			}
		}

		// 開いている状態のカウント
		int c = 0;
		for (int i = 0; i < a.length; i++){
			if (a[i] == -1) {
				// 開いているとき、カウントする
				c++;
			}
		}

		// 結果の出力
		System.out.println(c + "個開いている");
	}
}
