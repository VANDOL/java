package java_project;
import java.sql.*;

public class UserDAO {
	Connection con = null;
	Statement stmt = null;
	String url = "jdbc:mysql://localhost/java_db?serverTimezone=Asia/Seoul";
	String dbid = "root";
	String dbpasswd = "1234";		//본인이 설정한 root 계정의 비밀번호를 입력하면 된다.
	
	UserDAO() {	//데이터베이스에 연결한다.
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, dbid, dbpasswd);
			stmt = con.createStatement();
			System.out.println("MySQL 서버 연동 성공");
		} catch(Exception e) {
			System.out.println("MySQL 서버 연동 실패 > " + e.toString());
		}
	}

	/* 로그인 정보를 확인 */
	boolean logincheck(String _i, String _p) {
		boolean flag = false;
		
		String id = _i;
		String pw = _p;
		String checkingStr = "SELECT user_pw FROM user_db WHERE user_id='" + id + "'";
		
		
		try {
			ResultSet result = stmt.executeQuery(checkingStr);
			
			int count = 0;
			while(result.next()) {
				if(pw.equals(result.getString("user_pw"))) {
					flag = true;
					System.out.println("로그인 성공");
				}
				
				else {
					flag = false;
					System.out.println("로그인 실패");
				}
				count++;
			}
		} catch(Exception e) {
			flag = false;
			System.out.println("로그인 실패 > " + e.toString());
		}
		
		return flag;
	}
}