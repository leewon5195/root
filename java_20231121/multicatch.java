package java_20231121;

import java.util.InputMismatchException;
import java.util.Scanner;

public class multicatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ΰ��� ���� catch�� ������
		//������ �迭�� �����. cards = {4,5,1,2,7,8}
		
		
		Scanner scan = new Scanner(System.in);
		try {
			int[] cards = {4,5,1,2,7,8};
			System.out.println("���° ī�带 �����ðڽ��ϰ�?>>");
			
			int CardIndex = scan.nextInt();
			System.out.println("���� ī�� ��ȣ��:"+cards[CardIndex]);
			
		}catch(InputMismatchException e) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.��ĳ�ʸ� �Է��Ҷ��� ���ڸ� �����մϴ�.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�ش� ��ȣ�� ī��� �����ϴ�.");
			
		}
		
		System.out.println("���α׷� ����");
		scan.close();
		
	}

}
