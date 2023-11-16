package day03;

public class A_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//외부 객체 선언
		A1 a = new A1();
		a.filed = 10;
		//내부 객체 선언
		A1.B b = a.new B();
		//외부 클래스 메서드를활용한 -> B클래스 method호출
		a.methodA();
		b.method();
		
		//독립적으로 가능하다.
		A2.B2 b_ = new A2.B2(); //A객체를 생성하지 않아도 B객체 생성가능
		
		//A객체를 생성하지 않아도 B객체를 생성가능하다
		A3.B3 b2 = new A3.B3();
		b2.methodB();
		
		//PrintOut외부 클래스안에 Out내부 클래스를 직접적으로 호출한다.
		String str = "정적 내부 클래스 테스트";
		//외부 객체를 선언하고 인스턴스를 활용해서 메서드를 호출한다.
		PrintOut.Out out = new PrintOut.Out();
		out.println(str);//내부 클래스 메서드를 직접적으로 호출할수 있었다.
	
		A4 a2 = new A4(); //A4라는 외부 클래스 인스턴스 생성
		a2.UseB(3);
		
		//내부 클래스지만 private 접근제한 사용중
		PermitExample permit = new PermitExample();
		permit.getInClass().print();
		
		
		//Button 객체를 생성한다.
		Button btnOk = new Button();
		
		class OkListener implements Button.ClickListener{
		@Override	
			public void onClick() {
				System.out.println("OK 버튼을 클릭했습니다.");
			}
		}
	}
}

class PrintOut{//외부 클래스
	//정적 내부 클래스 선언
	static class Out{
		//메서드를 활용해서 만든다.
		void println(String str) {//str매개변수 받아서 출력한다.
			System.out.println(str);
			
			
		}
	}
}

//2. 멤버 클래스 접근 제한자(private)
//내부 클래스 private 외부 클래스 메서드를 통해서 클래스 접근할수 있게한다.

class PermitExample{
	//public > default > protected > private
	class Inclass{ //private: 내부 클래스를 통해서 접근 가능
		public void print() {
			System.out.println("접근을 private로 제한합니다.");
		}
	}
	
	//외부 클래스 public 이라는 method를 만들어서 Inclass.printf()메서드를 접근한다.
	public Inclass  getInClass() { //Inclass 리턴값 = 객체(다형성)
		return new Inclass();
	}
	
	
}
