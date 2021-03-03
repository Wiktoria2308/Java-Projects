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
 * Servlet implementation class addCarServlet
 */
@WebServlet("/addCarServlet")
public class addCarServlet extends HttpServlet {
	
	static Connection con = null;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			con = DBConnector.getConnection();
			
			PreparedStatement stmt = con.prepareStatement("INSERT INTO Cars VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)");
			
			stmt.setString(1, request.getParameter("brand"));
			stmt.setString(2, request.getParameter("model"));
			stmt.setString(3, request.getParameter("regNr"));
			stmt.setString(4, request.getParameter("type"));
			stmt.setInt(5, Integer.valueOf(request.getParameter("seats")));
			stmt.setInt(6, Integer.valueOf(request.getParameter("doors")));
			stmt.setString(7, request.getParameter("transmission"));
			stmt.setString(8, request.getParameter("luggage"));
			stmt.setString(9, request.getParameter("available"));
			stmt.setDouble(10, Double.valueOf(request.getParameter("price")));
			stmt.setString(11, request.getParameter("brand") + " " + request.getParameter("model"));
			if(request.getParameter("transmission").equalsIgnoreCase("M")) {
				stmt.setString(12, "manual");
			}
			else {
				stmt.setString(12, "automat");
			}
			stmt.setString(13, request.getParameter("city"));
			System.out.println(stmt);
			stmt.executeUpdate();
			
			stmt.close();
			con.close();
			
			System.out.println("Car added");
			response.sendRedirect("addCar.jsp");
			
		}catch(Exception e) {
			e.getMessage();
		}
	}


}
