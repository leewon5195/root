package day18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutInputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      OutputStream os = null;
	      try {
	         os = new FileOutputStream("src/day18/write.txt");
	         os.write('H');
	         os.write('E');
	         os.write('L');
	         os.write('L');
	         os.write('O');
	         
	         os.write('W');
	         os.write('O');
	         os.write('R');
	         os.write('L');
	         os.write('D');
	         
	         is = new FileInputStream("src/day18/a.jpg");
	         os = new FileOutputStream("src/day18/a_copy.jpg");
	         byte[] buffer = new byte[512];
	         
	         long start = System.currentTimeMillis();
	         System.out.println("이미지 읽기 시작");
	         
	         int read = 0;
	         
	         while ((read = is.read(buffer)) != -1) {
	            os.write(buffer, 0, read);
	         }
	         
	         System.out.println("이미지 읽기 종료");
	         long end = System.currentTimeMillis();
	         
	         double time = (double)(end - start);
	         System.out.println("걸린 시간 >>> " + time);
	         
	      } catch (FileNotFoundException e) {
	         e.printStackTrace();
	      }
	}
