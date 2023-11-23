package day16;

public class StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//String 클래스(java.lang) : charAt() 메서드
		//문자열을 하나의 단어 단위로 출력
		
		String word = "1I2LOVE6YOU";
		
		//문자열에서 숫자를 찾아 제거하고 문자만 출력
		String text = "";
		
		//length() : 문자열 길이를 반환 해당 문자열의 길이를 반환하는 메서드를 통해서 word:11문자열)
		for(int i=0; i<word.length(); i++) {
			if(word.charAt(i) >= 65 && word.charAt(i)<=90) {
				text += word.charAt(i);
			}
			else {
				text += " ";
			}
					
		}
		System.out.println(text);
		
		//indexOf() 메서드 : 문자열에 포함된 단어 또는 문자열의 위치를 검색했을때 
		//위치의 인덱스 값을 반환
		String strindex = "HelloWorld_MyWorld";
		
		//World 처음 인덱스 번호가 어디서 시작되었는지를 알고싶어요
		System.out.println(strindex.indexOf("World"));
		
		//World 처음 인덱스 번호가 어디서 시작되었는지를 알고싶어요
		System.out.println(strindex.indexOf("World",10));
		
		
		//replaceSll(변경대상,변경할 단어) : 변경대상을 변결할 단어로 모두 바꿔준다.
		String str = "자바 프로그래밍은 어렵지만 자바를 배울수록 재밌어요.";
		String newstr = str.replaceAll("자바","Java");
		
		System.out.println(str);
		System.out.println(newstr);
		
		//substring(시작하는 인덱스,끝나는 인덱스) : 원하는 위치에 문자열을 잘라서 사용하는 메서드이다.
		
		String substr = "1234-5678";
		String substr_ = substr.substring(5);
		System.out.println(substr_);
		
		String rangestr = substr.substring(0,4);
		System.out.println(rangestr);
		
		//split() : 문자를 배열로 구분해서 잘라준다.
		String substr2 = "1234-5678";
		String[] phone = substr2.split("-");
		System.out.println(phone[0]);
		System.out.println(phone[1]);
		
		//Stringbuffer / Stringbuilder
		
		StringBuilder buil_str = new StringBuilder("Hello");
		buil_str.append("World");
		System.out.println(buil_str);
		
		//문자열 삭제 delete
		buil_str.delete(0,5);
		System.out.println(buil_str);
		
		//문자열 추가 insert
		buil_str.insert(0,"Hello");
		System.out.println(buil_str);
		
		
	}

}
