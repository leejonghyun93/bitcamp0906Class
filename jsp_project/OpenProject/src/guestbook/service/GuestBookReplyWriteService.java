package guestbook.service;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import guestbook.dao.ReplyDao;
import guestbook.domain.ReplyRequest;
import jdbc.ConnectionProvider;

public class GuestBookReplyWriteService {

	private GuestBookReplyWriteService() {}
	private static GuestBookReplyWriteService service = new GuestBookReplyWriteService();
	public static GuestBookReplyWriteService getInstance() {
		return service;
	}
	
	public int writeRepy(HttpServletRequest request, HttpServletResponse response) {
		
		int resultCnt = 0;
		
		String memberIdx = request.getParameter("memberIdx");
		String guestbookIdx = request.getParameter("guestbookIdx");
		String message = request.getParameter("message");
		
		ReplyRequest replyRequest = new ReplyRequest(Integer.parseInt(memberIdx), Integer.parseInt(guestbookIdx), message);
		
		Connection conn = null;
		
		try {
			conn = ConnectionProvider.getConnection();
			
			resultCnt = ReplyDao.getInstance().insertReply(conn, replyRequest);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		return resultCnt;
		
	}
}