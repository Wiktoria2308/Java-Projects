package servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import connector.DBConnector;
import controllers.AllCustomersDAO;

/**
 * Servlet implementation class showAllCustomers
 */
@WebServlet("/showAllCustomers")
public class showAllCustomersServlet extends HttpServlet {
	
	static Connection con = null;
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			CustomerReg custReg = new CustomerReg();
			
			custReg = AllCustomersDAO.getAllCustomers(custReg);
			
			if(custReg.isEmpty()) {
				System.out.println("Database is empty");
			}
			else {
				HttpSession session = request.getSession(true);
				session.setAttribute("CustomerRegister", custReg);
				response.sendRedirect("allCust.jsp");
				
				
				
			}
		}catch(Exception e) {
			e.getMessage();
		}
		
	}

	

}
