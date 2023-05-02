package src.sevendays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;

/**
 * 基本問題5
 */
public class ProbEx6 {

	/**
	 * メイン関数
	 * @param args
	 */
	public static void main(String[] args) {
		ProbEx6 probEx6 = new ProbEx6();

		System.out.println("probEx6-1");
		probEx6.probEx6_1();
		System.out.println("");

		System.out.println("probEx6-2");
		probEx6.probEx6_2();
		System.out.println("");

		System.out.println("probEx6-3");
		probEx6.probEx6_3();
		System.out.println("");

		System.out.println("probEx6-4");
		probEx6.probEx6_4();
		System.out.println("");

		System.out.println("probEx6-5");
		probEx6.probEx6_5();
		System.out.println("");

	}

	/**
	 * probEx6-1
	 */
	private void probEx6_1(){

		// マップの宣言
		HashMap<String, String> map = new HashMap<>();
		map.put("cat", "猫");
		map.put("dog", "犬");
		map.put("bird", "鳥");
		map.put("tiget", "虎");

		try {
			// コンソールとの結合
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);

			// 文字列の読み込み
			System.out.print("入力 : ");
			String buf = br.readLine();

			// 結果を出力
			if (map.get(buf) == null) {
				System.out.println("登録されていません");
			} else {
				System.out.println(map.get(buf) + "です");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}


	}

	/**
	 * probEx6-2
	 */
	private void probEx6_2(){
		// マップの宣言
		HashMap<Character, String> map = new HashMap<>();
		map.put('0', "〇");
		map.put('1', "一");
		map.put('2', "二");
		map.put('3', "三");
		map.put('4', "四");
		map.put('5', "五");
		map.put('6', "六");
		map.put('7', "七");
		map.put('8', "八");
		map.put('9', "九");

		try {
			// コンソールとの結合
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);

			// 文字列の読み込み
			System.out.print("入力 : ");
			String buf = br.readLine();

			// 出力結果
			String out = "";

			for (int i = 0; i < buf.length(); i++){
				if (map.get(buf.charAt(i)) == null) {
					// 数字以外の入力の場合
					out = "整数を入力してください";
					break;
				} else {
					// 数字の入力の場合
					if (i != 0 && (buf.length()-i) % 3 == 0) {
						// カンマを入力するかチェック
						out += ",";
					}

					// 数字の入力
					out += map.get(buf.charAt(i));
				}
			}
			// 結果の出力
			System.out.println(out);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * probEx6-3
	 */
	private void probEx6_3(){

		// セットの宣言
		HashSet<Integer> set = new HashSet<>();

		// 発生させる乱数の数のカウント
		int i = 0;
		System.out.print("乱数 : ");

		// 繰り返しの開始
		while(i < 10){
			// カウント数増加
			i++;
			// 乱数の発生
			int num = (int)(Math.random()*10 + 1); // 1から10までの乱数を発生させる

			// セットに追加
			System.out.print(num + " ");
			set.add(num); // 既に登録済みの場合は変化しない
		}
		System.out.println();

		// 結果の出力
		System.out.print("出現 : ");
		for (Integer num: set){
			System.out.print(num + " ");
		}
		System.out.println();
	}

	/**
	 * probEx6-4
	 */
	private void probEx6_4(){

		// セットの宣言
		HashSet<Character> set = new HashSet<>();

		try {
			// コンソールとの結合
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);

			// 文字列の読み込み
			System.out.print("入力 : ");
			String buf = br.readLine();

			// 1文字ずつ追加
			for (int i = 0; i < buf.length(); i++){
				set.add(buf.charAt(i));
			}

			// 結果の出力
			System.out.print("出現 : ");
			for (Character c: set){
				System.out.print(c + " ");
			}
			System.out.println();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * probEx6-5
	 */
	private void probEx6_5(){
		// 文字の宣言
		String s1 = "hoge";
		String s2 = new String("hoge");

		if(s1.equals(s2)){
			System.out.println(s1 + "と" + s2 +"は、同じ文字列です。");
		}else{
			System.out.println(s1 + "と" + s2 +"は、同じ文字列ではありません。");
		}
	}
}
