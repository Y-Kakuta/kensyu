package sevendays.prob7;

/**
 * prob7-3 計算するクラス
 */
public class Calculation {

	/** 1つめの数字 */
	private int number1;
	/** 2つめの数字 */
	private int number2;

	/**
	 * getter
	 * @return number1
	 */
	public int getNumber1() {
		return number1;
	}

	/**
	 * setter
	 * @param number1
	 */
	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	/**
	 * getter
	 * @return number2
	 */
	public int getNumber2() {
		return number2;
	}

	/**
	 * setter
	 * @param number2
	 */
	public void setNumber2(int number2) {
		this.number2 = number2;
	}

	/**
	 * 足し算
	 * @return 計算結果
	 */
	public int add(){
		return number1 + number2;
	}

	/**
	 * 引き算
	 * @return 計算結果
	 */
	public int sub(){
		return number1 - number2;
	}

}
