package com.luv2code.testdb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;

/**
 * Servlet implementation class TestDbServelt
 */
@WebServlet("/TestDbServelt")
public class TestDbServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//set up connection variables
//		String usr ="springstudent"; 
//		String pw = "springstudent";
		String usr ="root"; 
		String pw = "Chinthanie1995#";
		String jdbcUrl1="jdbc:mysql://localhost:3306/web_customer_tracker";
		String driver= "com.mysql.jdbc.Driver";
		
		//get connection to database
		try {
			PrintWriter out= response.getWriter();
			out.println("connecting to database :"+ jdbcUrl1);
			Class.forName(driver);
			Connection myCon = DriverManager.getConnection(jdbcUrl1, usr, pw);
			System.out.println("connection successful");
			myCon.close();
			
		}catch(Exception e){
			e.printStackTrace();
			throw new ServletException(e);
			
		}
	}

}
