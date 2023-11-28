package day17;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map = new HashMap<>();
		
		//데이터 삽입
		map.put("Spring","봄");
		map.put("Summer","여름");
		map.put("Autumn","가을");
		map.put("Winter","겨울");
		
		//데이터 삭제
		map.remove("winter");
		//특정 키가 존재하는지 확인
		System.out.println("Is Exist Key :"+map.containsKey("wnter"));
		//특정 키값이 존재확인-중복 신경쓰지않는 확인
		System.out.println("Is Exist Value :"+map.containsKey("가을"));
		
		//출력
		System.out.println("get Data:"+map.get("Spring"));
	}

}
