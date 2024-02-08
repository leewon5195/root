#include<stdio.h>

int main(void)
{
	//오늘 수업 총정리

	// number1 이라는 int형 변수에 정수 3을 넣는다.
	int number1 = 3;

	// number1 변수의 값을 화면에 출력해보자.
	// %d : 정수를 표현할 자리이다.(number1을 출력할 자리를 만들어 놓은것이다.)
	// \n : 엔터를 의미한다.
	printf("%d\n",number1);

	int number2 = 5;
	printf("%d\n", number2);

	// 추가

	int number3 = number1 + number2;
	printf("%d\n",number3);

	//또다른 방법
	printf("%d\n", number1 + number2);

	//그냥..
	printf("%f\n", number1 + number2);

	return 0;
}