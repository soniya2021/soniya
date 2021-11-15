package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class ExecuteUpdate {

  @Test
public void executeUpdate() throws Throwable
{

	//Register the database
	Driver d = new Driver();
    DriverManager.registerDriver(d);
    
    //Connect to database
    Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","root");
    
	//create statement
    Statement stmt = c.createStatement();
    
	//insert the Data
     int res =  stmt.executeUpdate("insert into students_info (regno, firstName, middleName, lastName) values('4', 'jon','bramin', 'r');\r\n"
     		+ "");
     System.out.println(res);
    if(res==1)
    {
    System.out.println("Data  inserted into Table");
    }
    else
    {
    	System.out.println("Data notinserted into Table");
    }
    
}
}
