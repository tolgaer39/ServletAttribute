package _03.attribute;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/checkSessionAttributeServlet")
public class CheckSessionAttributeServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		HttpSession session = req.getSession();

		int sessionAttribute = (Integer) session
				.getAttribute("sessionAttribute");
		String sessionAttribute2 = (String) session
				.getAttribute("sessionAttribute2");
		int[] sessionAttribute3 = (int[]) session.getAttribute("sessionArray");

		System.out.println(sessionAttribute);
		System.out.println(sessionAttribute2);

		if (sessionAttribute3 != null) {
			for (int number : sessionAttribute3) {
				System.out.print(number + " ");
			}
		}
	}
}
