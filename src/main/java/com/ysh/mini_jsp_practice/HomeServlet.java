package com.ysh.mini_jsp_practice;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String number= request.getParameter("number");  //--> number를 사용자로 부터 받아온다.
		//클라이언트로 부터 sevlet으로 요청이 들어오면 이것을 분석하기 위해 -> request.getParameter사용
		
		int result = Integer.parseInt(number) * 5;
		
		response.setCharacterEncoding("UTF-8");//서블릿 화면에 데이터를 출력하기 위해 .plintln("한글")을 하는데 한들이 깨지지 않기 위한 코드
		response.setContentType("text/html; charset=UTF-8");//--> 브라우저에게 utf-8을 사용한다고 알려주는 코드
		
		PrintWriter write = response.getWriter();
		//요청을 파악 후 클라이언트로 보낼 응답을 작성 해야 한다./응답으로내보낼 출력 스트림을 얻어 후
		
		write.println("<!DOCTYPE html>"
				+ "<html lang='ko'>"
				+ "<head>"
				+ "<meta charset='UTF-8'>"
				+ "<title>servlet</title>"
				+ "<body>"
				+ "<h1>"
				+ "보내주신 숫자에 5를 곱한 결과는"
				+ result
				+ "입니다."
				+ "</h1>"
				+ "</body>"
				+ "</html>");

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
