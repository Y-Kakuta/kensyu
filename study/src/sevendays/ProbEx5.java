package sevendays;

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
		List<Integer> even = new ArrayList<Integer>();
		List<Integer> odd = new ArrayList<Integer>();

		while(true){
			int num = (int)(Math.random()*11); // 0から10までの乱数を発生させる
			System.out.println("乱数 : " + num);
			if (num == 0){
				break;
			}
			if (num % 2 == 0) {
				even.add(new Integer(num));
			} else {
				odd.add(new Integer(num));
			}
		}

		System.out.print("偶数 : ");
		for (Integer i: even){
			System.out.print(i + " ");
		}
		System.out.println();

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
		List<Integer> list = new ArrayList<Integer>();

		while(true){
			int num = (int)(Math.random()*11); // 0から10までの乱数を発生させる
			System.out.println("乱数 : " + num);
			if (num == 0){
				break;
			}
			list.add(new Integer(num));
		}

		for (int i = list.size() - 1; i > -1; i--){
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
	}

	/**
	 * probEx5-3
	 */
	private void probEx5_3(){

		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		for (int i = 0; i < 10; i++){
			ans.add(new ArrayList<Integer>());
		}

		while(true){
			int num = (int)(Math.random()*101); // 0から100までの乱数を発生させる
			System.out.println("乱数 : " + num);
			if (num == 0){
				break;
			}

			ans.get(num % 10).add(num);
		}
		System.out.println();

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
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        List<String> ans = new ArrayList<String>();

        //  コンソールから文字列の読み込み
        String buf = "";
        do {
        	System.out.print("入力 : ");
        	try {
    			buf = br.readLine();
    		} catch (IOException e) {
    			// TODO 自動生成された catch ブロック
    			e.printStackTrace();
    		}
            ans.add(buf);
		} while (!buf.equals(""));

        for (String i: ans){
        	System.out.print(i + " ");
        }
        System.out.println();
	}

	/**
	 * probEx5-5
	 */
	private void probEx5_5(){
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        List<String> ans = new ArrayList<String>();

        //  コンソールから文字列の読み込み
        String buf = "";
        do {
        	System.out.print("入力 : ");
        	try {
    			buf = br.readLine();
    		} catch (IOException e) {
    			// TODO 自動生成された catch ブロック
    			e.printStackTrace();
    		}
            ans.add(buf);
		} while (!buf.equals(""));

        // 文字列の整理
        List<String> ans2 = new ArrayList<String>();
        for (String i: ans){
        	if (i.length() < 5) {
				ans2.add(i);
			}
        }

        // 文字列の出力
        for (String i: ans2){
        	System.out.print(i + " ");
        }
        System.out.println();
	}

	/**
	 * probEx5-6
	 */
	private void probEx5_6(){
		List<Integer> list = new ArrayList<Integer>();

		while(true){
			int num = (int)(Math.random()*11); // 0から10までの乱数を発生させる
			System.out.println("乱数 : " + num);
			if (num == 0){
				break;
			}
			list.add(new Integer(num));
		}
		System.out.println();

		int i = 0;
		while (i < list.size()){
			if (list.get(i) == 2) {
				list.remove(i);
			} else {
				i++;
			}
		}

		for (Integer num: list){
			System.out.print(num + " ");
		}
		System.out.println();
	}

	/**
	 * probEx5-7
	 */
	private void probEx5_7(){
		List<Integer> list = new ArrayList<Integer>();

		while(true){
			int num = (int)(Math.random()*11); // 0から10までの乱数を発生させる
			System.out.println("乱数 : " + num);
			if (num == 0){
				break;
			}
			list = probEx5_7sub(list, num);

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
	 * @param list
	 * @param num
	 * @return list
	 */
	private List<Integer> probEx5_7sub(List<Integer> list, int num){
		List<Integer> out = new ArrayList<Integer>();

		for (Integer i: list){
			if (i < num) {
				out.add(i);
			} else {
				out.add(num);
				out.add(i);
				num = 100;
			}
		}
		if (list.size() == out.size()) {
			out.add(num);
		}

		return out;
	}

}
