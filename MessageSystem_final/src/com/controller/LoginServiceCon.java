package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.MemberDAO;
import com.model.MemberDTO;


@WebServlet("/LoginServiceCon")
public class LoginServiceCon extends HttpServlet {
	

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String email = request.getParameter("email");
		String pw = request.getParameter("pw");
		
		MemberDTO dto = new MemberDTO(email,pw);
		MemberDAO dao = new MemberDAO();
		MemberDTO loginDTO = dao.login(dto);
		
		if(loginDTO != null) {
			System.out.print("로그인성공");
			
			HttpSession session = request.getSession();
			session.setAttribute("info", loginDTO);
		}else {
			System.out.print("로그인실패");
		}
		response.sendRedirect("main.jsp");
		
	}

}
