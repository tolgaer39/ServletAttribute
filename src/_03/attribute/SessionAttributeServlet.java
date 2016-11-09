package _03.attribute;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sessionAttribute")
public class SessionAttributeServlet extends HttpServlet {

	// Attributeler, farkli scopelarda yasayabilen objelerdir.
	// Scopelar;
	// Context - ServletContext publictir cok tercih edilmez.
	// Session - HttpSession  --farklý sessiondan ulaþamayýz.
	// Request - ServletRequest  --tek bir requestte geçerlidir. requestdispatcher yaklaþýmýyla karþýlýcaz... Ayrýca SpringMvc de kullanýlýr.

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		//setAttribute ile ekliyoruz checkAttribute servletinden get ile de erisim sagliyoruz..
		
		HttpSession session = req.getSession();

		session.setAttribute("sessionAttribute", 1000);
		session.setAttribute("sessionAttribute2", "sessionAttribute value");

		int[] numbers = { 1, 2, 3, 4, 5, 6 };
		session.setAttribute("sessionArray", numbers);

	}
}
