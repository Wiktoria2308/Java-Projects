package servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import connector.DBConnector;

/**
 * Servlet implementation class addCustomerServlet
 */
@WebServlet("/addCustomerServlet")
public class addCustomerServlet extends HttpServlet {
	
	static Connection con = null;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			con = DBConnector.getConnection();
			PreparedStatement st = con.prepareStatement("INSERT INTO Customer VALUES (?,?,?,?,?,?,?,?,?)");
			
			st.setString(1, request.getParameter("firstname"));
			st.setString(2, request.getParameter("lastname"));
			st.setString(3, request.getParameter("email"));
			st.setString(4, request.getParameter("street"));
			st.setString(5, request.getParameter("address"));
			st.setString(6, request.getParameter("city"));
			st.setString(7, request.getParameter("country"));
			st.setString(8, request.getParameter("phone"));
			st.setString(9, request.getParameter("password"));
			
			st.executeUpdate();
			st.close();
			con.close();
			
			System.out.println("Customer added");
			response.sendRedirect("Login.jsp");
			
		}catch(Exception e) {
			e.getMessage();
		}
	}


}
