package main;

public class Ex1 {

	public static void main(String[] args) {
		
		// 인터페이스는 객체를 생성할 수 없음
		// Calc calc = new Calc(); //에러남. 인터페이스로는 인스턴스를 생성할수없음
//		Calc calc = new Calc();
		
		Calculator calculator = new Calculator();
		int result = calculator.add(10, 5);
		System.out.println(result);
		
		System.out.println(calculator.substract(10, 5)); // 빼기
		System.out.println(calculator.add(10, 5)); // 더하기
		System.out.println(calculator.divide(10, 5)); // 나누기  
		System.out.println(calculator.times(10, 5)); // 곱하기
	}

}

// 계산기의 구현 클래스
class Calculator implements Calc {

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		return num1 / num2;
	}
	
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현하였습니다.");
	}
}
