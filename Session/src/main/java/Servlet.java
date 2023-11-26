import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Login")
public class Servlet extends HttpServlet 
{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		String s=req.getParameter("name1");
		String e=req.getParameter("email1");
		PrintWriter out=res.getWriter();
		if(s.equals("123") && e.equals("123"))
		{
			HttpSession session=req.getSession();
			session.setAttribute("name_key", "Rudrajit");
			RequestDispatcher rd=req.getRequestDispatcher("/Profile.jsp");
			rd.forward(req, res);
		}
		else
		{
			res.setContentType("text/html");
			out.print("<h3 style='color:red'>Email and Password didn't match</h3>");
			RequestDispatcher rd=req.getRequestDispatcher("/index.html");
			rd.include(req, res);
		}
	}
}
