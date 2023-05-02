package src.sevendays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 基本問題5
 */
public class ProbEx5 {

	/**
	 * メイン関数
	 * @param args
	 */
	public static void main(String[] args) {
		ProbEx5 probEx5 = new ProbEx5();

		System.out.println("probEx5-1");
		probEx5.probEx5_1();
		System.out.println("");

		System.out.println("probEx5-2");
		probEx5.probEx5_2();
		System.out.println("");

		System.out.println("probEx5-3");
		probEx5.probEx5_3();
		System.out.println("");

		System.out.println("probEx5-4");
		probEx5.probEx5_4();
		System.out.println("");

		System.out.println("probEx5-5");
		probEx5.probEx5_5();
		System.out.println("");

		System.out.println("probEx5-6");
		probEx5.probEx5_6();
		System.out.println("");

		System.out.println("probEx5-7");
		probEx5.probEx5_7();
		System.out.println("");

	}

	/**
	 * probEx5-1
	 */
	private void probEx5_1(){
		// 偶数のリスト
		List<Integer> even = new ArrayList<Integer>();
		// 奇数のリスト
		List<Integer> odd = new ArrayList<Integer>();

		// 0が出るまで繰り返し
		while(true){
			int num = (int)(Math.random()*11); // 0から10までの乱数を発生させる
			System.out.println("乱数 : " + num);

			// 繰り返し終了
			if (num == 0){
				break;
			}

			// リストに追加
			if (num % 2 == 0) {
				even.add(new Integer(num));
			} else {
				odd.add(new Integer(num));
			}
		}

		// 偶数の出力
		System.out.print("偶数 : ");
		for (Integer i: even){
			System.out.print(i + " ");
		}
		System.out.println();

		// 奇数の出力
		System.out.print("奇数 : ");
		for (Integer i: odd){
			System.out.print(i + " ");
		}
		System.out.println();
	}

	/**
	 * probEx5-2
	 */
	private void probEx5_2(){
		// リスト
		List<Integer> list = new ArrayList<Integer>();

		// 0が出るまで繰り返し
		while(true){
			int num = (int)(Math.random()*11); // 0から10までの乱数を発生させる
			System.out.println("乱数 : " + num);

			// 繰り返し終了
			if (num == 0){
				break;
			}

			// リストに追加
			list.add(new Integer(num));
		}

		// リストを逆から読み込む
		for (int i = list.size() - 1; i > -1; i--){
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
	}

	/**
	 * probEx5-3
	 */
	private void probEx5_3(){

		// 一の位が0~9のリストの作成
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		for (int i = 0; i < 10; i++){
			ans.add(new ArrayList<Integer>());
		}

		// 0が出るまで繰り返し
		while(true){
			int num = (int)(Math.random()*101); // 0から100までの乱数を発生させる
			System.out.println("乱数 : " + num);

			// 繰り返し終了
			if (num == 0){
				break;
			}

			// 一の位を検索して、対応するリストに挿入
			ans.get(num % 10).add(num);
		}
		System.out.println();

		// 結果の出力
		for (int i = 0; i < ans.size(); i++){
			System.out.print("一の位が" + i + " : ");
			for (int j = 0; j < ans.get(i).size(); j++){
				System.out.print(ans.get(i).get(j) + " ");
			}
			System.out.println();
		}
	}

	/**
	 * probEx5-4
	 */
	private void probEx5_4(){
		// リストの宣言
		List<String> ans = new ArrayList<String>();

		//  繰り返し開始
		String buf = "";
		do {
			System.out.print("入力 : ");

			try {
				// コンソールとの結合
				InputStreamReader isr = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(isr);

				// 文字列の読み込み
				buf = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}

			ans.add(buf);
		} while (!buf.equals("")); // 空まで繰り返し

		// 結果の出力
		for (String i: ans){
			System.out.print(i + " ");
		}
		System.out.println();
	}

	/**
	 * probEx5-5
	 */
	private void probEx5_5(){
		// リストの宣言
		List<String> list = new ArrayList<String>();

		//  繰り返し開始
		String buf = "";
		do {
			System.out.print("入力 : ");
			try {
				// コンソールとの結合
				InputStreamReader isr = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(isr);

				// 文字列の読み込み
				buf = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			list.add(buf);
		} while (!buf.equals("")); // 空まで繰り返し

		// 文字列の整理
		List<String> ans = new ArrayList<String>();
		for (String i: list){
			// 5文字未満の文字列を追加
			if (i.length() < 5) {
				ans.add(i);
			}
		}

		// 文字列の出力
		for (String i: ans){
			System.out.print(i + " ");
		}
		System.out.println();
	}

	/**
	 * probEx5-6
	 */
	private void probEx5_6(){
		// リストの宣言
		List<Integer> list = new ArrayList<Integer>();

		// リストに追加
		while(true){
			int num = (int)(Math.random()*11); // 0から10までの乱数を発生させる
			System.out.println("乱数 : " + num);

			// 0まで繰り返し
			if (num == 0){
				break;
			}

			// リストに追加
			list.add(new Integer(num));
		}
		System.out.println();

		// リストの配列番号
		int i = 0;

		// リストの終わりまで繰り返し
		while (i < list.size()){
			if (list.get(i) == 2) {
				// 2の場合、削除
				list.remove(i);
			} else {
				// 2以外の場合、次の配列に移動
				i++;
			}
		}

		// 結果の出力
		for (Integer num: list){
			System.out.print(num + " ");
		}
		System.out.println();
	}

	/**
	 * probEx5-7
	 */
	private void probEx5_7(){
		// リストの宣言
		List<Integer> list = new ArrayList<Integer>();

		// リストに追加
		while(true){
			int num = (int)(Math.random()*11); // 0から10までの乱数を発生させる
			System.out.println("乱数 : " + num);

			// 0まで繰り返し
			if (num == 0){
				break;
			}
			// 生成した乱数の追加
			list = probEx5_7sub(list, num);

			// 並び替えた後の結果を出力
			System.out.print("出力 : ");
			for (Integer num2: list){
				System.out.print(num2 + " ");
			}
			System.out.println();
			System.out.println();
		}
		System.out.println();

	}

	/**
	 * numをlistの入るべき場所に入れて、結果を返すメソッド
	 * @param list 現在のリスト
	 * @param num 追加したいリスト
	 * @return 追加して整理した後のリスト
	 */
	private List<Integer> probEx5_7sub(List<Integer> list, int num){
		// リストの宣言
		List<Integer> out = new ArrayList<Integer>();

		// 引数のリストを左から確認していく
		for (Integer i: list){
			if (i < num) {
				// 入れたい値より小さい場合、リストの値をそのまま追加する
				out.add(i);
			} else {
				// 入れたい値より大きい場合、入れたい値を追加する
				out.add(num);
				// その後、リストの値を追加する
				out.add(i);
				// 入れたい値を大きい数字に変更する
				num = 100;
			}
		}
		if (list.size() == out.size()) {
			// 入れたい数字を追加していない場合、最後に追加する
			out.add(num);
		}

		return out;
	}

}
