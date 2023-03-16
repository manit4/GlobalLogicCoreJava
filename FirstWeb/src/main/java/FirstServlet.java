
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter writer = response.getWriter();

		writer.println("<html><body>I am sending respomse from Servlet</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("inside post of FirstServlet and I am updating....");

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String completeName = request.getParameter("cName");
		String email = request.getParameter("email");

		System.out.println(username + ", " + password + ", " + completeName + ", " + email);

		PrintWriter writer = response.getWriter();

		writer.println("<html><body>Thanks for registering with us...</body></html>");
	}

}
