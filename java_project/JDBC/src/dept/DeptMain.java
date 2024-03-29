package dept;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class DeptMain {
	public static void main(String[] args) {

		// DeptDao deptDao = new DeptDao();

		// DeptDao.dao = null;

		DeptDao deptDao = DeptDao.getInstance();

		// Calendar c = Calendar.getInstance();

		Connection conn = null;

		List<Dept> list = null;

		try {
			conn = ConnectionProvider.getConnection();

			// 트렌젝션 일의 단위
			conn.setAutoCommit(false); // 트렌젝션의 컨트롤 하겠다!

			// 부서 리스트를 확인
			list = deptDao.selectAllList(conn);

			System.out.println("부서리스트");
			System.out.println("-----------------------");
			for (Dept dept : list) {
				System.out.println(dept);
			}

			System.out.println("---------------------------");

			// 부서 정보 검색 : 부서 번호
			Dept dept = deptDao.selectByDeptno(conn, 10);
			System.out.println("10번 부서 : " + dept);

			// 부서 정보를 입력
			Dept newDept = new Dept(70, "DEV", "SEOUL");

			int insertCnt = deptDao.insertDept(conn, newDept);
			if (insertCnt > 0) {
				System.out.println("부서 정보가 입력되었습니다.");
			} else {
				System.out.println("입력 실패");
			}

			conn.commit(); // 완료

			// System.out.println("입력결과 : " + deptDao.selectByDeptno(conn, 50));

			// System.out.println("-------------------------------");
			// Dept editDept = new Dept(50, "Design", "PUSAN");
			// int editCnt = deptDao.editDept(conn, editDept);
			// if(editCnt>0) {
			// System.out.println("정보가 수정되었습니다.");
			// } else {
			// System.out.println("수정 실패 또는 조건에 맞는 데이터가 존재하지 않습니다.");
			// }
			// System.out.println("수정 결과 : " + deptDao.selectByDeptno(conn, 50));

			// 부서 삭제 : deptno 기준으로 삭제
			// int delCnt = deptDao.deleteDept(conn, 50);
			// System.out.println("삭제 결과 : " + deptDao.selectByDeptno(conn, 50));

		} catch (SQLException e) {

			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

}
