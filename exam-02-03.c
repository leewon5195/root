#include<stdio.h>

int main(void)
{
	//���� ���� ������

	// number1 �̶�� int�� ������ ���� 3�� �ִ´�.
	int number1 = 3;

	// number1 ������ ���� ȭ�鿡 ����غ���.
	// %d : ������ ǥ���� �ڸ��̴�.(number1�� ����� �ڸ��� ����� �������̴�.)
	// \n : ���͸� �ǹ��Ѵ�.
	printf("%d\n",number1);

	int number2 = 5;
	printf("%d\n", number2);

	// �߰�

	int number3 = number1 + number2;
	printf("%d\n",number3);

	//�Ǵٸ� ���
	printf("%d\n", number1 + number2);

	//�׳�..
	printf("%f\n", number1 + number2);

	return 0;
}