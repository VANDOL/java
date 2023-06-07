package java_project;
import java.sql.*;

public class Update_user {
	Connection con = null;
	PreparedStatement ps = null;
	int insertCount = 0;
	String url = "jdbc:mysql://localhost/java_db?serverTimezone=Asia/Seoul";
	String dbid = "root";
	String dbpasswd = "1234";		//본인이 설정한 root 계정의 비밀번호를 입력하면 된다.
	
	Update_user() {	//데이터베이스에 연결한다.
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, dbid, dbpasswd);
			System.out.println("MySQL 서버 연동 성공");
		} catch(Exception e) {
			System.out.println("MySQL 서버 연동 실패 > " + e.toString());
		}
	}

	void Update(String _i,String _p,String _n,int _b,int _s) {	//데이터베이스에 연결한다.
		String id = _i;
		String pw = _p;
		String name = _n;
		int birth = _b;
		int sex = _s;
		
		String sql = "INSERT INTO user_db (user_id,user_pw,user_name,user_birth,user_sex,admin) VALUES ('"+id+"','"+pw+"','"+name+"',"+birth+","+sex+","+0+");";
		System.out.println(sql);
		try {
			ps = con.prepareStatement(sql);
			insertCount = ps.executeUpdate();
			System.out.println("업데이트 성공");
		} catch(Exception e) {
			System.out.println("로그인 실패 > " + e.toString());
		}
	}
}