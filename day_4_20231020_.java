package day_4;

import java.util.Scanner;

public class day_4_20231020_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if문
				//score 변수에 값을 60을 주고 
				//score 점수가 60보다 크거나 같을경우 합격입니다. 출력
				int score = 60;
				if(score>=60);
				System.out.println("합격 입니다.");
				
				
				//스캐너이용 : input
				//나이를 입력하세요 라고 출력하고 입력합니다.
				//나이가 19살보다 클경우 성인입니다라고 출력해보세요.
				
				System.out.println("나이를 입력하세요");
				//Scanner scanner = new Scanner(System.in);
				
				//int age = scanner.nextInt(); //일벽값을 정수로 받는다.
				//if(age>19);
					System.out.println("성인입니다. 입장하세요");
					
					
					//2) if-else : 조건식에 따라 무조건 실행해야하는 명령문이다.
					//number 변수를 선언하고 5를 정의한다.
					//5는 4보다 클경우 크다라고 출력해주고 아닐경우는 작다라고 출력한다.
					
				int number = 5;
				if(number>4) {
					System.out.println("5는 4보다 크다.");
					
				}else {
					System.out.println("5는 4보다 작다.");
				}
				
				//a와b를 비교해서 큰값일경우 max안에 변수로 정의한ㄷ.
				//마지막에 맥스에 값에 들어가있는 변수와 max의 최대값을 출력한다.
				//if-else 처리 해서 결과를 만들어보자.
				int a = 4;
				int b = 10;
				int max = 0;
				
				//기준을 a>b 기준을 잡아서 조건문으로 만든다.
				if(a>b) {
					max = a; 
				}else {
					max = b;
				}
				
				System.out.println("a:"+a+"와 b : "+b+"중에서 큰수는"+max+"입니다.");
				
				//else-if : 조건식을 여러개 만들경우 사용한다.
				//문제1 : 좋아하는 숫자를 선택한다. -> 변수에 넣는다.(7)(변수도 직접 만든다)
				//조건1 : 좋아하는 숫자가 5보다 클경우는 "좋아하는 숫자가 5보다 큽니다." 출력
				//조건2 : 좋아하는 숫자가 7일경우에만 "좋아하는 숫자는 7입니다." 출력
				
				int fav = 7; //7을 변수에 넣는다.
				
				if(fav==7) {
					System.out.println("좋아하는 숫자는 7입니다.");
				} else if(fav>5) {
					System.out.println("좋아하는 숫자가 5보다 큽니다.");
				}	else {
					System.out.println("좋아하는 숫자는 5보다 작습니다.");
					
					
			    //문제2 : 점수를 입력한다.
				//90보다 크거나 같으면 ="A" 출력
				//80보다 크거나 같으면 = "B"출력
				//70보다 크거나 같으면 = "C"출력
				//나머지는 = "D"출력
					//Scanner input = new Scanner(System.in);
					//int score_ = input.nextInt();
				//if-elseif사용해서 학점을 출력해보자
				//if(score_>=90) {
					//System.out.println("A");
				//}else if(score_>=80) {
					//System.out.println("B");
				//}else if(score_>=70) {
					//System.out.println("C");
				//}else{
				//	System.out.println("D");
				}
				
		
				//출력결과 : number 7입니다. 출력하자
				//case 1 : number는 1입니다./ case 7: number는 7입니다. / default : 둘다 아니다.
				int result = 7;
				
				switch(result) {
				case 1:
					System.out.println("number1입니다.");
					break;
				case 7:
					System.out.println("number7입니다.");
					break;
				default :
					System.out.println("둘다 아니다.");
				
					}
				//문제2: 월을 입력하고 계절을 출력하자 
				//case 3월부터 11월까지만 쓰고 계절을 만들어보자.
				//각 계절별로 "현재의 계절은 000입니다."
				//3~5월 : 봄  6~8월 : 여름  9~11월 : 가을  12~2 : 겨울
				
				System.out.println("현재 월을 입력하세요.");
				Scanner sc = new Scanner(System.in);
				int month = sc.nextInt();
				//switch = 결과값 = 입력값(변수)
				
				switch(month) {
				case 3:					
				case 4:					
				case 5:
					System.out.println("현재의 계절은 봅입니다.");
					break;
				case 6:	case7: case8:				
				
					System.out.println("현재의 계절은 여름입니다.");
					break;
				case 9:				
				case 10:					
				case 11:
					System.out.println("현재의 계절은 여름입니다.");
					break;
				default:
				//case 12:  case 1:  case 2
					System.out.println("현재의 계절은 겨울입니다.");
				}
				
				
				//문제3: 빈칸에 코드를 switch문으로 구현하자
				
				int a_ = 25;
				
				switch(a_/10) { //a_/10 = 2.5
				
					case 2:
					System.out.println("a는 20이상의 숫자입니다.");
				}
				
				
				
				
				
				
				
				}
			}
				
				
	



