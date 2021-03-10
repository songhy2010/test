package com.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.MemberDAO;
import com.model.MemberDTO;



@WebServlet("/UpdateServiceCon")
public class UpdateServiceCon extends HttpServlet {




	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		 
		
		
		HttpSession session = request.getSession();
		MemberDTO loginDTO = (MemberDTO)session.getAttribute("info");
		
		
		request.setCharacterEncoding("EUC-KR");
		String email = loginDTO.getEmail();
		String pw =request.getParameter("pw");
		String tel = request.getParameter("tel");
		String addr = request.getParameter("addr");
		
		
		
		MemberDTO info = new MemberDTO(email,pw,tel,addr); //새롭게 변경된 값
		MemberDAO dao = new MemberDAO();
		int cnt = dao.update(info);
		
		
		if(cnt>0) {
			System.out.print("회원정보수정 성공!");
			
			session.setAttribute("info",info);
			response.sendRedirect("main.jsp");
		}else {
			System.out.print("회원정보수정 실패!");
			response.sendRedirect("update.jsp");
		}
		
	}

}
