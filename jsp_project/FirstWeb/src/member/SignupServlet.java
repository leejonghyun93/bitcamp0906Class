package member;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SignUp")
public class SignupServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// post 방식으로 데이터를 주고 받을 때 한글 인코딩 처리 필수!!!!!!!
		request.setCharacterEncoding("utf-8");

		// 데이터반기
		String id = request.getParameter("userid");
		String pw = request.getParameter("pw");
		String pwcheck = request.getParameter("pwcheck");
		String username = request.getParameter("username");
		String comment = request.getParameter("comment");
		String gender = request.getParameter("gender");
		String[] interests = request.getParameterValues("interests");

		String byear = request.getParameter("byear");

		System.out.println("userid :" + id);
		System.out.println("pw :" + pw);
		System.out.println("pwcheck :" + pwcheck);
		System.out.println("username :" + username);

		// 응답 하는 데이터의 타입
		// response.setContentType("application/doc; charset=utf-8");
		response.setContentType("text/html; charset=utf-8");

		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>파라미터 데이터 받기</title></head>");
		out.println("  <body>");
		out.println("      <h1>");
		out.println("         userid : " + id + "<br>");
		out.println("         pw : " + pw + "<br>");
		out.println("         username : " + username + "<br>");
		out.println("         comment : " + comment + "<br>");
		out.println("         gender : " + gender + "<br>");

		if (interests != null) {
			for (int i = 0; i < interests.length; i++) {
				out.println("			interest : " + interests[i] + "<br>");
			}
		} else {
			out.println("			interest : 선택된 관심사가 없습니다.<br>");
		}

		out.println("			byear : " + byear + "<br>");
		out.println("         byear : " + byear + "<br>");
		out.println("  </h1>");
		out.println("  </body>");
		out.println("</html>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Post 방식으로 요청 처리!");
		doGet(request, response);
	}
}
