package day10;

public class java_1107 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//오버라이딩: 부모와 자식에게 있는 메서드이다.
		//자식은 부모와 다르게 메서드를 구현해서 새로운 방법으로 사용한다.
		
		//삼송 컴퓨터 객체생성 = 오버라이딩
		Samsong s = new Samsong();
		s.powerOn();
		s.powerOff();
		//컴퓨터 객체생성 = 오버라이딩(X)
		Computer_ c = new Computer_();
		c.powerOn();
		c.powerOff();
		
		//final 클래스와 메서드
		Comic co = new Comic("주머니 괴물", "미상", true);
		co.info_title();
		co.info_author();
		co.info_color();
		
	}

}
//부모클래스: Book
class Book{
	String title;
	String author;
	
	//기본생성자: 객체 생성시 초기화
	Book(String title,String author){
		this.title = title;
		this.author = author;
	}
	
	//final 메서드 만든다.
	final void info_title() {
		System.out.println("책의 제목은"+title+"입니다.");
	}
	
	//멤버메서드: 객체가 생성될때 사용하는 메서드(힙 영역)
	void info_author() {
		System.out.println("책의 저자는"+author+"입니다.");
	}
}
//자식클래스: Comic
class Comic extends Book{
	boolean isColor;
	Comic(String title, String author,boolean isColor) {
		super(title, author);//부모생성자
		this.isColor = isColor;//색깔구분 
		
		}
	//에러코드 없음
	void info_author() {
		System.out.println("이 만화책의 저자는"+author+"입니다.");
	}
	void info_color() {
		if(isColor) {
			System.out.println("이 만화책은 컬러야");
		}else {
			System.out.println("이 만화책은 흑백이야");
		}
	}
}
	
	


//클래스 1:컴퓨터
class Computer_{
	
	void powerOn() {
		System.out.println("삑삑삑 컴퓨터가 켜졌습니다.");	
	}
	
	void powerOff() {
		System.out.println("삑삑삑 컴퓨터가 꺼졌습니다.");
	}
}

//클래스 2:삼성
class Samsong extends Computer_{
	
	@Override
	void powerOn(){
		System.out.println("아이러브 삼송"+"삑삑삑 컴퓨터가 켜졌습니다.");
		
	}
}
