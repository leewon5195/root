package day18;

import java.io.File;

public class File_class_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f = new File("src/day18/a.jpg");
		
		if(f.exists()) {
			
			System.out.println("length:"+f.length());
			System.out.println("CanRead:"+f.canRead());//canRead : 읽기가 가능한지
			System.out.println("getName:"+f.getName()); //파일의 확장명과 이름을 볼수 있다.
			System.out.println("getParent:"+f.getParent());//경로를 복수 있다.
			System.out.println("getPath:"+f.getPath()); //풀 경로를 알수 있다.
		}
	}

}
