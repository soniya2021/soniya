package DDT.Practice;

import java.io.FileReader;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;
import org.testng.annotations.Test;

/**
 * This class is reading from JSON File 
 * @author Sumanth Reddy
 *
 */

    public class ReadTheDataFromJsonFileTest {
       @Test
    	 public void readTheDataFromJsonFile() throws Throwable
    	
    	 {
    	//step= 1 convert JSON  File into JSON Object
    	FileReader fr = new FileReader(" "+ "");
    	
    	//step= 2 convert JSON File into java object
         JSONParser jp= new JSONParser();
         Object jobj = jp.parse(fr);
         
         //step= 3 read the data from HashMap
         HashMap obj = (HashMap)jobj;
         Object URL = obj.get("url");
         Object USERNAME = obj.get("username");
         Object PASSWORD = obj.get("password");
         System.out.println(URL);
         System.out.println(USERNAME); 
         System.out.println(PASSWORD);
    	 }
    	 }
