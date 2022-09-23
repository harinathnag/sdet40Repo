package Practice;

import org.testng.annotations.Test;

public class Sample1 {
	
	@Test(groups = "regression")
	public void step1Test()
	{
		String browser = System.getProperty("b");
		String url = System.getProperty("u");
		
		System.out.println("browser name is ******>>>>>  "+browser);
		System.out.println("url is ******>>>>>  "+url);
		
	
		
	}
	
	
         
}
