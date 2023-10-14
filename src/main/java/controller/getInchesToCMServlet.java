package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.InchesConverter;

/**
 * Servlet implementation class getInchesToCMServlet
 */
@WebServlet("/getInchesToCMServlet")
public class getInchesToCMServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getInchesToCMServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userInches = request.getParameter("userInches");
		
		InchesConverter inchConv = new InchesConverter(Integer.parseInt(userInches));
		
		request.setAttribute("userInchConv", inchConv);
		
		getServletContext().getRequestDispatcher("/inchResult.jsp").forward(request, response);
		
	}

}
