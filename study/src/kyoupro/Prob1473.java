package kyoupro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Prob1473 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader( System.in ) );

		String  s = br.readLine();    // 1行分の文字列を入力する

		// 行きたい都市
		int n = Integer.parseInt(s.split(" ")[0]);
		// 道の数
		int m = Integer.parseInt(s.split(" ")[1]);

		// 最大重量
		int d = 0;

		// 入力された道
		// 都市1, 都市2, 重量
		ArrayList<int[]> inputRoad = new ArrayList<int[]>();

		// 入力処理
		for (int i = 0; i < m; i++){
			s = br.readLine();
			String[] sList = s.split(" ");
			int[] inputList = new int[3];
			for (int j = 0; j < inputList.length; j++){
				inputList[j] = Integer.parseInt(sList[j]);
			}
			inputRoad.add(inputList);

			// 最大重量のチェック
			if (d < inputList[2]) {
				d = inputList[2];
			}
		}

		// 体重を減らして繰り返し
		for(int i = d; 0 < i; i--){

			// 編集フラグ
			boolean editFlg = false;

			// 都市と最短距離のマップ
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			map.put(1, 0);

			do {
				// 編集フラグの初期化
				editFlg = false;

				// 道を1つずつ確認する
				for(int[] road: inputRoad){
					// 重量が問題ない道で、
					if (road[2] >= i) {

						if (map.containsKey(road[0]) && map.containsKey(road[1])) {
							// 都市1と都市2がmapに含まれている場合
							if (map.get(road[0]) + 1 < map.get(road[1])) {
								// 都市1 < 都市2の場合、都市2の値を更新
								map.put(road[1], map.get(road[0]) + 1);
								// フラグの更新
								editFlg = true;
							} else if (map.get(road[0]) > map.get(road[1]) + 1) {
								// 都市1 > 都市2の場合、都市1の値を更新
								map.put(road[0], map.get(road[1]) + 1);
								// フラグの更新
								editFlg = true;
							}
						} else if (map.containsKey(road[0])){
							// 都市1のみ含まれている場合、mapに都市2を加える
							map.put(road[1], map.get(road[0]) + 1);
							// フラグの更新
							editFlg = true;
						} else if (map.containsKey(road[1])){
							// 都市2のみ含まれている場合、mapに都市1を加える
							map.put(road[0], map.get(road[1]) + 1);
							// フラグの更新
							editFlg = true;
						}
					}
				}

			} while (editFlg);

			if (map.containsKey(n)) {
				System.out.println(i + " " + map.get(n));
				break;
			}
		}

	}

}
