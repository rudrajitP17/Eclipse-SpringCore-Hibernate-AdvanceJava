import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Login")
public class Login extends HttpServlet 
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String myname=req.getParameter("name1");
		String mypass=req.getParameter("pass1");
		PrintWriter out=resp.getWriter();
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Reg_db","root","@Aparna123");
			PreparedStatement ps=con.prepareStatement("select * from Register where name=? and passowrd=?");
			ps.setString(1, myname);
			ps.setString(2, mypass);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				HttpSession hs=req.getSession();
				hs.setAttribute("Session_name", myname);
				RequestDispatcher rd=req.getRequestDispatcher("/Profile.jsp");
				rd.include(req, resp);
			}
			else
			{
				resp.setContentType("text/html");
				out.print("<h3 style='color:red'>Email and password didn't match</h3>");
				RequestDispatcher rd=req.getRequestDispatcher("/Login.jsp");
				rd.include(req, resp);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			resp.setContentType("text/html");
			out.print("<h3 style='color:red'>"+e.getMessage()+"</h3>");
			RequestDispatcher rd=req.getRequestDispatcher("/login.jsp");
			rd.include(req, resp);
		}
	}
}
