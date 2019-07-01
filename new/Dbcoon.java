package jdbc;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Dbcoon {

	public static void main(String[] args) 
	{
	  try {
		Class.forName("com.mysql.jdbc.Driver");
		try {
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/corejava"
					,"root","root");
			System.out.println("connected");
			Statement stmt=cn.createStatement();
			String query="insert into emp1 values(1,'ashu',2000)";
			int cnt=stmt.executeUpdate(query);
			ResultSet rs=stmt.executeQuery("select * from emp1");
			
			
			
			while(rs.next())
			{
				System.out.println(rs.getString(2));
			}
			
			/*String s1= "update emp1 set id=100 where name='ashu'";
			int rs1 =stmt.executeUpdate(s1);
			if(rs1!=0)
			{
				System.out.println("updated");
			}*/
			
			
			String s2= "delete from emp1 where id=100";
			
			int rs2 =stmt.executeUpdate(s2);
			if(rs2!=0)
			{
				
				System.out.println("delete");
			}
			
			cn.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  

	}

}
