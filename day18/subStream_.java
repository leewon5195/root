package day18;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class subStream_ {

	public static void main(String[] args) {
	      
	      FileInputStream fis = null;
	      BufferedInputStream bis = null;
	      
	      FileOutputStream fos = null;
	      BufferedOutputStream bos = null;
	      
	      System.out.println("보조 스트림 시작");
	      
	      try {
	         fis = new FileInputStream("src/day18/a.jpg");
	         fos = new FileOutputStream("src/day18/a_sub.jpg");
	         
	         bis = new BufferedInputStream(fis);
	         bos = new BufferedOutputStream(fos);
	         
	         
	         while(bis.read() != -1) {
	        	 fos.write(bis.read());
	         }
	         
	      } catch (Exception e) {
	         
	      }
	   }

}
