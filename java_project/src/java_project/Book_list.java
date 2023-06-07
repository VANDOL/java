package java_project;
import java.util.Arrays;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Book_list {
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs;
	Statement stmt;
			

	String url = "jdbc:mysql://localhost/java_db?serverTimezone=Asia/Seoul";
	String dbid = "root";
	String dbpasswd = "1234";		//본인이 설정한 root 계정의 비밀번호를 입력하면 된다.
	
	Book_list() {	//데이터베이스에 연결한다.
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, dbid, dbpasswd);
			System.out.println("MySQL 서버 연동 성공");
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY );
		} catch(Exception e) {
			System.out.println("MySQL 서버 연동 실패 > " + e.toString());
		}
	}

	String[][] Update_book() {
		try {
			rs = stmt.executeQuery("SELECT * from book_list");
			
			int row=0;
			if(rs.last()) {
				row=rs.getRow();
				rs.beforeFirst();
			}
			if(row>0) {
				String[][] contents =new String[row][4];
				int idx=0;
				while(rs.next()) {
					contents[idx][0]=rs.getString("code");
					contents[idx][1]=rs.getString("name");
					contents[idx][2]=rs.getString("write");
					contents[idx][3]=rs.getString("num");
					idx++;
				}
				
				for(int i=0;i<contents.length;i++){
					for(int j=0;j<4;j++) {
						System.out.print(contents[i][j]+" ");
					}
					System.out.print("\n");
				}
				
				return contents;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
