package sbss;

public class hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("안녕하세요");
		System.out.println();
		
		System.out.printf("%d은 첫번째, %f은 두번째, %s은 세번쩨",1,2.00000,"셋");
		System.out.println();
		System.out.printf("%5d",1);
		System.out.println();
		System.out.printf("%5d",12);
		System.out.println();
		System.out.printf("%5d",123);
		System.out.println();
		System.out.printf("%5d",1234);
		System.out.println();
		System.out.printf("%5d",12345);
		System.out.println();
		
		System.out.printf("%.1f",1.12345);
		System.out.println();
		System.out.printf("%.2f",1.12345);
		System.out.println();
		System.out.printf("%.3f",1.12345);
		System.out.println();
		System.out.printf("%.4f",1.12345);
		System.out.println();
		System.out.printf("%.5f",1.12345);
		System.out.println();

		System.out.printf("%.5f",1.12345);
		System.out.println();
		
		int myage = 20;
		int yourage = myage;
		System.out.println(myage);
		System.out.println(yourage);
		
		int myage_ = 20;
		int yourage_ = 30;
		int temp_;
		temp_ = myage_;
		myage_= yourage_;
		yourage_= temp_;
		
		System.out.println(myage_);
		System.out.println(yourage_);
	}

}
