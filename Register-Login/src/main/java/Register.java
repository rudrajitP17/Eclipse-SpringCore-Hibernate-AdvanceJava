import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/RegForm")
public class Register extends HttpServlet 
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String myname=req.getParameter("name1");
		String myemail=req.getParameter("email1");
		String mycity=req.getParameter("city1");
		String mypass=req.getParameter("pass1");
		String mygender=req.getParameter("gender1");
		PrintWriter out=resp.getWriter();
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Reg_db","root","@Aparna123");
			PreparedStatement ps=con.prepareStatement("insert into register values(?,?,?,?,?)");
			ps.setString(1, myname);
			ps.setString(2, myemail);
			ps.setString(3, mycity);
			ps.setString(4, mypass);
			ps.setString(5, mygender);
			int c=ps.executeUpdate();
			if(c>0)
			{
				resp.setContentType("text/html");
				out.print("<h3 style='color:green'>User Registered Successfully</h3>");
				RequestDispatcher rd=req.getRequestDispatcher("/Register,jsp.jsp");
				rd.include(req, resp);
			}
			else
			{
				resp.setContentType("text/html");
				out.print("<h3 style='color:red'>User Registered unsuccessfull</h3>");
				RequestDispatcher rd=req.getRequestDispatcher("/Register,jsp.jsp");
				rd.include(req, resp);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			resp.setContentType("text/html");
			out.print("<h3 style='color:red'>"+e.getMessage()+"</h3>");
			RequestDispatcher rd=req.getRequestDispatcher("/Register,jsp.jsp");
			rd.include(req, resp);
			
		}
	}
}
