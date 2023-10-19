package day3;

public class java_20231019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//단한연산자_부호연산자
		//x 라는 변수가 100이고 음수 하나는 양수로 출력하자
		int x = 100;
		int result_plus = +x;
		int result_minus = -x;
		
		System.out.println(result_plus);
		System.out.println(result_minus);
		
		//단항연산자_증감연산자(--/++)
		//산술연산자를 간단하게 처리할때 사용한다.
		//출력결과 : 10/ 11
		//선연산후증가 : num++;
		//선증가후연산 :++num;
		int num = 10;
		System.out.println(num++);
		System.out.println(num);
		
		//문제 int형 y라는 변수를 선언합니다. -> 1;
		//출력 결과 : 
		//1(선연산후증가)
		//2
		//3(선증가후연산)
		
		int y =1; //변수에 증가할값을 담아낸다.
		System.out.println(y++);
		System.out.println(y);
		System.out.println(++y);
		
		//아스키코드 'A' = 65 / 'B' = 66
		char alphabet ='X';
		//실행결과 : 증감연산자를 한번 사용해서 X Y
		//X 출력 : 선연산 후증가
		System.out.println(alphabet++);//Y
		//Y 출력
		System.out.println(alphabet);
		
		//이항연산자 (피연산자 + 피연산자)
		//산수연산자 : 변수+변수 -> 처리된결과
		int num_x = 100;
		int num_y = 200;
		//출력결과
		System.out.println(num_x+num_y);
		//출력 결과 : 20000
		System.out.println(num_x*num_y);
		//출력 결과 : 0
		System.out.println(num_x/num_y);//100/200 -> 0.5
		//출력 결과 : 100
		System.out.println(num_x%num_y);//(100/200)% = 100 나눌수 X
		
		//2)이항연산자_복합대입연산자 y = y+1
		
		int numbery = 5;
		//numbery = numbery +1;
		//numbery += 1;
		//numbery = numbery *2; //10
		//numbery *= 2; //10
		//numbery = numbery -2;//3
		//numbery -= 2;
		
		
		//3)이항연산자_관계연산자 : 크다 / 작다 / 작다 / 같거나 작다 / 같거나 크다
		//결과값은 논리적인 판단이다.(true/false)
		int a = 10;
		int b = 20;
		//a는 b보다 크다
		System.out.println(a>b);
		//a는 b보다 작거나 같다
		System.out.println(a<=b);
		//a는 b와 같다.
		System.out.println(a==b);
		//a는 b와 같지 않다.
		System.out.println(a!=b);
		
		//4) 이항연산자_논리연산자(비트연산자)
		//(&&,&) AND = (논리곱) = A(1)&&B(1) : true
		//(||,|) OR = (논리합) = A(1)&&B(0) : true
		//(^) XOR = (배타적 논리합)A(1)^B(0) : true
		//(!) NOT = (반전)~A(1) 1 : true
		
		//boolean : 1byte : 8bit 결과표시 : true(1)/false(0)
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		boolean b4 = false;
		
		System.out.println("###논리곱(AND):둘다true = 1###");
		//false (0==0/1==0/0==1) b1과b2를 이용해서 false
		System.out.println(b1 && b2);
		//true  (1==1)
		System.out.println(b1 && b3);
		//false (0==0/1==0/0==1)b2과b4를 이용해서 false
		System.out.println(b2 && b4);
		
		
		System.out.println("###논리합(OR):둘중 하나라도 true = 1###");
		//true
		System.out.println(b1 | b2); //true(1) || false(0) = true
		//true
		System.out.println(b1 | b3); // true(1) || true(1) = true
		//false
		System.out.println(b2 | b4); // false(0) || false(0) = false
		
		System.out.println("###배타적(XOR):다르면 true(1)/ 같으면 false(0)");
		//true(b1:true,b2:false,b3:true,b4:false)
		System.out.println(b1 ^ b2);
		//false
		System.out.println(b2 ^ b4);
		
		//4) 이항연산자_논리연산자(NOT)
		System.out.println("논리연산자(NOT)");//엔터
		boolean not_ = false;
		System.out.println(!not_);
		
		//3. 삼항 연산자:피연산자가 3개인 조건 연산식이다.
		//   조건식(피연산자1)?참(피연산자2):거짓(피연산자3)
		int number = (7>1)?1:2;
		System.out.println(number);
		
		
		
		
		
		
	}

}
