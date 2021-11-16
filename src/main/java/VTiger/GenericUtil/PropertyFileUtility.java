package VTiger.GenericUtil;

import java.io.FileInputStream;
import java.util.Properties;

import org.junit.Test;

public class PropertyFileUtility {
@Test
public String propertyFileUtility(String key) throws Throwable {
	FileInputStream fs = new FileInputStream("./Data/commonData.properties");
	Properties p= new Properties();
	p.load(fs);
	String value = p.getProperty(key);
	return value;
	
}
}
