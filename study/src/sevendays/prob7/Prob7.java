package sevendays.prob7;

/**
 * 基本問題7
 */
public class Prob7 {

	/**
	 * メイン関数
	 * @param args
	 */
	public static void main(String[] args) {
		Prob7 prob7 = new Prob7();

		System.out.println("prob7-1");
		prob7.prob7_1();
		System.out.println("");

		System.out.println("prob7-2");
		prob7.prob7_2();
		System.out.println("");

		System.out.println("prob7-3");
		prob7.prob7_3();
		System.out.println("");

	}

	/**
	 * prob7-1
	 */
	private void prob7_1(){
		Data d = new Data();
        d.setNumber(100);
        d.setComment("Programming Java");
        System.out.println( "number = " + d.getNumber());
        System.out.println( "comment = " + d.getComment());
	}

	/**
	 * prob7-2
	 */
	private void prob7_2(){
		TwoStrings s = new TwoStrings();
        s.setString1("Hello");
        s.setString2("World");
        System.out.println("一つ目の文字列は" + s.getString1());
        System.out.println("二つ目の文字列は" + s.getString2());
        System.out.println("二つの文字列を合成したものは" + s.getConnectedString());
	}

	/**
	 * prob7-3
	 */
	private void prob7_3(){
		Calculation c = new Calculation();
        c.setNumber1(8);    //  一つ目の数をセット
        c.setNumber2(9);    //  二つ目の数をセット
        //  二つの数の和を表示
        System.out.println(c.getNumber1() + " + " + c.getNumber2() + " = " + c.add());
        //  二つの数の差を表示
        System.out.println( c.getNumber1() + " - " + c.getNumber2() + " = " + c.sub());

	}

}
