package com.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.MemberDAO;
import com.model.MemberDTO;


@WebServlet("/JoinServiceCon")
public class JoinServiceCon extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("EUC-KR");
		String email = request.getParameter("email");
		String pw = request.getParameter("pw");
		String tel = request.getParameter("tel");
		String addr = request.getParameter("addr");
		
		MemberDTO dto = new MemberDTO(email,pw,tel,addr);
		MemberDAO dao = new MemberDAO();
		int cnt = dao.join(dto);
		
		if(cnt > 0) {
			System.out.print("회원가입성공!");
			HttpSession session = request.getSession();
			session.setAttribute("id", email);
			response.sendRedirect("join_success.jsp");
		}else {
			System.out.print("회원가입실패!");
			response.sendRedirect("main.jsp");
		}
		
	}

}
