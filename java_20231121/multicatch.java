package java_20231121;

import java.util.InputMismatchException;
import java.util.Scanner;

public class multicatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//두가지 다중 catch를 만들어보자
		//정수형 배열을 만든다. cards = {4,5,1,2,7,8}
		
		
		Scanner scan = new Scanner(System.in);
		try {
			int[] cards = {4,5,1,2,7,8};
			System.out.println("몇번째 카드를 뽑으시겠습니가?>>");
			
			int CardIndex = scan.nextInt();
			System.out.println("뽑은 카드 번호는:"+cards[CardIndex]);
			
		}catch(InputMismatchException e) {
			System.out.println("잘못 입력하셨습니다.스캐너를 입력할때는 숫자만 가능합니다.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("해당 번호의 카드는 없습니다.");
			
		}
		
		System.out.println("프로그램 종료");
		scan.close();
		
	}

}
