package src.sevendays;

/**
 * 基本問題1
 */
public class Prob1 {

	/**
	 * メイン関数
	 * @param args
	 */
	public static void main(String[] args) {
		Prob1 prob1 = new Prob1();

		System.out.println("prob1-1");
		prob1.prob1_1();
		System.out.println("");

		System.out.println("prob1-2");
		prob1.prob1_2();
		System.out.println("");

		System.out.println("prob1-3");
		prob1.prob1_3();
		System.out.println("");

		System.out.println("prob1-4");
		prob1.prob1_4();
		System.out.println("");
	}

	/**
	 * prob1-1
	 */
	private void prob1_1(){
		System.out.println("田中　太郎");
	}

	/**
	 * prob1-2
	 */
	private void prob1_2(){
		System.out.println("ABCDEFGHI");
		//別解 System.out.println("ABC" + "DEF" + "GHI");
	}

	/**
	 * prob1-3
	 */
	private void prob1_3(){
		System.out.println(1 + " + " + 1 + " = " + (1+1));
		System.out.println(2 + " + " + 3 + " = " + (2+3));
	}

	/**
	 * prob1-4
	 */
	private void prob1_4(){
		System.out.println(1 + " + " + 2 + " + " + 3 +" = " + (1+2+3));
	}

}
