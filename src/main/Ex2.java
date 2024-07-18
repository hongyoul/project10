package main;

public class Ex2 {

	public static void main(String[] args) {
		
		// 인터페이스로 형변환 방법
		
		// 형변환 구조 ↓
		// 부모타입 변수 선언 = 자식 타입 객체 생성
		 Calc calc = new Calculator();
		
		 calc.add(2,30); // 더하기
		 calc.divide(2,30); // 나누기
		 calc.times(2,30); // 곱하기
		 calc.substract(2,30); //빼기
		 
		 // 형변환된 변수로 자식 클래스
	}

}
