package Jdbc;

import java.sql.*;
import java.sql.DriverManager;

public class Select {

	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","@Aparna123");
		PreparedStatement ps=con.prepareStatement("Select * from register");
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			String name=rs.getString("name");
			String email=rs.getString("email");
			String city=rs.getString("city");
			String gender=rs.getString("gender");
			String password=rs.getString("password");
			System.out.print(name+" "+email+" "+city+" "+gender+" "+password);
			System.out.println();
		}
	}

}
