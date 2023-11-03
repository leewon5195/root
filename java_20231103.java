package day09;

public class java_20231103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//getter / setter : 캡슐화 -> 멤버필드:private
		//private:클래스 내부에서만 접근하는 제어자
		Person kim = new Person();
		//메서드 매개변수에 나이값을 입력한다.
		kim.setAge(-30);
		//kim.age;
		//kim 나이는 몇 살입니다. 출력 해주세요. kim.getAge();
		System.out.println("kim 나이는"+kim.getAge()+"입니다.");
		
		//실행 결과
		//문제1:객체를 기본생성자로 만들고 멤버변수의값으로 출력하자
		Book b1 = new Book();
		//b1.title : 제목없음
		System.out.println("b1.title:"+b1.title);
		//b1.seires : 1
		System.out.println("b1.series:"+b1.series);
		//b1.page : 100
		System.out.println("b1.page:"+b1.page);
		
		
		//문제2:기본생성자(타이틀)생성해보자
		Book b2 = new Book("멘토시리즈 자바");
		//b2.title : 멘토시리즈
		System.out.println("b2.title:"+b2.title);
		//b2.series : 1
		System.out.println("b2.series:"+b2.series);
		//b2.page : 100
		System.out.println("b2.page:"+b2.page);
		
		//문제3: 기본생성자(타이틀,페이지)생성해보자
		Book b3 = new Book("신데렐라",170);
		//b3.title : 신데렐라
		System.out.println("b3.title:"+b3.title);
		//b3.page : 170
		System.out.println("b3.page:"+b3.page);
		//b3.series : 1
		System.out.println("b3.series:"+b3.series);
		
		//문제4: 기본생성자(페이즈,타이틀)생성해보자
		Book b4 = new Book(5,"노인과바다");
		//b4.title : 노인과바다
		System.out.println("b4.title:"+b4.title);
		//b4.series : 5
		System.out.println("b4.series:"+b4.series);
		//b4.page : 100
		System.out.println("b4.page:"+b4.page);
		
		//5)생성자를 이용한 인스턴스 복사
		Car car = new Car();
		Car car2 = new Car(car);
		
		//상속:자식 클래스가 부모클래스에 의존하는 객체(단일상속)
		//스마트TV 객체 생성해보자
		SmartTv stv = new SmartTv();
		stv.channel = 10; //채널이 10번이 되어서 보고있다.
		stv.channelUp(); 
		System.out.println("지금 채널은" + stv.channel+"번 입니다.");
		stv.captionOnoff();
		System.out.println(stv.caption);
		
		
		
	}

}
//라이브러리 클래스
class Tv{ //부모 클래스
	int channel;
	boolean power;
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}

class SmartTv extends Tv{ //자식 클래스
	boolean caption;//캡션상태(on / off)
	void displayCaption(String txt) {
		if(caption) {
			System.out.println(txt);
			
			
		}
	}
	void captionOnoff() {
		if(caption) {
			caption = false;
		}else {
			caption = true;
		}
	}
}
class Car{ //설계도
	String color; //자동차 색깔
	String gearType; //기어타입 : 오토/ 수동
	int door; //자동차 문짝
	
	//기본생성자 = 완벽한this(하얀색,자동,4)
	Car(){
		this("하얀색","자동",4);
	}
	
	//기본생성자=기본자료형매개변수(색깔,기어타입,문짝)
	Car(String color,String gearType,int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	//기본생성자=참조자료형매개변수(객체)
	Car(Car c){
		color = c.gearType;
		gearType = c.gearType;
		door = c.door;
	}
	
	
	
}
class Book{
	String brand;//출판사
	String title="제목없음";//책의 이름
	int series = 1;
	String color;//책의 색깔
	int page = 100;
	static int width = 200;
	static int height = 500;
	//기본생성자
	Book(){
		
	}
	
	Book(String t){ //책의 타이틀 초기화
		title = t;
	}
	
	Book(String t,int p){ //책의 타이틀, 책의 페이지 초기화
		title = t;
		page = p;
	}
	
	Book(int s,String t){ // 책의 시리즈코드 책의타이틀
		series = s;
		title = t;
	}
	Book(int s){
		series = s;
	}
	
}





class Person{ //사람
	private int age;// 사람의 나이를 캡슐화
	
	//settermethod 메서드 입력 받는다.
	void setAge(int num) {
		//if문 num 입력을받았을때 0보다 작을경우는
		if(num<0) {
			System.out.println("잘못된 숫자를 입력했습니다.1이상입력해!!");
		}else {
			age = num;//return
		}
		//잘못된 숫자를 입력했습니다. 1이상으로 입력해주세요:return
		
		//age = num; return
		
	}
	int getAge() { //나이를 반환하는 메서드 get
		return age;
	}
	
}