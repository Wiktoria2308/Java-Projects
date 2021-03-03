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

/**
 * Servlet implementation class summaryServlet
 */
@WebServlet("/summaryServlet")
public class summaryServlet extends HttpServlet {
  
	static Connection con = null;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			con = DBConnector.getConnection();
			
			Order order = new Order();
			
			String brand = request.getParameter("fullName");
			System.out.println(brand);
			String seats = request.getParameter("seats");
			String luggage = request.getParameter("luggage");
			String doors = request.getParameter("doors");
			String transmission = request.getParameter("transmission");
			String regNr = request.getParameter("regNr");
			String price = request.getParameter("price");
			String firstName = request.getParameter("FirstName");
			String lastName = request.getParameter("LastName");
			String email = request.getParameter("email");
			String dateFrom = request.getParameter("dateFrom");
			String dateTo = request.getParameter("dateTo");
			String city = request.getParameter("city");
			String status = request.getParameter("status");
			
			
			
			PreparedStatement st = con.prepareStatement("INSERT INTO RentACar.Order VALUES (?,?,?,?,?)");
			st.setString(1, request.getParameter("email"));
			st.setString(2, request.getParameter("regNr"));
			st.setString(3, request.getParameter("dateFrom"));
			st.setString(4, request.getParameter("dateTo"));
			st.setString(5, request.getParameter("price"));
			
			st.executeUpdate();
			
			st.close();
			con.close();
			
			order.setBrand(brand);
			order.setCity(city);
			order.setDateFrom(dateFrom);
			order.setDateTo(dateTo);
			order.setDoors(Integer.parseInt(doors));
			order.setEmail(email);
			order.setFirstName(firstName);
			order.setLastName(lastName);
			order.setPrice(Double.parseDouble(price));
			order.setRegNr(regNr);
			order.setSeats(Integer.parseInt(seats));
			order.setTransmission(transmission);
			order.setLuggage(luggage);
			
			if(status.equals("Logged")) {
				HttpSession session = request.getSession(true);
				session.setAttribute("order", order);
				response.sendRedirect("Confirmation.jsp");
			}
			else {
				HttpSession session = request.getSession(true);
				session.setAttribute("order", order);
				response.sendRedirect("LoggedOutConfirmation.jsp");
			}
			
		
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}


}
