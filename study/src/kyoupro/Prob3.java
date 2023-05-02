package src.kyoupro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Prob3 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader( System.in ) );
		String  s = br.readLine();    // 1行分の文字列を入力する

		// マスの最大値
		int N = Integer.parseInt(s);

		// 最短マップ<マス, 最短歩数>
		HashMap<Integer, Integer> minMap = new HashMap<>();
		minMap.put(1, 1);

		// 処理待ちリスト(マスを保存)
		ArrayList<Integer> procList = new ArrayList<>();
		procList.add(1);

		// 処理待ちリストが空になるまで繰り返す
		while (!procList.isEmpty()) {

			// 処理したい番号
			int proc = procList.get(0);
			// 処理したい番号の最短数
			int procMin = minMap.get(proc);
			// 移動距離の計算
			int move = calcMove(proc);

			// マイナスに動いて、登録されていない場合
			if (proc - move > 0 && !minMap.containsKey(proc - move)) {
				// マップに登録する
				minMap.put(proc - move, procMin + 1);
				// リストに登録する
				procList.add(proc - move);
			}

			// プラスに動いて、登録されていない場合
			if (proc + move <= N && !minMap.containsKey(proc + move)) {
				// マップに登録する
				minMap.put(proc + move, procMin + 1);
				// リストに登録する
				procList.add(proc + move);
			}

			// 処理待ちリストの先頭を削除する
			procList.remove(0);

		}

		if (minMap.containsKey(N)) {
			// Nが保管されている場合
			System.out.println(minMap.get(N));
		} else {
			// 保管されていない場合
			System.out.println(-1);
		}

	}

	// 2進数のビットの計算
	private static int calcMove(int number){

		// 2進数にしたときに、1になっているビットの数
		int count = 0;

		// 2進数のビットの計算
		while(number != 0){
			count += number % 2;
			number /= 2;
		}

		return count;
	}

}
