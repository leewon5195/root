package day18;

import java.net.InetAddress;

public class InetAddress_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("내 컴퓨터 IP 주소::"+local.getHostAddress());
			System.out.println("내 컴퓨터 IP 이름::"+local.getHostName());

			
		}catch(Exception e) {
			
			
		}
		
	}

}
