package day_4;

import java.util.Scanner;

public class day_4_20231020_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if��
				//score ������ ���� 60�� �ְ� 
				//score ������ 60���� ũ�ų� ������� �հ��Դϴ�. ���
				int score = 60;
				if(score>=60);
				System.out.println("�հ� �Դϴ�.");
				
				
				//��ĳ���̿� : input
				//���̸� �Է��ϼ��� ��� ����ϰ� �Է��մϴ�.
				//���̰� 19�캸�� Ŭ��� �����Դϴٶ�� ����غ�����.
				
				System.out.println("���̸� �Է��ϼ���");
				//Scanner scanner = new Scanner(System.in);
				
				//int age = scanner.nextInt(); //�Ϻ����� ������ �޴´�.
				//if(age>19);
					System.out.println("�����Դϴ�. �����ϼ���");
					
					
					//2) if-else : ���ǽĿ� ���� ������ �����ؾ��ϴ� ��ɹ��̴�.
					//number ������ �����ϰ� 5�� �����Ѵ�.
					//5�� 4���� Ŭ��� ũ�ٶ�� ������ְ� �ƴҰ��� �۴ٶ�� ����Ѵ�.
					
				int number = 5;
				if(number>4) {
					System.out.println("5�� 4���� ũ��.");
					
				}else {
					System.out.println("5�� 4���� �۴�.");
				}
				
				//a��b�� ���ؼ� ū���ϰ�� max�ȿ� ������ �����Ѥ�.
				//�������� �ƽ��� ���� ���ִ� ������ max�� �ִ밪�� ����Ѵ�.
				//if-else ó�� �ؼ� ����� ������.
				int a = 4;
				int b = 10;
				int max = 0;
				
				//������ a>b ������ ��Ƽ� ���ǹ����� �����.
				if(a>b) {
					max = a; 
				}else {
					max = b;
				}
				
				System.out.println("a:"+a+"�� b : "+b+"�߿��� ū����"+max+"�Դϴ�.");
				
				//else-if : ���ǽ��� ������ ������ ����Ѵ�.
				//����1 : �����ϴ� ���ڸ� �����Ѵ�. -> ������ �ִ´�.(7)(������ ���� �����)
				//����1 : �����ϴ� ���ڰ� 5���� Ŭ���� "�����ϴ� ���ڰ� 5���� Ů�ϴ�." ���
				//����2 : �����ϴ� ���ڰ� 7�ϰ�쿡�� "�����ϴ� ���ڴ� 7�Դϴ�." ���
				
				int fav = 7; //7�� ������ �ִ´�.
				
				if(fav==7) {
					System.out.println("�����ϴ� ���ڴ� 7�Դϴ�.");
				} else if(fav>5) {
					System.out.println("�����ϴ� ���ڰ� 5���� Ů�ϴ�.");
				}	else {
					System.out.println("�����ϴ� ���ڴ� 5���� �۽��ϴ�.");
					
					
			    //����2 : ������ �Է��Ѵ�.
				//90���� ũ�ų� ������ ="A" ���
				//80���� ũ�ų� ������ = "B"���
				//70���� ũ�ų� ������ = "C"���
				//�������� = "D"���
					//Scanner input = new Scanner(System.in);
					//int score_ = input.nextInt();
				//if-elseif����ؼ� ������ ����غ���
				//if(score_>=90) {
					//System.out.println("A");
				//}else if(score_>=80) {
					//System.out.println("B");
				//}else if(score_>=70) {
					//System.out.println("C");
				//}else{
				//	System.out.println("D");
				}
				
		
				//��°�� : number 7�Դϴ�. �������
				//case 1 : number�� 1�Դϴ�./ case 7: number�� 7�Դϴ�. / default : �Ѵ� �ƴϴ�.
				int result = 7;
				
				switch(result) {
				case 1:
					System.out.println("number1�Դϴ�.");
					break;
				case 7:
					System.out.println("number7�Դϴ�.");
					break;
				default :
					System.out.println("�Ѵ� �ƴϴ�.");
				
					}
				//����2: ���� �Է��ϰ� ������ ������� 
				//case 3������ 11�������� ���� ������ ������.
				//�� �������� "������ ������ 000�Դϴ�."
				//3~5�� : ��  6~8�� : ����  9~11�� : ����  12~2 : �ܿ�
				
				System.out.println("���� ���� �Է��ϼ���.");
				Scanner sc = new Scanner(System.in);
				int month = sc.nextInt();
				//switch = ����� = �Է°�(����)
				
				switch(month) {
				case 3:					
				case 4:					
				case 5:
					System.out.println("������ ������ ���Դϴ�.");
					break;
				case 6:	case7: case8:				
				
					System.out.println("������ ������ �����Դϴ�.");
					break;
				case 9:				
				case 10:					
				case 11:
					System.out.println("������ ������ �����Դϴ�.");
					break;
				default:
				//case 12:  case 1:  case 2
					System.out.println("������ ������ �ܿ��Դϴ�.");
				}
				
				
				//����3: ��ĭ�� �ڵ带 switch������ ��������
				
				int a_ = 25;
				
				switch(a_/10) { //a_/10 = 2.5
				
					case 2:
					System.out.println("a�� 20�̻��� �����Դϴ�.");
				}
				
				
				
				
				
				
				
				}
			}
				
				
	



