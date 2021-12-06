package member;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SignupServlet")
public class SignupServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String id = request.getParameter("userid");
		String pw = request.getParameter("pw");
		String pwcheck = request.getParameter("pwcheck");
		String username = request.getParameter("username");
		System.out.println("userid :" + id);
		System.out.println("pw :" + pw);
		System.out.println("pwcheck :" + pwcheck);
		System.out.println("username :" + username);

		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>파라미터 데이터 받기</title></head>");
		out.println("  <body>");
		out.println("      <h1>");		
		out.println("         userid : "+ id + "<br>");		
		out.println("         pw : "+  pw + "<br>");			
		out.println("         username : "+ username + "<br>");		
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
