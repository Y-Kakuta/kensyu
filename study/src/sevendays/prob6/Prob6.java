package sevendays.prob6;

/**
 * 基本問題6
 */
public class Prob6 {

	/**
	 * メイン関数
	 * @param args
	 */
	public static void main(String[] args) {
		Prob6 prob6 = new Prob6();

		System.out.println("prob6-1");
		prob6.prob6_1();
		System.out.println("");

		System.out.println("prob6-2");
		prob6.prob6_2();
		System.out.println("");

		System.out.println("prob6-3");
		prob6.prob6_3();
		System.out.println("");

	}

	/**
	 * prob6-1
	 */
	private void prob6_1(){
		// コンストラクタの呼び出し
		Minmax m = new Minmax();

		// 数字の宣言
		int a = 4,b = 2,c = 5;

		// 計算結果
		System.out.println(a + "と" + b + "と" + c + "のうち、最大のものは" + m.max(a,b,c));
		System.out.println(a + "と" + b + "と" + c + "のうち、最小のものは" + m.min(a,b,c));
	}

	/**
	 * prob6-2
	 */
	private void prob6_2(){
		// コンストラクタの呼び出し
		Calc c = new Calc();

		// 数字の宣言
		double a = 4.0,b = 2.0;

		// 計算結果
		System.out.println(a + " + " + b + " = " + c.add(a,b));
		System.out.println(a + " - " + b + " = " + c.sub(a,b));
		System.out.println(a + " * " + b + " = " + c.mul(a,b));
		System.out.println(a + " / " + b + " = " + c.div(a,b));
	}

	/**
	 * prob6-3
	 */
	private void prob6_3(){
		// コンストラクタの呼び出し
		Circle c = new Circle();

		//  円の半径を設定
		c.r = 4.0;

		// 計算結果
		System.out.println("半径" + c.r +"の円の円周の長さは" + c.circumference());
		System.out.println("半径" + c.r +"の円の面積は" + c.area());

	}

}
