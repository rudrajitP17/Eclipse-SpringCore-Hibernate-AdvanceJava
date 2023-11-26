package Backend_Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/aaa")
public class MyServlet2 extends HttpServlet 
{
	protected void service(HttpServletRequest Request, HttpServletResponse Resposne) throws ServletException, IOException 
	{
		String name=Request.getParameter("name1");
		String email=Request.getParameter("email1");
		System.out.println(name+" "+email);
		
		PrintWriter out=Resposne.getWriter();
		out.println(name);
		out.println(email);
	}
}
