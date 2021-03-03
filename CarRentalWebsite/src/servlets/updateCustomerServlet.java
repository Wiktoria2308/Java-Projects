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
 * Servlet implementation class updateUserServlet
 */
@WebServlet("/updateUserServlet")
public class updateCustomerServlet extends HttpServlet {
	
	private static final String sqlUpdate = "UPDATE Customer SET firstName=?, lastName=?, email=?, address1=?, address2=?, city=?, country=?, phone=?, password=? WHERE email=?";
	static Connection con = null;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			con = DBConnector.getConnection();
			
			PreparedStatement st = con.prepareStatement(sqlUpdate);
			
			st.setString(1, request.getParameter("fname"));
			st.setString(2, request.getParameter("lname"));
			st.setString(3, request.getParameter("email"));
			st.setString(4, request.getParameter("address1"));
			st.setString(5, request.getParameter("address2"));
			st.setString(6, request.getParameter("city"));
			st.setString(7, request.getParameter("country"));
			st.setString(8, request.getParameter("phone"));
			st.setString(9, request.getParameter("password"));
			
			st.executeUpdate();
			st.close();
			con.close();
			
			System.out.println("Customer details updated");
		}catch(Exception e) {
			e.getMessage();
		}
	}


}
