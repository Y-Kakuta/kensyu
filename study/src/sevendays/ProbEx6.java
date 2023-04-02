package sevendays;

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
		//probEx6.probEx6_1();
		System.out.println("");

		System.out.println("probEx6-2");
		//probEx6.probEx6_2();
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
		HashMap<String, String> map = new HashMap<>();
		map.put("cat", "猫");
		map.put("dog", "犬");
		map.put("bird", "鳥");
		map.put("tiget", "虎");

		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        //  コンソールから文字列の読み込み
        System.out.print("入力 : ");
    	try {
			String buf = br.readLine();
			if (map.get(buf) == null) {
				System.out.println("登録されていません");
			} else {
				System.out.println(map.get(buf) + "です");
			}
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}


	}

	/**
	 * probEx6-2
	 */
	private void probEx6_2(){
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

		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

		//  コンソールから文字列の読み込み
        System.out.print("入力 : ");
    	try {
			String buf = br.readLine();
			String out = "";

			for (int i = 0; i < buf.length(); i++){
				if (map.get(buf.charAt(i)) == null) {
					out = "整数を入力してください";
					break;
				} else {
					if (i != 0 && (buf.length()-i) % 3 == 0) {
						out += ",";
					}
					out += map.get(buf.charAt(i));
				}
			}
			System.out.println(out);

		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

	/**
	 * probEx6-3
	 */
	private void probEx6_3(){

		HashSet<Integer> set = new HashSet<>();

		int i = 0;
		System.out.print("乱数 : ");
		while(i < 10){
			i++;
			int num = (int)(Math.random()*10 + 1); // 1から10までの乱数を発生させる
			System.out.print(num + " ");
			set.add(num);
		}
		System.out.println();

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

		HashSet<Character> set = new HashSet<>();

		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

		//  コンソールから文字列の読み込み
        System.out.print("入力 : ");
    	try {
			String buf = br.readLine();

			for (int i = 0; i < buf.length(); i++){
				set.add(buf.charAt(i));
			}

			System.out.print("出現 : ");
			for (Character c: set){
				System.out.print(c + " ");
			}
			System.out.println();

		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

	}

	/**
	 * probEx6-5
	 */
	private void probEx6_5(){
		String s1 = "hoge";
        String s2 = new String("hoge");
        if(s1.equals(s2)){
            System.out.println(s1 + "と" + s2 +"は、同じ文字列です。");
        }else{
            System.out.println(s1 + "と" + s2 +"は、同じ文字列ではありません。");
        }
	}
}
