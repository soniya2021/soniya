package VTiger.GenericUtil;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;
import org.junit.Test;

public class JSONFileUtility {

	@Test
	public String jsonFileUtility(String key) throws Throwable {
		{
			FileReader fr = new FileReader("./Data/commondata.json");
			JSONParser jp= new JSONParser();
	         Object jobj = jp.parse(fr);
			  HashMap obj = (HashMap)jobj;
			Object value = obj.get(key);
			return (String) value;
			
		}
		
	}
	
	
}
