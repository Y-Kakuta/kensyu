package sevendays.prob6;

/**
 * prob6-3 円のクラス
 */
public class Circle {

	/** 半径 */
	public double r;

	/**
	 * 円周の公式
	 * @return 円周
	 */
	public double circumference(){
		return 2 * 3.14 * r;
	}

	/**
	 * 面積の公式
	 * @return 面積
	 */
	public double area(){
		return 3.14 * r * r;
	}
}
