package sevendays.prob7;

/**
 * prob7-2 文字列を扱うクラス
 */
public class TwoStrings {
	/**  一つ目の文字列 */
	private String string1;

	/**  二つ目の文字列 */
	private String string2;

	/**
	 * setter
	 * @param string1
	 */
	public void setString1(String string1) {
		this.string1 = string1;
	}

	/**
	 * setter
	 * @param string2
	 */
	public void setString2(String string2){
		this.string2 = string2;
	}

	/**
	 * getter
	 * @return string1
	 */
	public String getString1(){
		return string1;
	}

	/**
	 * getter
	 * @return string2
	 */
	public String getString2(){
		return string2;
	}

	/**
	 * 文字列の結合
	 * @return 結合結果
	 */
	public String getConnectedString(){
		return getString1() + getString2();
	}
}
