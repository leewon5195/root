package day05;

public class java_20231024 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//응용문제3-3(산술연산자로 값을 바꿔서 출력하는 예제)
		//아래는 변수 num의 값 중에서 백의 자리 이하를 버리는 코드이다.
		int num = 456; //number = 456
		//456/10
		//456/100
		System.out.println(456/100*100);
		//실행결과 : 400
		//자리수만큼을 나눠서 묶음으로 만들고 묶음에 자리수만큼을 곱해서 = 버림에대한 결과값
		
		//응용문제3-4
		int apple = 123; //사과의 개수
		int apple_bucket = 123/10;// 사과를 담은 자루수
		System.out.println(apple_bucket);
		int bucket = apple%10; //사과의 나머지수
		System.out.println(bucket);
		if(bucket>0) {
			apple_bucket += 1;
		}
		System.out.println(apple_bucket);
		
		//응용문제 3-4
		//삼항 연산자를 이용
		
		int number = 10;
		//삼항연산자 - 코드가 길어져 - 간단한 조건을 물어보기위해서는 삼항연산자를 사용!
		System.out.println(number>0?"양수":(number<0?"음수":0));
		
		//반복문 -for문
		//문제1:for문을 이용해서 1부터5까지 출력하자
		//출력결과:
		//1
		//2
		//3
		//4
		//5
		//12345
		
		//for(int i=1;i<=5;i++) {
			//System.out.println(i);
		
		System.out.println();
		System.out.println("############");
		
		//랜덤 : 1~10 안에서 한가지 숫자가 무작위로 하나 출력하는거!
		
		for(int i=1;i<=5;i++) {
		int value = (int)(Math.random()*10)+1;
		System.out.println(value);
		
		}
		
		//문제3: 1부터 100까지 반복하면서 짝수를 구하면 합계로 구해보자
		//두가지 방법
		//1.for문을 2개씩 증가해서 만들수있다.
		//2.if조건문으로 2로나누면 나머지가 0일경우
		 //짝수라고 판단
		//*합계를 구해보자 : 짝수를 담을수 있는변수
		
		//짝수가 나올경우 합계를 구할수 있는변수 정의
		int sum=0;
		//반복문을 만들자 (초기값,조건식,증가식) 조건식: 1~100까지 출력
		
		//1) 증가식을 2씩 증가하면서 합계를 출력해보자.
		for(int i=2;1<=100;i+=2) {
			//System.out.println(i);
			//sum = sum +i; 0+2+4+6+8+10....100
			sum +=i;
		}
		//System.out.println(sum);
			//sum = 0;
			//2)if조건문으로 2로나누면 나머지가 0일경우
			//1~100까지 반복하고 변수값이 짝수가 되는경우에 조건으로 실행시킨다.
		
		//for(int i=1;i<=100;i++) {
				
			//짝수일경우 합계를 더하자 i%2==0 (true=짝수) 합계로 들어가요
			//if(i%2==0) {
				//sum +=i;
			
			//System.out.println(sum);
		
	
		
		//중첩for문 : 외부 반복문을 내부 반복문 조건이 끝나야 증가한다. 외부 반복문의 조건이 끝나면
		//모든 for문은 종료된다.
		
		//문제1:
		//1. 1차 반복문(for문을1개만이용)구구단2단을 코드로 만들어보자.
		for(int i=1;i<=9;i++) {
			System.out.println(i);
			System.out.println("2*"+i+"="+(2*i));
	
		}
		//문제2:
		//1.2차 반복문 구구단2단~9단을 코드로 만들어보자.
		System.out.println();
		for(int i=2;i<=9;i++) {
			
			System.out.println(i);
			
		}
		
	
	
	
	
	
	
	}
	
}

	


