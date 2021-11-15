package TestPractice;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import VTiger.GenericUtil.BaseClass;
@Listeners(VTiger.GenericUtil.ListnerImplements.class)
public class SimpleTest1  extends BaseClass {
	
@Test
public void  CreateOraganiozation() 
{
	System.out.println(10/0);
}

}

