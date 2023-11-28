package day17;
import java.util.*;

public class java_20231128 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> list = new ArrayList<String>();
	      
	      list.add("딸기");
	      list.add("바나나");
	      list.add("망고");
	      
	      
	      System.out.println("리스트 내용 1 : " + list);
	      
	      list.add(2, "수박");
	      
	      System.out.println("리스트 내용 2 : " + list);
	      
	      List<String> list2 = new ArrayList<String>();
	      
	      list2.add("수박");
	      list2.add("바나나");
	      list2.add("망고");
	      
	      System.out.println("리스트 내용 1 : " + list2);
	      list2.set(1, "복숭아");
	      list2.set(2, "애플망고");
	      
	      System.out.println("리스트 내용 2 : " + list2);

	}

}
