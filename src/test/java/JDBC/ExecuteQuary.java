package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.testng.annotations.Test;

//import com.mysql.jdbc.Driver;

import com.mysql.cj.jdbc.Driver;

public class ExecuteQuary {

	
	@Test
	public void executequeryTest() throws Throwable
	{
 
		//Register the database
		Driver d = new Driver();
	    DriverManager.registerDriver(d);
	    
	    //Connect to database
	    Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","root");
	    
	   
		//create statement
	    Statement stmt = c.createStatement();
	    
		//Execute my quary and will get data
	    ResultSet res =  stmt.executeQuery("select * from students_info;");
	    while(res.next())
	    {
	    System.out.println(res.getInt(1)+" "+res.getString(2)+" "+res.getString(3));
	    }
	}
	}
