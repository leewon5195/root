package java_20231121;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//일반 예외 : 입출력 오류 (체크될상황이 강제적이다.)
		BufferedReader reader = null;
		try {
			//입출력 코드는 에러처리가 일반예외 처리
			reader = new BufferedReader(new FileReader("example.txt"));
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			
			if(reader!=null) {
				
			}
			
		}
		
		
	}

}
