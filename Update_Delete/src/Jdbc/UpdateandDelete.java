package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateandDelete {

	public static void main(String[] args) throws Exception
	{
		String name="Audra";
		String city="Pune";
		String name1="Tudra";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "@Aparna123");
		PreparedStatement ps=con.prepareStatement("update register set city=? where name=?");
		ps.setString(1, city);
		ps.setString(2, name);
		int i=ps.executeUpdate();
		if(i>=0)
			System.out.println("Success");
		else
			System.out.println("Failed");
		ps=con.prepareStatement("delete from register where name=?");
		ps.setString(1, name1);
		i=ps.executeUpdate();
		if(i>=0)
			System.out.println("Success");
		else
			System.out.println("Failed");
	}

}
