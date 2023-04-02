package sevendays.prob6;

/**
 * prob6-1 最大と最小を求めるクラス
 */
public class Minmax {

	/**
	 * 最大値の取得(2変数)
	 * @param n1 1つめ
	 * @param n2 2つめ
	 * @return 大きい数字
	 */
	public int max(int n1,int n2){
		if (n1 > n2){
			return n1;
		}
		return n2;
	}

	/**
	 * 最大値の取得(3変数)
	 * @param n1
	 * @param n2
	 * @param n3
	 * @return 大きい数字
	 */
	public int max(int n1,int n2, int n3){
		if (n1 > n2){
			return max(n1, n3);
		}
		return max(n2, n3);
	}

	/**
	 * 最小値の取得(2変数)
	 * @param n1 1つめ
	 * @param n2 2つめ
	 * @return 大きい数字
	 */
	public int min(int n1,int n2){
		if (n1 < n2){
			return n1;
		}
		return n2;
	}

	/**
	 * 最小値の取得(3変数)
	 * @param n1
	 * @param n2
	 * @param n3
	 * @return 小さい数字
	 */
	public int min(int n1,int n2, int n3){
		if (n1 > n2){
			return min(n2, n3);
		}
		return min(n1, n3);
	}
}
