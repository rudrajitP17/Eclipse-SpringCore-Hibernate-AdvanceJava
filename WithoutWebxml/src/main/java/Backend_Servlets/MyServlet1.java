package Backend_Servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class MyServlet1 extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest Request, HttpServletResponse Response) throws ServletException, IOException {
		System.out.println("I am inside My Servlet");
	}
}
