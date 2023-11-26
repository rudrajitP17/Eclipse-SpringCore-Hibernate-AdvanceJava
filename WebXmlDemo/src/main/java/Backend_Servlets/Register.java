package Backend_Servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Register extends HttpServlet 
{
	@Override
	protected void service(HttpServletRequest Request, HttpServletResponse Response) throws ServletException, IOException 
	{
		System.out.println("I am inside Register");
	}

}
