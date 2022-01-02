package first;

public class ConstantExam {
	public static void main (String[] args) {
		int i;
		i = 10;
		i = 5;
		
		final int J;
//		상수는 대문자의 명명규칙을 사용한다.
		J = 10;
		
		double circleArea;
		final double PI = 3.14159;
		circleArea = 3 * 3 * PI;
		
		final int OIL_PRICE = 1450;
//		변수는 camelCase 상수는 snake_case
		
		int totalPrice = 50 * OIL_PRICE;
	}
}
