package jdbc;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jdbcTest1 {

	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			// 1. 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. 연결 : Connection
			// String jdbcUr1 = "jdbc:oracle:thin:@[주소]:[포트]:[데이터베이스]";
			String jdbcUr1 = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String pw = "tiger";

			conn = DriverManager.getConnection(jdbcUr1, user, pw);
			System.out.println("데이터베이스 연결 성공!");

			// 3. 작업 : (CURD)
			
			
			
			
			// 4. 종료 : close()
			
			
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 클래스를 찾을수 없습니다.");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("데이터베이스에 연결할 수 없습니다. 연결 실패!");
			e.printStackTrace();
		} finally {
			// rs.close();
			// stmt.close();
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		}
	}
}
