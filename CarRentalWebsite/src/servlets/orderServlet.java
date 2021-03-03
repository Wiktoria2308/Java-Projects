package servlets;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import controllers.orderCarDAO;

/**
 * Servlet implementation class orderServlet
 */
@WebServlet("/orderServlet")
public class orderServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Car car = new Car();
		
		String regNr = request.getParameter("regNr");
		String status = request.getParameter("status");
		String dateFrom = request.getParameter("dateFrom");
		String dateTo = request.getParameter("dateTo");
		String city = request.getParameter("City");
		LocalDate formattedDateFrom = LocalDate.parse(dateFrom);
		LocalDate formattedDateTo = LocalDate.parse(dateTo);
		car.setRegNr(regNr);
		car.setDateFrom(dateFrom);
		car.setDateTo(dateTo);
		
		Period period = Period.between(formattedDateFrom, formattedDateTo);
		int days = period.getDays();
		car = orderCarDAO.getCar(car);
		car.setPrice(car.getPrice() * days);
		
		System.out.println(car.toString());
		
		if(status.equals("Logged")) {
			HttpSession session = request.getSession(true);
			session.setAttribute("orderedCar", car);
			response.sendRedirect("Finalize.jsp");
		}
		else {
			HttpSession session = request.getSession(true);
			session.setAttribute("orderedCar", car);
			response.sendRedirect("LoggedOutFinalize.jsp");
		}
		
		
		
		
		
	}


}
