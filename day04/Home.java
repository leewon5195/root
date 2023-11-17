package day04;

public class Home {
	
	//객체변수를 만든다.->인터페이스를 활용한 익명 자식 객체
	private RemoteControl rc = new RemoteControl() {

		@Override
		public void turnON() {
			// TODO Auto-generated method stub
			System.out.println("TV를 킵니다.");
		}

		@Override
		public void turnOff() {
			// TODO Auto-generated method stub
			System.out.println("TV를 킵니다.");
		}
		
	};
	//메서드 use1
	public void use1() { //객체 대입 변수를 이용해서 익명 자식 객체 만듬
		
		//tv를 킵니다. ->익명 자식 개체 메서드:turnON();
		rc.turnON();
		//tv를 끕니다. -> 익명 자식 개체 메서드:turnOff();
		rc.turnOff();
		}
	//메서드 use2
	public void use2() {
		//자체 변수를 만들어서 익명객체를 선언한다.
		RemoteControl rc = new RemoteControl() {

			@Override
			public void turnON() {
				// TODO Auto-generated method stub
				System.out.println("에어컨을 킵니다.");
			}

			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				System.out.println("에어컨을 끕니다.");
			}
			
		};
		
		rc.turnON();
		rc.turnOff();
	
	}
	
	
}
interface RemoteControl{
	void turnON();//끈다
	void turnOff();//킨다
}