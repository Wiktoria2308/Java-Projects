package servlets;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import controllers.AllBookingsDAO;

/**
 * Servlet implementation class addCarServlet
 */
@WebServlet("/searchCarServlet")
public class searchCarServlet extends HttpServlet {
	
	static Connection con = null;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			CarRegister carReg = new CarRegister();
			
			String type = request.getParameter("type");
			String dateFrom = request.getParameter("dateFrom");
			String dateTo = request.getParameter("dateTo");
			Booking booking = new Booking(type, dateFrom, dateTo);
			
			carReg = AllBookingsDAO.getNotBooked(booking);
			
			if(carReg.isEmpty()) {
				System.out.println("Database is empty");
			}
			else {
				HttpSession session = request.getSession(true);
				session.setAttribute("AllCars", carReg);
				response.sendRedirect("allCars.jsp");		
			}
		}catch(Exception e) {
			e.getMessage();
		}
	}
}
