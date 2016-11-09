package _03.attribute;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/checkControlAttributeServlet")
public class CheckControlAttributeServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		ServletContext context = getServletContext();
		
		Integer contextAttribute = (Integer) context.getAttribute("contextAttribute");
		String contextAttribute2 = (String) context.getAttribute("contextAttribute2");
		int[] contextAttribute3 = (int[]) context.getAttribute("contextArray");
		
		System.out.println(contextAttribute);
		System.out.println(contextAttribute2);
		
		for (int number : contextAttribute3) {
			System.out.print(number + " ");
		}

		}
	}
