package _03.attribute;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/contextAttribute")
public class ContextAttributeServlet extends HttpServlet {

	// Attributeler, farkli scopelarda yasayabilen objelerdir.

	// Scopelar;

	// Context - ServletContext
	// Session - HttpSession
	// Request - ServletRequest

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		//setAttribute ile ekliyoruz checkAttribute servletinden get ile de erisim sagliyoruz..
		
		ServletContext context = getServletContext();
		context.setAttribute("contextAttribute", 1000);
		context.setAttribute("contextAttribute2", "context value");
		
		int[] numbers = { 1, 2, 3, 4, 5, 6 };
		context.setAttribute("contextArray", numbers);
		
		
		
		
	}
	
}
