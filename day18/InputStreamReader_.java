package day18;

import java.io.FileReader;
import java.io.Reader;

public class InputStreamReader_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Reader -> InputStream/FileReader
		
		//파일을 읽어오는 변수다.
		int read = 0;
		Reader reader = null;
		//스트림 선언
		char[] buffer = new char[256];
		try {
		Reader r = new FileReader("src/day18/write.txt");
		while(true) {
			//파일 일기
			read = reader.read(buffer);
			//-1이면 종료
			if(read == -1) {
				break;
			}
			System.out.println(String.valueOf(buffer,0,read));
		}
		}catch(Exception e){
			
		}
	}

}
