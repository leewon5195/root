package dbconn;

import java.sql.*;
import java.util.Scanner;

public class DBConnectExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String dbDriver = "org.mariadb.jdbc.Driver"; // 디비 드라이버 설정
		String dbUrl = "jdbc:mariadb://localhost:23306/jdbc"; //디비 URL
		String id = "root"; //계정 이름
		String passwd = "1234";
		Connection conn = null; // 디비실행(CRUD)
		PreparedStatement pstmt = null;
		
		//scanner 선언 : select Rows()
		Scanner scan = new Scanner(System.in);
		try {
			//내부적으로 데이터베이스 드라이버 로드
			Class.forName(dbDriver);
			conn = DriverManager.getConnection(dbUrl,id,passwd); //디비 연결
			
			if(conn !=null) {
				System.out.println("DB 연결 완료");
				
				String query = "select *from jdbc.student_info";
				
				Statement st = conn.createStatement();
				
				ResultSet res = st.executeQuery(query);
				
				while(res.next()) {
					
					System.out.println("학생번호:"+res.getString("std_id"));
					System.out.println("학생이름:"+res.getString("std_name"));
					System.out.println("학생나이:"+res.getInt("std_age"));
					System.out.println("학생학년:"+res.getInt("std_grade"));
					System.out.println("학생성별:"+res.getString("std_gender"));
					System.out.println("학생연락처:"+res.getString("std_phone"));
					
					System.out.println();
				}
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			try {
				
				if(scan!=null) {
					
				}
				if(pstmt!=null) {
					pstmt.close();
				}
				
				if(conn!=null) {
					conn.close();
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}

	}

}
