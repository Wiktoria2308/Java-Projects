package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import controllers.CustomerRegDAO;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	   
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Customer cust = new Customer();
			cust.setEmail(request.getParameter("UserName"));
			cust.setPassword(request.getParameter("Password"));
			cust = CustomerRegDAO.login(cust);
			
			if(cust.isValid()) {
				HttpSession session = request.getSession(true);
				session.setAttribute("currentSessionUser", cust);
				response.sendRedirect("LoggedInHomePage.jsp");
				System.out.println("Working");
			}
			else {
				response.sendRedirect("#");
				System.out.println("Not working");
			}
		}catch(Exception e) {
			e.getMessage();
		}
	}

	

}
