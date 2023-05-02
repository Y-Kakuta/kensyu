package src.sevendays.prob7;

/**
 * prob7-1 データ管理をするクラス
 */
public class Data {
	/**  メンバ変数number */
	private int number = 0;
	/**  メンバ変数comment */
	private String comment = "";

	/**
	 * getter
	 * @return number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * setter
	 * @param number
	 */
	public void setNumber(int number) {
		this.number = number;
	}

	/**
	 * getter
	 * @return comment
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * setter
	 * @param comment
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}


}
