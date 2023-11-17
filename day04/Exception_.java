package day04;

public class Exception_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("#######NullPointerException##########");
		
		String[] strArray = null;
		//System.out.println("strArray[0]:"+strArray[0]);
		
		System.out.println("#######NumberFormateException##########");
		String str01 = "11";
		String str02 = "11.0";
		int num01 = Integer.parseInt(str01);
		System.out.println("String int"+num01);
		//int num02 = Integer.parseInt(str02);
		
		System.out.println("#######ArrayIndexOutofBoundsException##########");
		int[] arr = {1,6,7,9,10};
		System.out.println(arr[6]);
	}

}
