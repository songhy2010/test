package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.connector.Response;

import com.model.MemberDTO;
import com.model.MessageDAO;



@WebServlet("/DelAllServiceCon")
public class DelAllServiceCon extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		MemberDTO info = (MemberDTO)session.getAttribute("info");
		
		String email = info.getEmail();
		
		MessageDAO dao = new MessageDAO();
		int cnt = dao.DeleteAll(email);
		
		if(cnt>0) {
			System.out.print("전체삭제성공!");
		}else {
			System.out.print("전체삭제실패!");
		}
		response.sendRedirect("main.jsp");
	}

		
	
}
