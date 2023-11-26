package Jdbc;

import java.sql.*;
import java.sql.DriverManager;

public class Jdbc_First {

	public static void main(String[] args)throws Exception 
	{ 
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "@Aparna123");
		PreparedStatement ps= con.prepareStatement("insert into register values('Fudra','123@abc.com','123','M','Fol')");
		int i=ps.executeUpdate();
		if(i>0)
			System.out.println("Success");
		else
			System.out.println("Failed");
	}

}
