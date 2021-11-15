package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class VerifyTheTableTest {
	@Test 
	public void verifyTheTableTest() throws Throwable 
	{
	String ExpectedData= "sam";
	Driver d = new Driver();
	DriverManager.registerDriver(d);
	
	Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","root");
	Statement stmt = c.createStatement();
	    
     ResultSet res = stmt.executeQuery(" select firstname from students_info where firstname='sam';");
     while(res.next())
     {
     String ActualData= res.getString(1);
     if(ActualData.equals(ExpectedData)) 
     {   	 
     System.out.println(ExpectedData+" is present");   
     }
	}
     c.close();
	}
}


