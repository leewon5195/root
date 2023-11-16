package day03;

public class A5 {

	//인스턴스 필드와 메서드
	int filed1;
	void method1() {System.out.println("1");}
	//정적 필드와 메서드
	int filed2;
	void method2() {System.out.println("2");}
	
	class B{ //인스턴스 멤버 클래스
		//메서드 호출
		void method() {
			filed1 = 10;
			method1();
			filed2 = 20;
			method2();
		}
	}
	
	static class c{ // 정적 멤버 클래스
		
		void method() {
			
		}
	}
}
