package src.sevendays.prob6;

/**
 * prob6-2 計算を保管するクラス
 */
public class Calc {

	/**
	 * 足し算
	 * @param a 前
	 * @param b 後
	 * @return
	 */
	double add(double a,double b){
		return a + b;
	}

	/**
	 * 引き算
	 * @param a 前
	 * @param b 後
	 * @return 計算結果
	 */
	double sub(double a,double b){
		return a - b;
	}

	/**
	 * 掛け算
	 * @param a 前
	 * @param b 後
	 * @return 計算結果
	 */
	double mul(double a,double b){
		return a * b;
	}

	/**
	 * 割り算
	 * @param a 前
	 * @param b 後
	 * @return 計算結果
	 */
	double div(double a,double b){
		return a / b;
	}
}
