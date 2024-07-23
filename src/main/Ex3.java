package main;

public class Ex3 {

	public static void main(String[] args) {
		
//		Calculator calculator = new Calculator();
		Calc calculator = new Calculator();
		
		System.out.println(calculator.substract(10, 5)); // 빼기
		System.out.println(calculator.add(10, 5)); // 더하기
		System.out.println(calculator.divide(10, 0)); // 나누기  
		System.out.println(calculator.times(10, 20)); // 곱하기

	}

}

class NewCalcuator implements Calc{

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}

	// 곱하는 수가 0또는 음수라면 에러코드 반환
	@Override
		public int times(int num1, int num2) {
			if (num2 > 0) {
				return num1 * num2;
			} else {
				return Calc.ERROR;
			}
		}

	// 첫번째숫자가 두번째 숫자보다 더 작으면 에러코드 반환
	@Override
	public int divide(int num1, int num2) {
		if (num1 > num2) {
			return num1 / num2;
		} else {
		return Calc.ERROR;
		}
	}
	
}