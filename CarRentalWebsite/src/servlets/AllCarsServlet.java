package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import controllers.AllCarsDAO;

/**
 * Servlet implementation class AllCarsServlet
 */
@WebServlet("/AllCarsServlet")
public class AllCarsServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			CarRegister carReg = new CarRegister();
			carReg = AllCarsDAO.getAllCars(carReg);
			
			if(carReg.isEmpty()) {
				System.out.println("Database is empty");
			}
			else {
				HttpSession session = request.getSession();
				session.setAttribute("AllCars", carReg);
				
				response.sendRedirect("allCars.jsp");
			}
		}catch(Exception e) {
			e.getMessage();
		}
	}


}
