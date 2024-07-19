package main;

public class Quiz2 {

	public static void main(String[] args) {
		Calc calc = new Calculator();
		
		// 다운캐스팅 공식
		// 1. calc 변수가 가리키는 객체의 타입 Calculator 라면
		if (calc instanceof Calculator) {
			
			// 2. Calculator형ㅇ,로 다운캐스팅
			// 원래타입.이름명 = (원래타입)변수
			Calculator calculator =(Calculator) calc;
			calculator.showInfo();
			
		}

	

	}

}
