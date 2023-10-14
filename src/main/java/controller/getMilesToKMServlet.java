package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MilesConverter;

/**
 * Servlet implementation class getMilesToKMServlet
 */
@WebServlet("/getMilesToKMServlet")
public class getMilesToKMServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getMilesToKMServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userMiles = request.getParameter("userMiles");
		
		MilesConverter mileConv = new MilesConverter(Float.parseFloat(userMiles));
		
		request.setAttribute("userMileConv", mileConv);
		
		getServletContext().getRequestDispatcher("/mileResult.jsp").forward(request, response);
		
	}

}
