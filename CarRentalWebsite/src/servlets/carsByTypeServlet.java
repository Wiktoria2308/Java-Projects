package servlets;

import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import controllers.AllCarsDAO;
import controllers.carsByTypeDAO;
import java.time.*;

/**
 * Servlet implementation class carsByType
 */
@WebServlet("/carsByTypeServlet")
public class carsByTypeServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			CarRegister carReg = new CarRegister();
			
			
			
			
			String city = request.getParameter("City");
			String dateFrom = request.getParameter("dateFrom");
			String dateTo = request.getParameter("dateTo");
			String source = request.getParameter("source");
			
			LocalDate formattedDateFrom = LocalDate.parse(dateFrom);
			LocalDate formattedDateTo = LocalDate.parse(dateTo);
			
			Period period = Period.between(formattedDateFrom, formattedDateTo);
			int days = period.getDays();
			
			carReg = carsByTypeDAO.getCarsByType(city);
			
			for(Car c : carReg.getCarReg()) {
				c.setDateFrom(dateFrom);
				c.setDateTo(dateTo);
				c.setPrice(c.getPrice() * days);
				
			}
			
			if(carReg.isEmpty()) {
				System.out.println("Database is empty");
			}
			
			else {
				
				if(source.equals("NotLogged")) {
					HttpSession session = request.getSession();
					session.setAttribute("AllCars", carReg);
					response.sendRedirect("carsNotLogged.jsp");
				}
				else {
					HttpSession session = request.getSession();
					session.setAttribute("AllCars", carReg);
					response.sendRedirect("Car.jsp");
				}
				
				
			}
		}catch(Exception e) {
			e.getMessage();
		}
	}

	
}
