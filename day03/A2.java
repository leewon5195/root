package day03;

//정적 멤버 클래스: 내부 클래스static
public class A2 {

	//정적 멤버 클래스: 내부 클래스
	static class B2{ }//외부 클래스를 사용하지 않아도 가능하다.
		
	//인스턴스 필드값으로 B객체 대입할수 있다.
	B2 filed1 = new B2();//인스턴스멤버를 이용한 객체생성
	
	//정적 필드 값으로 B객체 대입할수 있다.
	static B2 filed2 = new B2();

	//생성자
	A2(){
		//내부 클래스 객체 생성해서 만들었다.
		B2 b = new B2();
	}
	
	//정적 메서드:  
	static void method2() {
		B2 b = new B2();
	}
}
