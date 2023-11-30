package day18;

import java.io.FileInputStream;
import java.io.InputStream;

public class FileInputStream_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//InputStream(입출력 최상위객체)- fileInputStream : 파일에서 바이트 단위로 자료를 읽는 기본 스트림
		
		//파일을 읽어올 변수
		int read = 0;
		byte[] buffer = new byte[5];
		
		//스트림 선언
		InputStream is = null;
		
		//파일을 읽는다
		
		try {
	         is = new FileInputStream("src/day18/myfile.txt");
	         
	         
	         while(true) {
	        	 read = is.read(buffer);
	        	 
	        	 if(read==-1) {
	        		 break;
	        	 }
	        	 System.out.print(new String(buffer,0,read));
	        	 
	         }
	         
	         
	      } catch(Exception e) { 
	    	  System.out.println("Error:"+e.getMessage());
	         
	      }
		
		
		//파일의 끝지점 -1 반환 --> 파일을 닫는다
		try {
			
		
		if(is!=null) {
			is.close();
		}
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
